package hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPAttern {

    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> mp = new HashMap<>();
        Map<String, Character> backMap = new HashMap<>();
        char cp[] = pattern.toCharArray();
        String words[] = s.split(" ");

            if(cp.length!=words.length){
            return false;
        }

            for(int i=0;i<pattern.length();i++){
            if(mp.containsKey(cp[i])){
                if(!mp.get(cp[i]).equals(words[i])){
                    return false;
                }
            }
            if(backMap.containsKey(words[i])) {
                if(!backMap.get(words[i]).equals(cp[i])) {
                    return false;
                }
            }
            mp.put(cp[i],words[i]);
            backMap.put(words[i], cp[i]);
        }
           return true;
    }

    public static void main(String[] args) {
        WordPAttern wp = new WordPAttern();
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wp.wordPattern(pattern,s));
    }
}