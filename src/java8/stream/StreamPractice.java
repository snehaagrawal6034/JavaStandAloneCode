package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamPractice {

    List<String> s = Arrays.asList("Harshit", "Sneha", "Baby1", "Baby2");
    // ("harshit love sneha", "baby1", "baby2)

    String result1 = s.stream().reduce((string1, string2) -> string1 + " love " + string2).orElse("no love");
    List<Integer> numbers = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8, 9, 1);

    List<Integer> result2 = numbers.stream()
            .filter(number -> number > 5)
            .filter(number -> isEven(number))
            .filter(number -> number < 9)
            .filter(number -> number * 2 > 15)
            .collect(Collectors.toList());

    int result3 = numbers.stream()
            .filter(number -> number > 5)
            .filter(number -> isEven(number))
            .filter(number -> number < 9)
            .filter(number -> number * 2 > 10)
            .findFirst()
            .get();

    private boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public Optional<Integer> sum() {
        // 0, 1,2,3
        // 0+1 = 1
        // 1+2=3
        // 3+3=6

        List<Integer> number = Arrays.asList(2,3,1,1);
        int num = number.stream().reduce((lastComputedSum, nextNumber) -> lastComputedSum * nextNumber).orElse(1);
        System.out.println("Number: " + num);
        return number.stream().reduce((lastComputedResult, nextNumber) -> {
            System.out.println(lastComputedResult + " " + nextNumber);
            return lastComputedResult * nextNumber;
        });
    }

    List<Integer> sumNum = Arrays.asList(1,2,3,4,5);
    int result4 = sumNum.stream().reduce((i1, i2)-> i1+i2).orElse(0);

    public static void main(String args[]) {
        StreamPractice flt = new StreamPractice();
        System.out.println(flt.numbers.stream().sorted().collect(Collectors.toList()));
        System.out.println(flt.sum());
        System.out.println("Result1: " + flt.result1);
        System.out.println("Result2: " + flt.result2);
        System.out.println("Result3: " + flt.result3);
        System.out.println("Result4: " + flt.result4);

        // The removeIf() method of ArrayList is used to remove all of the elements of this ArrayList
        // that satisfies a given predicate filter which is passed as a parameter to the method.

        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));

        // print list
        System.out.print("Remaining Numbers are: "+"\t");
        for (int i : Numbers) {
            System.out.print(i+"\t");
        }
    }
}
