package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uncommonWords {
        public String[] uncommonFromSentences(String A, String B) {

            String finalString = null;
            String s = A.concat(" ").concat(B);
            String[] splited = s.split("\\s+");
            Map<String,Integer> m = new HashMap();

            for(int i=0;i<splited.length;i++){
                if(m.containsKey(splited[i])){
                    m.put(splited[i],m.get(splited[i])+1);
                } else{
                    m.put(splited[i],1);
                }
            }

            List<String> result = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                if(entry.getValue() == 1) {
                    result.add(entry.getKey());
                }
            }
            System.out.println(result);
            return result.toArray(new String[0]);

        }

    public static void main(String[] args) {
        uncommonWords ts = new uncommonWords();
        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";
        ts.uncommonFromSentences(str1,str2);
    }

    }
