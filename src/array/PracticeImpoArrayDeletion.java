package array;

public class PracticeImpoArrayDeletion {
        public int removeElement(int[] nums, int val) {
            int i=0;
            int len=0;
            int finalLength=nums.length;
            for (int j=0;j<finalLength;j++) {
                if (nums[j] == val) {
                    for(int k=j; k< nums.length-1; k++) {
                        nums[k]=nums[k+1];
                    }
                    System.out.println("finalLength "+ finalLength);
                    nums[finalLength-1] = 0;
                    finalLength--;
                }
                if (nums[j] == val) {
                    j--; //j=j-1
                }
            }
            System.out.println("finalLength "+ finalLength);
            return finalLength;
        }

    public static void main(String[] args) {
        PracticeImpoArrayDeletion ad=new PracticeImpoArrayDeletion();
        int[] nums = new int[]{4,4,0,1,0,2};
        int resultArrayLenght = ad.removeElement(nums,4);
        for (int i = 0; i < resultArrayLenght; i++) {
            System.out.print("printing the output"+ nums[i] + "\t");
        }
    }
    }
