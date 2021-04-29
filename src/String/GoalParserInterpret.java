package String;

import java.util.Stack;

public class GoalParserInterpret {

    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <command.length() ; i++) {
            char currentChar = command.charAt(i);
            if (currentChar == 'G'){
                sb.append('G');
            }
            else if (currentChar == '(' || currentChar == 'a' || currentChar == 'l') {
                stack.push(currentChar);
            } else if (currentChar == ')' ) {
                //"()""(al)" - la(
                int count = 0;
                while (true) {
                    char stackTop = stack.pop();
                    count++;
                    if (stackTop == '(') {
                        if (count == 1) {
                            sb.append("o");
                        } else if (count == 3) {
                            sb.append("al");
                        }
                        break;
                    }
                }
            } else
            {return null;}
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GoalParserInterpret ls = new GoalParserInterpret();
        String str = ls.interpret("G()()()()(al)");
        System.out.println(str);

    }
}
