package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoHalves {
    public boolean halvesAreAlike(String s) {
        boolean bol = false;
        int len=s.length();
        int halfLength = len/2;
        int odd=0;
        int even=0;
        List<Character> chars = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u', 'A','E','I','O','U'});
        HashSet<Character> set= new HashSet<>(chars);
        for (int i = 0; i <halfLength ; i++) {
            if(set.contains(s.charAt(i))){
                odd+=1;
            }
            if(set.contains(s.charAt(halfLength+i))){
                even+=1;
            }
        }
        if(odd==even){
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

