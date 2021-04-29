import java.util.HashMap;
import java.util.Stack;

public class ValidParen {
    private HashMap<Character,Character> hm;

    public  ValidParen(){
        this.hm=new HashMap<Character, Character>();
        this.hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
    }

    public boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(hm.containsKey(c)) {
                char topElement = st.empty() ? '#' : st.pop();
                if (topElement != this.hm.get(c)) {
                    System.out.println("invalid");
                    return false;
                }
            }
                else{
                    st.push(c);
                }
            }
        System.out.println("valid");
        return st.isEmpty();
    }
    public static void main(String[] args) {
        ValidParen vp = new ValidParen();
        vp.isValid("(([]{}))");
    }
}
