package hashtable;

public class BitsingleNumber {
        public int singleNumber(int[] nums) {
            int finalCalc = 0;
            for(int num: nums) {
                finalCalc = finalCalc^num;
            }
            return finalCalc;
        }
    public static void main(String[] args) {
        BitsingleNumber ad = new BitsingleNumber();
        int[] nums = new int[]{1,1,2,2,2};
        int finalCalc = ad.singleNumber(nums);
        System.out.print(finalCalc);
    }
}
