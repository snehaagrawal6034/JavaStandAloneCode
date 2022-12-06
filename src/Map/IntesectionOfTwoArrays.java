package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntesectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {

        // map1<int, int> -> value, counter
        // 1-> 1, 2->2
        // map12<int, int>
        // 2-> 2

        // map12 -> 2 {2,2}

        // map12.entryset -> map.value-> \

        Map<Integer, Integer> mp1 = new HashMap<>();
        for (int num : nums1) {
            mp1.put(num, mp1.getOrDefault(num, 0) + 1);
        }

        // 2->2
        // mp12-> 2->2, 1->2
        Map<Integer, Integer> mp12 = new HashMap<>();
        for (int num : nums2) {
            if (!mp1.containsKey(num)) {
                continue;
            }
            mp12.put(num, Math.min(mp12.getOrDefault(num, 0) + 1, mp1.get(num)));
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> es : mp12.entrySet()) {
            for (int i = 0; i < es.getValue(); i++) {
                list.add(es.getKey());
            }
        }
        System.out.println(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        IntesectionOfTwoArrays iota = new IntesectionOfTwoArrays();
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2, 2};
        int[] b = iota.intersect(arr1, arr2);
        for (int i : b) {
            System.out.print(i + "\t");
        }
    }
}
