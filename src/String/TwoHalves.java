package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoHalves {
    public boolean halvesAreAlike(String s) {
//        List<Character> chars = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u', 'A','E','I','O','U'});


//        Character[] array = {'a', 'e', 'i', 'o', 'u', 'A','E','I','O','U'};
//        List<Character> chars = Arrays.asList(array);

        List<Character> chars = Stream.of('a', 'e', 'i', 'o', 'u', 'A','E','I','O','U')
                .collect(Collectors.toList());


        int firstHalf = 0;
        int secondhalf = 0;
        char ch[]=s.toCharArray();

        for(int i=0;i<s.length()/2;i++){
            if(chars.contains(ch[i])){
                firstHalf++;
            }
        }

        for(int i=s.length()/2;i<s.length();i++){
            if(chars.contains(ch[i])){
                secondhalf++;
            }
        }

        if(firstHalf==secondhalf){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TwoHalves ls = new TwoHalves();
        boolean bool = ls.halvesAreAlike  ("book");
        System.out.println(bool);
    }
}

