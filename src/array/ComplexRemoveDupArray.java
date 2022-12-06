package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ComplexRemoveDupArray {
    public int removeDuplicates(int[] nums) {
//        int finalLength = nums.length;
//        for (int i = 0; i < finalLength; i++) {
//            if (nums[i+1] == nums[i]) {
//                for (int k = i+1; k <nums.length-1; k++) {
//                    nums[k] = nums[k+1];
//                }
//                nums[finalLength - 1] = 0;
//                finalLength--;
//                i--;
//            }
//        }
//        return finalLength;
        Set<Integer> lhs = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            lhs.add(nums[i]);
        }
        return lhs.size();
    }

    public static void main(String[] args) {
        ComplexRemoveDupArray ad = new ComplexRemoveDupArray();
        int[] nums = new int[]{1, 2, 3, 4, 4, 4};
        int fc = ad.removeDuplicates(nums);
        for (int i = 0; i < fc; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}

//1,2,3,4,4

