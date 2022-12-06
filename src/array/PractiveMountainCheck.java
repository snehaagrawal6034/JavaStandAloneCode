package array;

public class PractiveMountainCheck {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3 || A == null) {
            return false;
        }
        boolean increasing = A[0] < A[1];
        if (!increasing) return false;
        for (int i = 2; i < A.length; i++) {
            if(A[i-1]==A[i]) return false;
            if (increasing) {
                if (A[i] < A[i - 1]) increasing = false;
            } else {
                if (A[i - 1] < A[i]) return false;
            }
        }
        return !increasing;
    }

    public static void main(String[] args) {
        PractiveMountainCheck ad = new PractiveMountainCheck();
        int[] nums = new int[]{1, 2, 3, 5, 4, 1, 0};
        boolean b = ad.validMountainArray(nums);
        System.out.print(b);

    }
}


