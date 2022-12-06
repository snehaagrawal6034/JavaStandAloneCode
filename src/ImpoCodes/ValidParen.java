package ImpoCodes;

import java.util.HashMap;
import java.util.Stack;

public class ValidParen {
    private HashMap<Character, Character> hm;

    public ValidParen() {
        hm = new HashMap<Character, Character>();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                if (st.isEmpty()) {
                    return false;
                } else if (st.pop() != hm.get(c)) {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        System.out.println("valid");
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParen vp = new ValidParen();
        System.out.println(vp.isValid("()"));
        vp.isValid("(([]{}))");
    }
}
