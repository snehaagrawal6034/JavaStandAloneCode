package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> twoSum = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if(twoSum.containsKey(complement))
//                return new int[]{
//                        i,twoSum.get(complement)
//            };
//            twoSum.put(nums[i],i);
//        }
//        return null;

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(list.contains(complement)){
                return new int[]{i,list.indexOf(complement)};
            } else{
                list.add(nums[i]);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = new int[]{2,3,5};
        ts.twoSum(nums,8);
    }
}
