package String;

import java.util.HashSet;
import java.util.Set;

public class ReplaceAllUQues {
    public String modifyString(String s) {

        char ch[] = s.toCharArray();
        if (s.length() == 1 && s.charAt(0) == '?') {
            return "a";
        }
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '?') {
                Set<Character> set = new HashSet<>();
                if (i==0) {
                    set.add(ch[1]);
                } else if (i==s.length()-1) {
                    set.add(ch[i - 1]);
                } else {
                    set.add(ch[i - 1]);
                    set.add(ch[i + 1]);
                }

                for (int j = 0; j < 26; j++) {
                        char predictedChar = (char)('a'+j);
                        if(set.contains(predictedChar)){
                            continue;
                        }
                        else{
                            ch[i] = predictedChar;
                            break;
                        }
                }
            }

        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        ReplaceAllUQues replaceAllUQues = new ReplaceAllUQues();
        System.out.println(replaceAllUQues.modifyString("??a?a?"));
    }
}
