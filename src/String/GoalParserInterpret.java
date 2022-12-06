package String;

public class GoalParserInterpret {

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char ch[] = command.toCharArray();

        for(int i=0;i<command.length();i++){
            if(ch[i]=='G'){
                sb.append("G");
            } else if(ch[i]=='(' && ch[i+1]==')'){
                sb.append("o");
            } else if(ch[i]=='(' && ch[i+1]!=')'){
                sb.append("al");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GoalParserInterpret ls = new GoalParserInterpret();
        String str = ls.interpret("G()()()()(al)");
        System.out.println(str);

    }
}
