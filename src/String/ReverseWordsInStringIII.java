package String;

public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb1 = new StringBuilder();

        for(String word : words){
            sb1.append(reverseString(word)).append(" ");
        }
        return sb1.toString().trim();
    }


    private String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        ReverseWordsInStringIII ls = new ReverseWordsInStringIII();
        String str = ls.reverseWords("abc def");
        System.out.println(str);

    }
}
