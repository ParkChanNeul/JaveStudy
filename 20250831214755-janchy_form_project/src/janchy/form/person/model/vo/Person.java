package janchy.form.person.model.vo;

import java.util.Objects;

public class Person {
    private String name;        // 이름
    private String gender;      // 성별
    private int age;            // 나이
    private String nationality; // 국적
    private String languages;   // 사용 가능한 언어 (콤마 구분 문자열)
    private int contact;        // 연락처 (과제 스펙: int)
    private int schedule;       // 참여 일정 (YYYYMMDD, 8자리 int)

    public Person() {}

    public Person(String name, String gender, int age,
                  String nationality, String languages,
                  int contact, int schedule) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.languages = languages;
        this.contact = contact;
        this.schedule = schedule;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public String getLanguages() { return languages; }
    public void setLanguages(String languages) { this.languages = languages; }
    public int getContact() { return contact; }
    public void setContact(int contact) { this.contact = contact; }
    public int getSchedule() { return schedule; }
    public void setSchedule(int schedule) { this.schedule = schedule; }

    @Override
    public String toString() {
        return String.format(
            "Person{name='%s', gender='%s', age=%d, nationality='%s', languages='%s', contact=%d, schedule=%d}",
            name, gender, age, nationality, languages, contact, schedule
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
