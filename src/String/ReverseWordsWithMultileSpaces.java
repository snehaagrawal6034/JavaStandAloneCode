package String;

public class ReverseWordsWithMultileSpaces {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String word[] = s.trim().split("\\s+");

            for(int i=word.length-1;i>=0;i--){

            sb.append(word[i]);
            if(i>0) {
                sb.append(" ");
        }

    }

        return sb.toString();
}

    public static void main(String[] args) {
        ReverseWordsWithMultileSpaces rwms = new ReverseWordsWithMultileSpaces();
        System.out.println(rwms.reverseWords("  hello world  "));
    }
}
