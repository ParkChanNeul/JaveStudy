package janchy.form.person.search;

import janchy.form.person.model.vo.Person;

import java.util.ArrayList;
import java.util.List;

public class FormSearch {
    public List<Person> filterByNationality(List<Person> source, String nationality) {
        List<Person> result = new ArrayList<>();
        if (source == null || nationality == null) return result;
        for (Person p : source) {
            if (p.getNationality() != null &&
                p.getNationality().equalsIgnoreCase(nationality)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> filterByLanguage(List<Person> source, String language) {
        List<Person> result = new ArrayList<>();
        if (source == null || language == null) return result;
        for (Person p : source) {
            String langs = p.getLanguages();
            if (langs != null && langs.toLowerCase().contains(language.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
