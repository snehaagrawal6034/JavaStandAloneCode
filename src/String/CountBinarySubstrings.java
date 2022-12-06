package String;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {

        int current=1,index=1,previous=0,result=0;

        while(index<s.length()){
            if(s.charAt(index)!=s.charAt(index-1)){
                result=result+Math.min(current,previous);
                previous=current;
                current=1;
            }else{
                current++;
            }
            index++;
        }
        return result+Math.min(previous,current);
    }

    public static void main(String[] args) {
        CountBinarySubstrings countBinarySubstrings = new CountBinarySubstrings();
        System.out.println(countBinarySubstrings.countBinarySubstrings("00110011"));
    }
}



