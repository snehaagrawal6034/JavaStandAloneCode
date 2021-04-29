package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorse {
    public int uniqueMorseRepresentations(String[] words) {

        Set<String> s = new HashSet<String>();
        for (String word : words) {
            s.add(morseCode(word));
        }
        return s.size();
    }

    private String morseCode(String input) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            sb.append(morse[ch - 'a']);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UniqueMorse ls = new UniqueMorse();
        String[] words = {"gin", "zen", "gig", "msg"};
        int umc = ls.uniqueMorseRepresentations(words);
        System.out.println(umc);
    }
}
