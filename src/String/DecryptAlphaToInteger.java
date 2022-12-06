package String;

public class DecryptAlphaToInteger {
    public String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i+2) == '#'){
                char current = (char)('a' + Integer.parseInt(s.substring(i,i+2)) -1);
                sb.append(String.valueOf(current));
                i = i + 3;
            } else{
                char current = (char)('a' + Integer.parseInt(s.substring(i,i+1)) -1);
                sb.append(String.valueOf(current));
                i = i + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DecryptAlphaToInteger test = new DecryptAlphaToInteger();
        String l=test.freqAlphabets("10#11#12");
        System.out.println(l);
    }
}

//    Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:
//
//        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//        Return the string formed after mapping.
//
//        It's guaranteed that a unique mapping will always exist.

//Input: s = "10#11#12"
//        Output: "jkab"
//        Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
