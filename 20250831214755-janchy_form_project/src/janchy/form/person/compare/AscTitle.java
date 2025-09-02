package janchy.form.person.compare;

import janchy.form.person.model.vo.Person;
import java.util.Comparator;

public class AscTitle implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String a = o1.getName() == null ? "" : o1.getName();
        String b = o2.getName() == null ? "" : o2.getName();
        int cmp = a.compareToIgnoreCase(b);
        if (cmp != 0) return cmp;
        String n1 = o1.getNationality() == null ? "" : o1.getNationality();
        String n2 = o2.getNationality() == null ? "" : o2.getNationality();
        return n1.compareToIgnoreCase(n2);
    }
}
