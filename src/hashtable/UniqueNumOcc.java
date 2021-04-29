package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOcc {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> s = new HashSet<>();
        Map<Integer, Integer> m = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> en : m.entrySet()) {
            if (s.contains(en.getValue())) {
                return false;
            }
            s.add(en.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumOcc ad = new UniqueNumOcc();
        boolean result = ad.uniqueOccurrences(new int[]{1,2,2,1,1,3});
        System.out.print(result);
    }
}
