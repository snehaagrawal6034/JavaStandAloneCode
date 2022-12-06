package String;

public class ConsistentString {

    public int countConsistentStrings(String allowed, String[] words) {

        boolean bool[] = new boolean[26];
        int counter = words.length;

        for(char c : allowed.toCharArray()){
            bool[c-'a'] = true;
        }

        for(String word : words){
            for(char c : word.toCharArray()){
                if(!bool[c-'a']){
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        ConsistentString ls = new ConsistentString();
        String[] word = {"ad","bd","aaab","baa","badab"};
        int str = ls.countConsistentStrings  ("ab",word);
        System.out.println(str);

    }
}
