package trie;

import java.util.Arrays;
import java.util.List;

public class AutoComplete {

    // Dict - Flower, Flow, Flaw
    // F - RETURN ALL 3
    // FL - RETURN ALL 3
    // FLO - FLOWER, FLOW

    public List<String> autoComplete(List<String> dict, String searchString) {

        Node root = new Node();

        // Creating trie
        for (String str : dict) {
            char[] chars = str.toCharArray();

            Node temp = root;

            for (int i = 0; i < chars.length; i++) {
                if (temp.children[chars[i] - 'a'] == null) {
                    temp.children[chars[i] - 'a'] = new Node();
                }

                if (i == chars.length - 1) {
                    temp.isWord = true;
                }
                temp = temp.children[chars[i] - 'a'];
            }
        }

        char[] chars = searchString.toCharArray();

        // FL
        for (char aChar : chars) {

        }

        return dict;
    }

    public class Node{
        boolean isWord = false;
        Node[] children;

        public Node(){
            isWord = false;
            children=new Node[26];
        }
    }

    public static void main(String[] args) {
        List<String> dict = Arrays.asList("flower", "flow", "flat","tyurdu");
        System.out.println(new AutoComplete().autoComplete(dict, "f")); // all 3
        System.out.println(new AutoComplete().autoComplete(dict, "fl")); // all 2
    }
}
