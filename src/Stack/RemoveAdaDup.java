package Stack;

import java.util.Stack;

public class RemoveAdaDup {
    public String removeDuplicates(String S) {
            Stack<Character> st = new Stack();
            st.push(S.charAt(0));
            for(int i=1;i<S.length();i++){
                if(!st.isEmpty() && st.peek()==S.charAt(i)){
                    st.pop();
                } else  {
                    st.push(S.charAt(i));
                }
            }

//            StringBuilder sb = new StringBuilder();
//            while(!st.isEmpty()){
//                sb.append(st.pop());
//            }
            return st.toString();
        }
    public static void main(String[] args) {
        RemoveAdaDup ts = new RemoveAdaDup();
        String str = "abbaca";
        System.out.println(ts.removeDuplicates(str));
    }
}
