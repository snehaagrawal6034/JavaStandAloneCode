package java8.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;


//TODO
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };

//        Supplier<Integer> supplier1 = () -> 1;

        Stream.generate(new Supplier<Integer>() {
            private int count = 0;
            @Override
            public Integer get() {
                while(count<10) {
                    count++;
                }
                return count;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println(supplier.get());
    }
}
