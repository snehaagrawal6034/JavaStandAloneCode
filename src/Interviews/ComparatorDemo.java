package Interviews;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorDemo {
    public static String sortSentence(String s) {

        String words[] = s.split(" ");
//        System.out.println(words[0].substring(words[0].length() - 1));
//        Arrays.sort(words);
//        System.out.println(Arrays.toString(words));
        // Arrays.sort(words, new Comparator<String>() {
        //     public int compare(String s1, String s2) {
        //         return Integer.parseInt(s1.substring(s1.length()-1)) - Integer.parseInt(s2.substring(s2.length()-1));
        //     }
        // });

        Arrays.sort(words, Comparator.comparingInt(x->Integer.parseInt(x.substring(x.length()-1))));
        List<String> list = new ArrayList<>();
        for(String s1: words) {

            list.add(s1.substring(0, s1.length()-1));
        }
        return list.stream().collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
//        List<Integer> list = null;
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//
//        List<String> strings = null;
//        Collections.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });



    }
}
