package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParen {
    public boolean isValid(String s) {

        Map<Character,Character> closeToOpen = new HashMap<>();
        Stack<Character> st = new Stack<>();

        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(char ch : s.toCharArray()){

            if(closeToOpen.containsKey(ch)){
                if(st.isEmpty()){
                    return false;
                } else if(st.pop()!=closeToOpen.get(ch)){
                    return false;
                }
            } else{
                st.push(ch);
            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        validParen vp = new validParen();
        System.out.println( vp.isValid("()"));
    }
}
