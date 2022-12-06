package java8.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapStream {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.stream().map(input -> input * 2).collect(Collectors.toSet()));

        // stream of values
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("sneha", "kumari");
        hashMap.put("harshit", "bangar");

        hashMap.keySet().stream().forEach(s -> System.out.println(s+" "+"Hi I am here"));
        hashMap.values().stream().forEach(s -> System.out.println(s+" "+"Hi I am here"));
//        Consumer c = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        for (String s : hashMap.keySet()) {
//            c.accept(s);
//        }

        //        hashMap.entrySet()
         Set<Map.Entry<String, String>> set1 = hashMap.entrySet();
        System.out.println(set1.stream().map(entry -> entry.getValue()).collect(Collectors.toList()));

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue()+ " "+ "finally I m here");
        }
    }
}
