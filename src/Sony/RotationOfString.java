package Sony;

public class RotationOfString {

    public static boolean rotateString(String s, String goal) {
        if(goal.length()!= s.length()) {
            return false;
        }
        return (goal+goal).contains(s);
    }
    public static void main(String[] args) {
        String str = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(str, goal));
    }
}
