# Janchy Guest Form (Console)

## 구조
```
src/
  janchy/form/run/Run.java
  janchy/form/person/view/FormView.java
  janchy/form/person/controller/FormController.java
  janchy/form/person/model/vo/Person.java
  janchy/form/person/compare/AscTitle.java
  janchy/form/person/search/FormSearch.java
```

## 빌드 & 실행
```bash
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out janchy.form.run.Run
```

## 시나리오
- 실행 → 메뉴 출력 (1. 참여 신청하기 / 2. 참여 확인하기)
- 참여 신청하기: 이름→성별→나이(음수 불가)→국적(하나만, 쉼표 등 금지)→언어→연락처(int)→참여일정(YYYYMMDD, 8자리) 입력 → "참여 신청이 완료되었습니다" 출력 → 종료
- 참여 확인하기: "이름 혹은 참여 일정을 입력하세요" →
  - 8자리 숫자이면 일정 검색 → 해당 일정 **참가자 수(int만)** 출력 → 종료
  - 그 외는 이름으로 검색 → 존재 시 **모든 정보 라벨과 함께** 출력, 없으면 "검색 결과가 없습니다." → 종료
- 이름/일정 외로 시도 시 → "이름 혹은 참여 일정으로 다시 검색하도록 한다." 출력

## 예외 정책
- try-catch + throw 활용.
- 나이 음수 금지, 국적 복수 입력 금지, 참여 일정은 YYYYMMDD 8자리만 허용.
- 확인하기에서 이름/일정 외 검색 불가, 일정 검색은 정수 카운트만 출력.
