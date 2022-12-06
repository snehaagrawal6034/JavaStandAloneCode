package SearchAndSort;

public class InsertionSort {
    int[] sort(int[] input) {
        int position = 0;
        int[] output = new int[input.length];
        output[0] = input[0];
        for (int i=1 ; i<=input.length-1 ; i++) {
            while(input[i]<input[i-1]){
                output[i-1] = input[i];
                output[i] = input[i-1];
            }
        }
        System.out.println(output);
        return output;
    }


    public static void main(String[] args) {
        int[] A = {4,3,2,1};
        // 1,2,3,4


    }
}
