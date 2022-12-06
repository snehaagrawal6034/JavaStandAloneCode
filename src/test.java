import java.util.Arrays;

public class test {

    //Even number findings
    public int findEvenNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Sorting squares of number
    public int[] sortedSquares(int[] A) {

        if(A.length==0){
            return null;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    //print length of an array
    public int[] printLength(){
        int[] intArray = new int[6];
        int length = 0;

        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        System.out.println(length);
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static void main(String[] args) {
        test t = new test();
        int[] a = t.sortedSquares(new int[]{-2, 4, 0, 1, -6});
        System.out.println(Arrays.toString(a));
        t.printLength();
//         int count = t.findEvenNumbers(new int[]{88,88,99,10,33,1,2,98});
//         System.out.println(count);
    }
}


