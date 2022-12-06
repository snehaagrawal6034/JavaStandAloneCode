package ImpoCodes;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
        public int longestPalindrome(String s) {
            Map<Character, Integer> charCount = new HashMap<>();
            for(char c: s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0)+1);
            }

            int count = 0;
            boolean oddDetected = false;
            for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {
                if(entry.getValue()%2 == 0) {
                    count = count + entry.getValue();
                }
                if(entry.getValue()%2 == 1) {
                    count = count + (entry.getValue() - 1);
                    oddDetected = true;
                }
            }
            if(oddDetected) {
                count++;
            }
            System.out.println(count);
            return count;
        }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        lp.longestPalindrome("abeccccdd");
    }
}
