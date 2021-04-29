package array;

public class RemoveDupArray {

    public int removeDuplicates(int[] nums) {
        int finalLength = nums.length;
        for (int i = 0; i < finalLength; i++) {
            if (nums[i+1] == nums[i]) {
                for (int k = i+1; k <nums.length-1; k++) {
                    nums[k] = nums[k+1];
                }
                nums[finalLength - 1] = 0;
                finalLength--;
            }
            if (nums[i] == nums[i+1]) {
                i--;
            }
        }
        return finalLength;
    }

    public static void main(String[] args) {
        RemoveDupArray ad = new RemoveDupArray();
        int[] nums = new int[]{1,2,3,4,4,4};
        int fc = ad.removeDuplicates(nums);
        for (int i = 0; i < fc; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}

//1,2,3,4,4

