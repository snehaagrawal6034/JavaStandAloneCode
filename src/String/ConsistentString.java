package String;

public class ConsistentString {

    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] bol = new boolean[26];
        int count = words.length;
        for (char ch: allowed.toCharArray()) {
            bol[ch-'a']=true;
        }
        for(String word:words){
            for(char c:word.toCharArray()){
                if(bol[c-'a']==false) {
                    count = count - 1;
                    break;
                }

            }
        }
        return count;
    }


    public static void main(String[] args) {
        ConsistentString ls = new ConsistentString();
        String[] word = {"ad","bd","aaab","baa","badab"};
        int str = ls.countConsistentStrings  ("ab",word);
        System.out.println(str);

    }
}
