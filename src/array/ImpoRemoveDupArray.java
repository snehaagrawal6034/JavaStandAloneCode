package array;

public class ImpoRemoveDupArray {

    public int removeDuplicates(int[] nums) {
        if (nums==null) {
            return 0;
        }
        int writePointer=1;
        for (int readPointer = 1; readPointer <nums.length ; readPointer++) {
            if(nums[readPointer]!=nums[readPointer-1]){
                nums[writePointer]=nums[readPointer];
                writePointer++;
            }
        }
        System.out.println("Unique numbers are "+writePointer);
        return writePointer ;
    }

    public static void main(String[] args) {
        ImpoRemoveDupArray ad = new ImpoRemoveDupArray();
        int[] nums = new int[]{-1,0,1,1,2,3,4,4,4};
        int fc = ad.removeDuplicates(nums);
        for (int i = 0; i < fc; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}

