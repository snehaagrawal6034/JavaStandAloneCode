package Stack;

import java.util.Stack;

public class compareStr {
    public boolean backspaceCompare(String S, String T) {
        System.out.println(compare(S).equals(compare(T)));
        return compare(S).equals(compare(T));
    }
    public String compare(String s){
        Stack<Character> st = new Stack();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        System.out.println(st.toString());
        return st.toString();
    }

    public static void main(String[] args) {
        compareStr ts = new compareStr();
        String s1 = "abba#ca";
        String s2 = "ab#baca";
        ts.backspaceCompare(s1,s2);
    }
}
