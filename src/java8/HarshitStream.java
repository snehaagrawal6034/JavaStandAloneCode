package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HarshitStream {

    List<Integer> numbers = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8, 9, 1);
//    int result = numbers.stream()
//            .filter(number -> number > 5)
//            .filter(number -> isEven(number))
//            .filter(number -> number < 9)
//            .filter(number -> number * 2 > 15)
//            .findFirst()
//            .get();

    List<Integer> result = numbers.stream()
            .filter(number -> number > 5)
            .filter(number -> isEven(number))
            .filter(number -> number < 9)
            .filter(number -> number * 2 > 15)
            .collect(Collectors.toList());


    private boolean isEven(Integer number) {
        return number%2==0;
    }

    public Optional<Integer> sum() {
        // 0, 1,2,3
        // 0+1 = 1
        // 1+2=3
        // 3+3=6

        List<Integer> number = Arrays.asList();
        number.stream().reduce(1, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer lastComputedSum, Integer nextNumber) {
                return lastComputedSum * nextNumber;
            }
        });
        return number.stream().reduce((lastComputedSum, nextNumber) -> {
            System.out.println(lastComputedSum + " " + nextNumber);
            return lastComputedSum * nextNumber;
        });
    }

    List<String> s = Arrays.asList("Harshit", "Sneha", "Baby");

    String result1 = s.stream().reduce((string1, string2) -> string1 + " love " + string2 ).orElse("no love");


    public static void main(String args[]) {
        HarshitStream flt = new HarshitStream();
        System.out.println(flt.numbers.stream().sorted().collect(Collectors.toList()));
        System.out.println(flt.sum());
        System.out.println(flt.result);
        System.out.println(flt.result1);
    }

}
