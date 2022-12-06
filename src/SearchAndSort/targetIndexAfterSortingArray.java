package SearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndexAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums); //nlog(n)
        int firstPosition = findFirstOrLastInstance(nums, true, target);
        int lastPosition = findFirstOrLastInstance(nums, false, target);
        List<Integer> result = new ArrayList<>();
        if(firstPosition==-1 || lastPosition==-1) {
            return result;
        }
        for(int i=firstPosition;i<=lastPosition;i++) {
            result.add(i);
        }

        System.out.println(result);
        return result;
    }

    // 1,2,

    private int findFirstOrLastInstance(int[] nums, boolean findFirst, int target) {
        int low = 0;
        int high = nums.length-1;
        int targetFoundIndex = -1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                if(findFirst) {
                    high = mid -1;
                } else {
                    low = mid + 1;
                }
                targetFoundIndex = mid;
            } else if(nums[mid]>target){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return targetFoundIndex;
    }

    public static void main(String[] args) {
        targetIndexAfterSortingArray tiasa = new targetIndexAfterSortingArray();
        int arr[] = {1,2,2,2,3};
        tiasa.targetIndices(arr,2);
    }
}
