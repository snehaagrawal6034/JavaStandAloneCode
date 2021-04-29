package trie;

public class LongestPrefix {
    public static void main(String[] args) {

        // flower
        String prefix = new LongestPrefix().longestCommonPrefix(new String[]{"fflower", "flow", "flat"});
        System.out.println(prefix);
     }

    public String longestCommonPrefix(String[] strs) {
        Node root = new Node();
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            char[] chars = str.toCharArray();

            Node temp = root;

            for (char aChar : chars) {
                if (temp.children[aChar - 'a'] != null) {
                    temp.children[aChar-'a'].count++;
                } else {
                    temp.children[aChar - 'a'] = new Node();
                }
                if (temp.children[aChar - 'a'].count == strs.length) {
                    result.append(aChar);
                }
                temp = temp.children[aChar - 'a'];
            }
        }
        return result.toString();
    }

    public  class Node {
        int count;
        Node[] children;

        public Node() {
            count = 1;
            children = new Node[26];
        }
    }


}
