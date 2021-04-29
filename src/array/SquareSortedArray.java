package array;

public class SquareSortedArray {

        public int[] sortSquare(int A[]){
            int B[]=new int[A.length];
            int leftPointer = 0;
            int rightPointer = A.length-1;
            for (int i = A.length-1; i >=0 ; i--) {
                if(Math.abs(A[leftPointer])>A[rightPointer]){
                    B[i]=A[leftPointer]*A[leftPointer];
                    leftPointer++;
                }else{
                    B[i]=A[rightPointer]*A[rightPointer];
                    rightPointer--;
                }
            }
            return B;
        }

    public static void main(String[] args) {
        SquareSortedArray ad = new SquareSortedArray();
        int[] nums = new int[]{-9,-7,-6,-1,0,2,4,7};
        int sorted[] = ad.sortSquare(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + "\t");
        }
    }
}
