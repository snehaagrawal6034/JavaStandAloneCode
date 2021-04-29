import java.util.HashSet;

public class longestSubstr {

    public int lenSubstr(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        HashSet<Character> hs = new HashSet<>();
        int res = 1;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (!hs.contains(c)) {
                hs.add(c);
                res = Math.max(res, hs.size());
            } else {
                while (i < j) {
                    if (s.charAt(i) == c) {
                        i++;
                        break;
                    }
                    hs.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        longestSubstr ls = new longestSubstr();
        int str=ls.lenSubstr("qwertyiowerk");
        System.out.println(str);

    }
}
    //qwererdfdaweqw    // length - 7
