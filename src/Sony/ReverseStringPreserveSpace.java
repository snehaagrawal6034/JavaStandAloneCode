package Sony;

public class ReverseStringPreserveSpace {

    public static String preserveSpace(String str){

        char ch[] = str.toCharArray();
        char temp = ' ';
        int start = 0;
        int end = str.length()-1;

        while(start<=end){
                if(ch[start]==' ' && ch[end]==' '){
                    start++;
                    end--;
                } else if(ch[start]==' '){
                    start++;
                } else if(ch[end]==' '){
                    end--;
                }
                else{
                    temp = ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
                }
        }
        System.out.println(String.valueOf(ch));
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String str = "internship at geeks for geeks";
        preserveSpace(str);
    }
}
