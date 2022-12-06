package java8.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class ImpUsingJava8 {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("G", "H", 40),
                new Person("A", "B", 10),
                new Person("C", "D", 20),
                new Person("E", "F", 30),
                new Person("I", "J", 50)
        );

//        1.sort list by lastName
        // alt (option) + enter
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

//        2. create a method which implements all elements in a list
//        printAll(people);
        printConditionally(people, p -> true);
        printConditionally2(people, p -> true , p -> System.out.println(p));

//        same as above -> method reference
        printConditionally2(people, p -> true , System.out::println);



//        3. print last name beginning with F
        printConditionally(people, (p -> p.getLastName().startsWith("F")));
        printConditionally2(people , p -> p.getLastName().startsWith("J") , p -> System.out.println("using Predicate"));

    }

//    second way to print - using Predicate interface
    private static void printConditionally(List<Person> people, Predicate<Person> pred) {
        for (Person p : people) {
            if (pred.test(p)) {
                System.out.println(p);
            }
        }
    }

//    third way to print - using Consumer interface
    private static void printConditionally2(List<Person> people, Predicate<Person> pred, Consumer<Person> con) {
        for (Person p : people) {
            if (pred.test(p)) {
                con.accept(p);
            }
        }
    }
}

//classic way to print
//    private static void printConditionally(List<Person> people, Condition cond) {
//        for(Person p:people){
//            if(cond.test(p)){
//                System.out.println(p);
//            }
//        }
////    }
//
////    private static void printAll(List<Person> people) {
////        for(Person p:people){
////            System.out.println(p);
////        }
////    }
//}