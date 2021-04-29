package String;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public int firstUniqChar(String s) {
        // int -> 0, Integer -> null
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.get(ch) == null) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, hm.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.get(ch) == 1) {
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
