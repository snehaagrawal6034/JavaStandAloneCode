public class DiceSum {

    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[4];
    }



    public static void main(String args[]){

        System.out.println(DiceSum.twoSum(new int[]{1, 4, 9, 3, 2, 7, 7, 6, 8}, 10)[1]);

    }
}
