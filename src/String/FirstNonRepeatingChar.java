package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public int firstUniqChar(String s) {
        // int -> 0, Integer -> null
        char ch[] = s.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(ch[i],mp.getOrDefault(ch[i],0)+1);
        }
        // l->1 - 512
        // e-> 2 - 210
        // t->1

        // hashing
        // list- sorted
        // map, set -

        for(int i=0;i<s.length();i++){
            if(mp.get(ch[i])==1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNonRepeatingChar ls = new FirstNonRepeatingChar();
        int str = ls.firstUniqChar("loveleetcode");
        System.out.println(str);

    }
}
