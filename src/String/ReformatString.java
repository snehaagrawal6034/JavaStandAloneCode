package String;

import java.util.ArrayList;
import java.util.List;

public class ReformatString {
    public String reformat(String s) {
        char ch[] = s.toCharArray();
        int digit = 0;
        int character = 0;
        StringBuilder sb = new StringBuilder();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(ch[i])){
                digit++;
                list1.add(ch[i]);
            } else{
                character++;
                list2.add(ch[i]);
            }
        }

        if(Math.abs(digit-character)<=1){
            for(int i=0;i<Math.min(list1.size(), list2.size());i++){
                if(list1.size() > list2.size()) {
                    sb.append(list1.get(i));
                    sb.append(list2.get(i));
                } else {
                    sb.append(list2.get(i));
                    sb.append(list1.get(i));
                }
            }
            int i = Math.min(list1.size(), list2.size());
            if(i<list1.size()) {
                sb.append(list1.get(i));
            } else if (i<list2.size()) {
                sb.append(list2.get(i));
            }
        } else{
            return "";
        }

        return sb.toString();
        // Character.isDigit(s)
        // Character.isAlphabetic(s)
    }

    public static void main(String[] args) {
        ReformatString rs = new ReformatString();
        System.out.println(rs.reformat("ab0c2"));
    }
}
