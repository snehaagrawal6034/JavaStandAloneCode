package array;

import java.util.Stack;

public class PracticeReverseOnlyAlphaNumeric {

    public String reverseString(String str) {

        char ch[] = str.toCharArray();
        int fp = 0;
        int lp = str.length()-1;

        while(fp<lp){
            while(fp < ch.length && !isAlphabetOrDigit(ch[fp])){
                fp++;
            }
            while(lp >= 0 && !isAlphabetOrDigit(ch[lp])){
                lp--;
            }

            if(fp < lp){
                char temp = ch[fp];
                ch[fp] = ch[lp];
                ch[lp] = temp;
                fp++;
                lp--;
            }
        }
        return new String(ch);
    }

    private boolean isAlphabetOrDigit(char ch) {
        return Character.isAlphabetic(ch) || Character.isDigit(ch);
    }


//        Stack<Character> st = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//        char ch[] = str.toCharArray();
//        for (int i=0;i<str.length();i++) {
//            if( Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i])){
//                st.push(ch[i]);
//        }
//        }
//        for (int i=0;i<str.length();i++){
//            if( Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i])){
//                sb.append(st.pop());
//            } else{
//                sb.append(ch[i]);
//            }
//        }
//        return sb.toString();
//    }
    public static void main(String[] args) {
        PracticeReverseOnlyAlphaNumeric rm = new PracticeReverseOnlyAlphaNumeric();
        String str = "!hf#9&";
        System.out.println(rm.reverseString(str));
    }
}
