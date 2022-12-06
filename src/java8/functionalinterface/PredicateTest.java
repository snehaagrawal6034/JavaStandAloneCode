package java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// DI + predicate.
public class PredicateTest {

    public static void main(String[] args) {
        // filter
//        List<String> values = Arrays.asList("1","2","3");
//        System.out.println(values
//                .stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String string) {
//                        return string.length() > 1;
//                    }
//                })
//                .collect(Collectors.toList()));

        List<String> values = Arrays.asList("10","2","3");
        System.out.println(values
                .stream()
                .filter(string -> string.length() > 1)
                .collect(Collectors.toList()));


        List<Integer> list = Arrays.asList(1,2,3);
//        System.out.println(greaterThanK(list, new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 2;
//            }
//        }));

        System.out.println(greaterThanK(list, integer -> integer > 2));
        System.out.println(greaterThanK(list, integer -> integer < 3));
        Predicate<Integer> p = integer -> integer < 3;
        p.and(integer -> integer > 1);
    }

    public static List<Integer> greaterThanK(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if(predicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }
}
