package array;

public class DoubleZeros {

    public void duplicateZeros(int[] arr) {
        int[] copy = arr.clone();
        int j = 0;
        for (int i = 0; i < copy.length; i++) {
            if (j < arr.length) {
                if (copy[i] == 0) {
                    arr[j++] = 0;
                    if (j < arr.length) {
                        arr[j++] = 0;
                    }
                } else {
                    arr[j++] = copy[i];
                }
            }
        }
    }

    public static void main(String[] args) {
        DoubleZeros dbl = new DoubleZeros();
        int[] input = {1,0,2,3,0,0,5,0};
        dbl.duplicateZeros(input);
        printArray(input);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i+"\t");
        }
    }

}

//    int[] array = new int[10];
