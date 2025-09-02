package janchy.form.person.controller;

import janchy.form.person.compare.AscTitle;
import janchy.form.person.model.vo.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormController {
    private final List<Person> list = new ArrayList<>();

    public int addLast(Person p) {
        if (p == null) return 0;
        list.add(p);
        return 1;
    }

    public List<Person> getAll() {
        return new ArrayList<>(list);
    }

    public Person findByName(String name) {
        if (name == null) return null;
        for (Person p : list) {
            if (name.equalsIgnoreCase(p.getName())) return p;
        }
        return null;
    }

    public int countBySchedule(int schedule) {
        int cnt = 0;
        for (Person p : list) {
            if (p.getSchedule() == schedule) cnt++;
        }
        return cnt;
    }

    public int sortByNameAsc() {
        Collections.sort(list, new AscTitle());
        return 1;
    }
}
