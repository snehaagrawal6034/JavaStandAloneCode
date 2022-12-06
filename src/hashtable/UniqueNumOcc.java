package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOcc {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> s = new HashSet<>();

        for(int val: arr) {
            if (s.contains(val)) {
                return false;
            }
            s.add(val);
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumOcc ad = new UniqueNumOcc();
        boolean result = ad.uniqueOccurrences(new int[]{1,4,3,4});
        System.out.print(result);
    }
}