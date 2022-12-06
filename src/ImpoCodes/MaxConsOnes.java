package ImpoCodes;

import static java.lang.Math.max;

public class MaxConsOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i:nums) {
            if (i == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                if (max >= nums.length/2) {
                    return max;
                }
                count=0;
            }
        }
        return max(max,count);
    }
    public static void main(String[] args) {
        MaxConsOnes ts = new MaxConsOnes();
        int max=ts.findMaxConsecutiveOnes(new int[]{1,12,1,6,7,1,1});
        System.out.println(max);
    }
}
