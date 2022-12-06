package String;

public class ImpFIrstLastPos {
    public int[] searchRange(int[] nums, int target) {
        int startIndex = searchRange(nums, target, true);
        int endIndex = searchRange(nums, target, false);
        int[] result = {startIndex, endIndex};

        System.out.println(result[0] + "  " + result[1] + ":result");
        return result;
    }

    public int searchRange(int[] nums, int target, boolean first) {
        int start = 0, end = nums.length-1;
        int indexToFound = -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                indexToFound = mid;
                if(first) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(nums[mid]<target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return indexToFound;
    }

    public static void main(String[] args) {
        ImpFIrstLastPos iflp = new ImpFIrstLastPos();
        int arr[] = {5,7,7,0,8};
        iflp.searchRange(arr,8);
    }

}
