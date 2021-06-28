package java8;

import java.util.Optional;
import java.util.function.Function;


// cmd + n - generate methods
public class OptionalPractice {
    public static void main(String[] args) {
        String s= null;
        s = "123";

        if(s != null) {
             s = s + "456";
        }

        A a = new A();
        if(a != null && a.b != null && a.b.c != null) {
            System.out.println(a.b.c.height);
        }

        System.out.println(Optional.ofNullable(a).map(a1 -> a1.b).map(b1 -> b1.c).map(c -> c.height).orElse(null));

        System.out.println(Optional.ofNullable(a));
//        System.out.println(s);
    }

    public static class A {
        B b;

        @Override
        public String toString() {
            return "A{" +
                    "b=" + b +
                    '}';
        }
    }

    public static class B {
        C c;

        @Override
        public String toString() {
            return "B{" +
                    "c=" + c +
                    '}';
        }
    }

    public static class C {
        int height;


        @Override
        public String toString() {
            return "C{" +
                    "height=" + height +
                    '}';
        }
    }
}
