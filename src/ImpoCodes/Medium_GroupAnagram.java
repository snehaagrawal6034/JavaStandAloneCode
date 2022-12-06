package ImpoCodes;

import java.util.*;
//https://leetcode.com/problems/group-anagrams/description/
public class Medium_GroupAnagram {
    public List<List<String>> anaGrp(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedStr = sort(str);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            List<String> temp = map.get(sortedStr); // []
            temp.add(str);
        }
        for (List<String> l : map.values()) {
            result.add(l);
        }
        return result;
    }

    private String sort(String input) {
        char[] c = input.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        Medium_GroupAnagram ga = new Medium_GroupAnagram();
        System.out.println(ga.anaGrp(new String[]{"abc", "bca", "dfg", "ert", "ret"}));
    }
}
