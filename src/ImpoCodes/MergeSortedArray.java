package ImpoCodes;

public class MergeSortedArray {
        public int[] merge(int A[], int m, int B[], int n) {

            int lastIndex= m+n-1;   //5

            for(int i=lastIndex;i>=0 ;i--){
                if(m-1 >= 0 && n-1 >= 0) {
                    if(A[m-1]>B[n-1]){
                        A[i]=A[m-1];
                        m--;
                    }
                    else {
                        A[i]=B[n-1];
                        n--;
                    }
                } else if (n-1>= 0){
                    A[i]=B[n-1];
                    n--;
                }
            }
            print(A);
            return A;
        }

        public static void print(int[] print) {
            for (int i : print) {
                System.out.print(i + "\t");
            }
        }
        public static void main(String[] args) {
            MergeSortedArray ga=new MergeSortedArray();
            int[] a = new int[6];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            ga.merge(a,3,new int[]{4,5,6},3);
        }
    }
