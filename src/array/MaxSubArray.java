package array;

public class MaxSubArray {

        public int maxSubArray(int[] nums) {

            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int num : nums){
                sum = sum + num ;
                max = Math.max(sum, max);

                if(sum<0){
                    sum = 0;
                }
            }
            return max;
        }

    public static void main(String[] args) {
        MaxSubArray msa = new MaxSubArray();
        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println( msa.maxSubArray(nums));
    }
    }
