package janchy.form.person.view;

import janchy.form.person.controller.FormController;
import janchy.form.person.model.vo.Person;

import java.util.Scanner;

public class FormView {
    private final Scanner sc = new Scanner(System.in);
    private final FormController controller = new FormController();

    // ====== 메인 메뉴 ======
    public void menu() {
        System.out.println("******* 메뉴 *******");
        System.out.println("1. 참여 신청하기");
        System.out.println("2. 참여 확인하기");
        System.out.print("번호를 선택하세요: ");

        String in = sc.nextLine().trim();
        if ("1".equals(in)) {
            applyOnceAndExit();
        } else if ("2".equals(in)) {
            confirmOnceAndExit();
        } else {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    // ====== 1) 참여 신청 플로우 (한 번 입력하고 종료) ======
    public void applyOnceAndExit() {
        try {
            Person p = collectPersonOnceOrThrow();
            controller.addLast(p);
            System.out.println("참여 신청이 완료되었습니다");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("입력 처리 중 오류가 발생했습니다.");
        }
    }

    // ====== 2) 참여 확인 플로우 (한 번 조회하고 종료) ======
    public void confirmOnceAndExit() {
        try {
            System.out.print("이름 혹은 참여 일정을 입력하세요: ");
            String key = sc.nextLine().trim();

            if (key == null || key.isEmpty()) {
                throw new IllegalArgumentException("이름 혹은 참여 일정으로 다시 검색하도록 한다.");
            }

            if (key.matches("\\d{8}")) {
                int schedule = parseScheduleOrThrow(key);
                int count = controller.countBySchedule(schedule);
                System.out.println(count); // 정수만 출력
            } else {
                if (!isValidNameKey(key)) {
                    throw new IllegalArgumentException("이름 혹은 참여 일정으로 다시 검색하도록 한다.");
                }
                Person found = controller.findByName(key);
                if (found == null) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    printPersonDetail(found); // 모든 필드 라벨 출력
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("조회 처리 중 오류가 발생했습니다.");
        }
    }

    // ====== 상세 출력 ======
    private void printPersonDetail(Person p) {
        System.out.println("====== 참여자 정보 ======");
        System.out.println("이름        : " + p.getName());
        System.out.println("성별        : " + p.getGender());
        System.out.println("나이        : " + p.getAge());
        System.out.println("국적        : " + p.getNationality());
        System.out.println("사용 언어   : " + p.getLanguages());
        System.out.println("연락처(int) : " + p.getContact());
        System.out.println("참여일정(8) : " + p.getSchedule());
    }

    // ====== 입력 수집(1회) with throw ======
    private Person collectPersonOnceOrThrow() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine().trim();

        System.out.print("성별을 입력하세요: ");
        String gender = sc.nextLine().trim();

        int age = readIntNonNegativeOrThrow("나이를 입력하세요(정수, 음수 불가): ");

        String nationality = readSingleNationalityOrThrow();

        System.out.print("사용 가능한 언어를 입력하세요(여러 개면 콤마로 구분): ");
        String languages = sc.nextLine().trim();

        int contact = readIntOnlyOrThrow("연락처를 입력하세요(숫자만): ");

        int schedule = readScheduleYYYYMMDDOrThrow();

        return new Person(name, gender, age, nationality, languages, contact, schedule);
    }

    // ====== validators (throw 활용) ======
    private int readIntNonNegativeOrThrow(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine().trim();
        try {
            int v = Integer.parseInt(s);
            if (v < 0) throw new IllegalArgumentException("나이는 음수 값이 될 수 없습니다.");
            return v;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수를 입력해야 합니다.");
        }
    }

    private String readSingleNationalityOrThrow() {
        System.out.print("국적을 입력하세요(하나만): ");
        String nat = sc.nextLine().trim();
        if (nat.isEmpty())
            throw new IllegalArgumentException("국적은 필수입니다.");
        if (nat.contains(",") || nat.contains("/") || nat.contains("|"))
            throw new IllegalArgumentException("국적은 하나 이상 입력할 수 없다. 쉼표로 구분되지도 않는다.");
        return nat;
    }

    private int readIntOnlyOrThrow(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine().trim();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해야 합니다.");
        }
    }

    private int readScheduleYYYYMMDDOrThrow() {
        System.out.print("참여 일정을 입력하세요(예: 20250831, 8자리 숫자): ");
        String s = sc.nextLine().trim();
        return parseScheduleOrThrow(s);
    }

    private int parseScheduleOrThrow(String s) {
        if (!s.matches("\\d{8}"))
            throw new IllegalArgumentException("참여 일정은 yyyymmdd 외에는 입력할 수 없다.");
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("참여 일정 변환 오류가 발생했습니다.");
        }
    }

    private boolean isValidNameKey(String key) {
        return !key.isEmpty() && !key.matches("\\d{8}");
    }
}
