package janchy.form.run;

import janchy.form.person.view.FormView;

public class Run {
    public static void main(String[] args) {
        new FormView().menu();   // 메뉴: 1) 참여 신청하기  2) 참여 확인하기
        // 각 플로우 종료 후 프로그램 종료. 재실행 시 다시 메뉴 출력.
    }
}
