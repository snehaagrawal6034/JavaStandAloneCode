package hashtable;

public class singleNumber {
        public int singleNumber(int[] nums) {
            int finalCalc = 0;
            for(int num: nums) {
                finalCalc = finalCalc^num;
            }
            return finalCalc;
        }
    public static void main(String[] args) {
        singleNumber ad = new singleNumber();
        int[] nums = new int[]{1,2,2};
        int finalCalc = ad.singleNumber(nums);
        System.out.print(finalCalc);
    }
}
