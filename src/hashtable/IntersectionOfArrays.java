package hashtable;

import java.util.*;

public class IntersectionOfArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> firstMap = new HashMap<>();
        Map<Integer, Integer> finalMap = new HashMap<>();

        for(int num1:nums1){
            firstMap.put(num1,firstMap.getOrDefault(num1,0)+1);
        }

        for(int num2:nums2){
            if(!firstMap.containsKey(num2)) {
                continue;
            }
            if(firstMap.get(num2)> finalMap.getOrDefault(num2,0)) {
                finalMap.put(num2, finalMap.getOrDefault(num2,0)+1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: finalMap.entrySet()) {
            for(int i=0; i<entry.getValue();i++) {
                result.add(entry.getKey());
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        IntersectionOfArrays ad = new IntersectionOfArrays();
        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};
       int[] finalArray = ad.intersect(nums1,nums2);
        System.out.println(Arrays.toString(finalArray));
    }
}
