package ImpoCodes;

public class NoneZeroArray {

    public void moveZeroes(int[] nums) {
        int writePointer=0;
        int count=nums.length;
        for (int readPointer = 0; readPointer <count ; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        for (int i = writePointer; i <count ; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        NoneZeroArray ad = new NoneZeroArray();
        int[] nums = new int[]{0,1,0,3,12};
        ad.moveZeroes(nums);
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i] + "\t");
        }
    }
}