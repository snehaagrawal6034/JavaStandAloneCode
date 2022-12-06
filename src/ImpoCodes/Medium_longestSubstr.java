package ImpoCodes;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Medium_longestSubstr {
    Map<Character, Integer> countMap = new HashMap<>();
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0) {
            return 0;
        }
        int start = 0, end = 0;

        char[] chars = s.toCharArray();
        countMap.put(chars[0], 1);
        int min = 0;
        while(end<chars.length) {
            if(hasRepeatedCharacters()) {
                countMap.put(chars[start], countMap.get(chars[start])-1);
                start++;
            } else {
                if(end-start+1>min) {
                    min = end - start+1;
                }
                end++;
                if(end<chars.length) {
                    countMap.put(chars[end], countMap.getOrDefault(chars[end],0)+1);
                }
            }
        }
        return min;
    }

    private boolean hasRepeatedCharacters() {
        for(int value: countMap.values()) {
            if(value>=2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Medium_longestSubstr ls = new Medium_longestSubstr();
        int str=ls.lengthOfLongestSubstring("qwertyiowerk");
        System.out.println(str);

    }
}
    //qwertyiowerk    // length - 8
