package co.edu.uptc.utilities;
import java.util.Comparator;

import co.edu.uptc.pojos.Person;

public class PersonComparator {

    public static Comparator<Person> compName = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }

    };

    public static Comparator<Person> compAge = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

    };

}
