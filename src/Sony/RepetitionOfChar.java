package Sony;

import java.util.HashMap;
import java.util.Map;

public class RepetitionOfChar {

    Map<Character, Integer> mp = new HashMap<>();
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        if(s.length()==0){
            return 0;
        }
        char ch[] = s.toCharArray();
        mp.put(ch[0],1);

        while (end<s.length()) {
            if(hasRepeatedChars()){
                mp.put(ch[start],mp.get(ch[start])-1);
                start++;
            } else{
                if(end-start+1>max){
                    max = end-start+1;
                }
                end++;
                if(end<s.length()){
                    mp.put(ch[end],mp.getOrDefault(ch[end],0)+1);
                }
            }
        }
        return max;
    }
    private boolean hasRepeatedChars(){
        for(int value: mp.values()){
            if(value>=2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        RepetitionOfChar rc = new RepetitionOfChar();
        System.out.println(rc.lengthOfLongestSubstring("abcabcbb"));
    }
}