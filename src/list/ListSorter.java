package list;

import java.util.*;

public class ListSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("harshit", 2), new Student("baby", 3), new Student("sneha", 1));
        // I don't know how to compare 3,1
        // you have to tell me how to compare
        // o1, o2 if o1>o2 if compare returns greater than 0. o1-3, o2-1
        System.out.println(Collections.max(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println(o1 + " " + o2);
                return o1.rank - o2.rank;
            }
        }));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.rank - o1.rank;
            }
        });
        System.out.println(students);
    }


    public static class Student {
        private final String name;
        private final int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rank=" + rank +
                    '}';
        }
    }
}
