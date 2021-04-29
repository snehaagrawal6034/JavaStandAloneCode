package hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPAttern {
        public boolean wordPattern(String pattern, String s) {

            Map m = new HashMap();

            String[] words = s.split(" ");

            if(words.length!=pattern.length()){
                return false;
            }

            for(int i=0;i<words.length;i++){

                char c = pattern.charAt(i);
                if(!m.containsKey(words[i])){
                    m.put(words[i],i);
                }
                if(!m.containsKey(c)){
                    m.put(c,i);
                }
                if(!m.get(c).equals(m.get(words[i]))){
                    return false;
                }
            }

            return true;
        }
    }
