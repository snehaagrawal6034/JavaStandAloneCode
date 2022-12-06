package Sony;

public class RemoveDuplicates {

    public static int removeDups(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int writePointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int nums[] = {1, 2, 3, 4, 5, 6, 6};
        System.out.println(rd.removeDups(nums));
    }
}
