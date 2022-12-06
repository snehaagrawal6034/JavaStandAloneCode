package SearchAndSort;

public class BinarySearch {
    public static int BinarySearch(int A[], int n, int x, boolean smallest) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (x == A[mid]) {
                result = mid;
                if (smallest) {
                    high = mid - 1;
                } else low = mid + 1;
            } else if (x < A[mid])
                high = mid - 1;
            else low = mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int A[] = {4, 5, 6, 6, 6, 6, 6, 8, 9};
        System.out.println(BinarySearch(A, A.length, 6, true));
    }
}
