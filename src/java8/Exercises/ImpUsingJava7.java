package java8.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImpUsingJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("G","H",40),
                new Person("A","B",10),
                new Person("C","D",20),
                new Person("E","F",30),
                new Person("I","J",50)
        );

//        1.sort list by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

//        2. create a method which implements all elements in a list
        printAll(people);

//        3. print last name beginning with F
        Condition condition = new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("F");
            }
        };
        printConditionally(people, condition);

    }

    private static void printConditionally(List<Person> people, Condition cond) {
        for(Person p:people){
            if(cond.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }
    }
}

@FunctionalInterface
interface Condition {
    boolean test(Person p);
}
