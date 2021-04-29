package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParen {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        for(char c: s.toCharArray()) {
            if(closeToOpen.containsKey(c)) {
                if(stack.isEmpty()) {
                    return false; // no opening bracket for closing bracket
                }
                if(closeToOpen.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                // opening bracket case.
                stack.push(c);
            }
        }
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
