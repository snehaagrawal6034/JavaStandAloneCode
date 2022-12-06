package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparable implements Comparable<PersonComparable> {
    int age;
    String name;
    int height;

    public PersonComparable(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

//    public int getAge() {
//        return age;
//    }

    public static void main(String[] args) {
        List<PersonComparable> ls = new ArrayList<>();
        ls.add(new PersonComparable(1, "Ram", 8));
        ls.add(new PersonComparable(11, "Shyam", 18));
        ls.add(new PersonComparable(1, "Ghanshyam", 81));
        ls.add(new PersonComparable(10, "Ram", 28));
//        ls.forEach(System.out::println);

        Collections.sort(ls);
        System.out.println(ls);
//        ls.forEach(System.out::println);
    }

    @Override
    public int compareTo(PersonComparable o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
