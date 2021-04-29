import static java.lang.Math.max;

public class CallByValue {
        public static void main(String[] args) {
            CallByValue arbit = new CallByValue();
            Container container = new Container();
            container.a =  7;
            container.b = 6;
            arbit.change(container);
            int d = 5;
            arbit.changeInt(d);
            System.out.println(container);
            System.out.println(""+d+"");
        }


        private void change(Container container) {
            container.a = 9;
            container = new Container();
        }

        private void changeInt(int i) {
            i = 7;
        }

        public static class Container {
            private int a;
            private int b;

            @Override
            public String toString() {
                return "Container{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }
        }

    static class MaxConsOnes {
            public int findMaxConsecutiveOnes(int[] nums) {
                int count = 0;
                int max = 0;
                for (int i:nums) {
                    if (i == 1) {
                        count++;
                    } else {
                        if (count > max) {
                            max = count;
                        }
                        if (max >= nums.length/2) {
                            return max;
                        }
                        count=0;
                    }
                }
                return max(max,count);
            }
        public static void main(String[] args) {
            MaxConsOnes ts = new MaxConsOnes();
          int max=ts.findMaxConsecutiveOnes(new int[]{1});
            System.out.println(max);
        }
    }

    static class MergeSortedArray {
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

    public static class NoneZeroArray {

        public void moveZeroes(int[] nums) {
            int writePointer=0;
            int count=nums.length;
            for (int readPointer = 0; readPointer <count ; readPointer++) {
                if (nums[readPointer] != 0) {
                    nums[writePointer] = nums[readPointer];
                    writePointer++;
                }
            }
                for (int i = writePointer; i <count ; i++) {
                    nums[i]=0;
                }
        }

        public static void main(String[] args) {
            NoneZeroArray ad = new NoneZeroArray();
            int[] nums = new int[]{0,1,0,3,12};
            ad.moveZeroes(nums);
            for (int i = 0; i <nums.length ; i++) {
                System.out.println(nums[i] + "\t");
            }
            }
        }
}
