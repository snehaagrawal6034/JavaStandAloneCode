package String;

import java.util.ArrayList;
import java.util.List;

public class ReformatString {
    public String reformat(String s) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // c - '0' >=0 && c - '0' <= 9
        // '0', '1' - '0' = 1, '2'-'0'=2
        // 'A' c-'A'>=0 && c-'A'<=25 - capital
        for (char c : s.toCharArray()) {
            if (c - 'a' >= 0 && c - 'a' <= 25) {
                list1.add(c);
            } else {
                list2.add(c);
            }
        }

        if (Math.abs(list1.size() - list2.size()) > 1) {
            return "";
        } else {
            if ((list1.size() > list2.size())) {
                for (int i = 0; i < list2.size(); i++) {
                    sb.append(list1.get(i));
                    sb.append(list2.get(i));
                }
                sb.append(list1.get(list1.size() - 1));
            } else {
                for (int i = 0; i < list1.size(); i++) {
                    sb.append(list2.get(i));
                    sb.append(list1.get(i));
                }
                if ((list2.size() > list1.size())) {
                    sb.append(list2.get(list2.size() - 1));
                }
            }
        }


        return sb.toString();
    }
}
