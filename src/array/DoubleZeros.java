package array;

public class DoubleZeros {

    public void dblzeros(int[] nums){
        int counter=0;
        int lastIndex=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter+=2;
            }
            else {
                counter ++;
            }
            if(counter>=nums.length){
                lastIndex=i;
                break;
            }
        }
        int newIndexToCopy = nums.length-1;
        boolean isLastZero = counter > nums.length;
        for (int i =lastIndex ; i >=0 ; i--) {
            if (newIndexToCopy == i) {
                 break;
            }
            if(nums[i]==0){
                if (isLastZero) {
                    nums[newIndexToCopy]= 0;
                    isLastZero = false;
                    newIndexToCopy--;
                } else {
                    nums[newIndexToCopy-1] = 0;
                    nums[newIndexToCopy]= 0;
                    newIndexToCopy-=2;
                }
            } else {
                nums[newIndexToCopy] = nums[i];
                newIndexToCopy--;
            }
        }
    }

    public static void main(String[] args) {
        DoubleZeros dbl = new DoubleZeros();
        int[] input = {1,0,2,3,0,0,5,0};
        dbl.dblzeros(input);
        printArray(input);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i+"\t");
        }
    }

}

//    int[] array = new int[10];
