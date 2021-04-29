package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inIndex {
        public String[] findRestaurant(String[] list1, String[] list2) {
            List<String> result = new ArrayList<>();
            Map<String, Integer> resultMap = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();

            for(int i=0; i<list2.length; i++) {
                map2.put(list2[i], i);
            }

            int min = Integer.MAX_VALUE;
            for(int i=0; i<list1.length; i++) {
                if(map2.containsKey(list1[i])) {

                    int indexIn2 = map2.get(list1[i]) + i;
                    resultMap.put(list1[i], indexIn2);
                    if(min > indexIn2) {
                        min = indexIn2;
                    }
                }
            }

            for(Map.Entry<String, Integer> entry: resultMap.entrySet()) {
                if(entry.getValue() == min) {
                    result.add(entry.getKey());
                }
            }
            return result.toArray(new String[0]);
//
        }
    }
