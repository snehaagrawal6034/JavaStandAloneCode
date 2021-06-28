package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaForEach {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 7);

        //        lambda 1
        list.forEach(
                (n) -> System.out.println(n)
        );

        //        lambda 2 -> another way using method references
        list.forEach(System.out::println);

//        classic way
        for (int i : list) {
            System.out.println(i);
        }
    }
}
