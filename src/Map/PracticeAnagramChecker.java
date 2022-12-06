package Map;

import java.util.*;

public class PracticeAnagramChecker {
    // "aet" ->  {"eat", "tea", "ate"}
    // "ant" -> {"tan", "nat"}
    // "abt" -> {"bat"}
    // {{"eat", "tea", "ate"},{"tan", "nat"} }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            String sortedStr = sort(str);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            List<String> temp = map.get(sortedStr);
            temp.add(str);
        }
        for(List<String> l : map.values()) {
            result.add(l);
        }

        for(int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }

        return result;

    }

    private String sort(String input) {
        char[] c = input.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        PracticeAnagramChecker anagramChecker = new PracticeAnagramChecker();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        anagramChecker.groupAnagrams(strs);
    }
}