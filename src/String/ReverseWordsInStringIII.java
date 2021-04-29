package String;

public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        // abc def
        // cba fed
        String str[]=s.split(" ");

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            output.append(reverseString(str[i])).append(" ");
        }

        return output.toString().substring(0, output.length()-1);
    }

    private StringBuilder reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse();
    }


    public static void main(String[] args) {
        ReverseWordsInStringIII ls = new ReverseWordsInStringIII();
        String str=ls.reverseWords("");
        System.out.println(str);

    }
}
