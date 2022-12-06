package list;

import java.util.*;

public class ListSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("harshit", 3), new Student("baby", 1), new Student("sneha", 2));
        // o1.rank-o2.rank - max/min/ascending sort/ o2.rank-o1.rank - descending sort
        System.out.println("min value " + Collections.min(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) { //o1-baby, o2-harshit
                System.out.println("Values are: " + o1 + " " + o2);
                return Integer.compare(o1.rank, o2.rank); // o1.rank-o2.rank;
            }
        }));
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);


        List<Student> studentsWithSameRank = Arrays.asList(new Student("sneha", 2), new Student("baby", 1), new Student("harshit", 2));
        studentsWithSameRank.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.rank>o2.rank) {
                    return 1;
                } else if(o1.rank<o2.rank) {
                    return -1;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });
        System.out.println(studentsWithSameRank);
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
