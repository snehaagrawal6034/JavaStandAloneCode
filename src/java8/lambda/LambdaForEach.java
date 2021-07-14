package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEach {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5);

        // classic way
        for (int i : list) {
            System.out.println(i);
        }

        // using Anonymous class

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // lambda style -> here Consumer's accept method is used
        list.forEach(
                (n) -> System.out.println(n)
        );

        // through method references
        list.forEach(System.out::println);

    }
}