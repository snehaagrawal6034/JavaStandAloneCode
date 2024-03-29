package array;

public class ImpoParityCheck {

        public int[] parityCheck(int A[]){
            int j = 0;
            int B[]=new int[A.length];
            for (int i = 0; i <A.length ; i++) {
                if(A[i]%2==0){
                    B[j]=A[i];
                    j++;
                }
            }
            for (int i = 0; i <A.length ; i++) {
                if(A[i]%2!=0){
                    B[j]=A[i];
                    j++;
                }
            }
            return B;
        }

    public static void main(String[] args) {
        ImpoParityCheck ad = new ImpoParityCheck();
        int[] nums = new int[]{1,2,3,4,4,4,6};
        int parity[] = ad.parityCheck(nums);
        for (int i = 0; i < parity.length; i++) {
            System.out.print(parity[i] + "\t");
        }
    }
}
