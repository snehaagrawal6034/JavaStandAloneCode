package Comparator;

import Comparator.internal.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonComparator {

    // non static variable - personComparator, static variable - PERSON_COMPARATOR
    // static object        class
//    private static final Comparator<Person> PERSON_COMPARATOR = (o1, o2) -> {
//        if(o1.getAge() > o2.getAge()){
//            return 1;
//        }
//        else if(o1.getAge() < o2.getAge()){
//            return -1;
//        }
//        else {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
    // static inner class
    public static class PersonComparator1 implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }
            else if(o1.getAge() < o2.getAge()){
                return -1;
            }
            else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Person> ls = new ArrayList<>();
//        new PersonComparator1().compare();
//        PERSON_COMPARATOR.compare();
        ls.add(new Person(1,"Ram",8));
        ls.add(new Person(11,"Shyam",18));
        ls.add(new Person(1,"Ghanshyam",81));
        ls.add(new Person(10,"Ram",28));
//        ls.forEach(System.out::println);

//        Collections.sort(ls, PERSON_COMPARATOR);
        Collections.sort(ls, new PersonComparator1());
        System.out.println(ls.toString());
    }
}
