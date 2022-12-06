package java8.lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEach {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5);

        // classic way
        System.out.println("Classic way: ");
        for (int i : list) {
            System.out.print(i+"\t");
        }
        System.out.println();

        // using Anonymous class
        System.out.println("using Anonymous class ");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+"\t");
            }
        });
        System.out.println();

        // lambda style -> here Consumer's accept method is used
        System.out.println("lambda style: ");
        list.forEach(
                (n) -> System.out.print(n+"\t")
        );
        System.out.println();

        // through method references
        System.out.println("method references: ");
        list.forEach(System.out::println);

    }
}