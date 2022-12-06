package array;

import java.util.Arrays;

public class PracticeRightMax {
    public int[] replaceElements(int[] arr) {
        int res[]= new int[arr.length];
        int max= arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {
            res[i]=max;
            max=Math.max(max,arr[i]);
        }
        res[arr.length-1]=-1;

        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        PracticeRightMax ad = new PracticeRightMax();
        int[] nums = new int[]{1, 2, 3, 5, 4, 1, 0};
        int arr[] = ad.replaceElements(nums);
    }
}

