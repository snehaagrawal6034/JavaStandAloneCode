package array;

public class PivotElement {
    public int pivotIndex(int[] nums) {
    int sum = 0;
    int leftSum = 0;

    for(int i=0;i<nums.length;i++){
        sum = sum+nums[i];
    }

    // ABC P DEF
    // A+B+C = D+E+F;
    // leftSum+P+leftSum = sum
    for(int i=0;i<nums.length;i++){
        if((2*leftSum+nums[i]) == sum) {
            return i;
        }
        leftSum = leftSum + nums[i];
    }
       return -1;
}
}
