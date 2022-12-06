package hashtable;

import java.util.HashMap;
import java.util.Map;

public class AlienDict {
    public boolean isAlienSorted(String[] words, String order) {
        // cur - hello1, next - hello
        // TC - m*n

        Map<Character,Integer> dict = new HashMap<>();
        for(int i=0;i<order.length();i++){
            dict.put(order.charAt(i),i);
        }

        for(int i=0;i<words.length-1;i++){
            String currentWord = words[i];
            String nextWord = words[i+1];

            if(!currentWord.equals(nextWord) && currentWord.startsWith(nextWord)){
                return false;
            }
            for(int j=0;j<Math.min(currentWord.length(),nextWord.length());j++){
                if(dict.get(currentWord.charAt(j))>dict.get(nextWord.charAt(j))){
                    return false;
                } else if(dict.get(currentWord.charAt(j))<dict.get(nextWord.charAt(j))){
                    break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AlienDict ad = new AlienDict();
        String []words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(ad.isAlienSorted(words,order));
    }
}