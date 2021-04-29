package array;

public class goodString {
    public int countCharacters(String[] words, String chars) {
        int goodString = 0;

        int[] charCount = charCount(chars);
        for(String word:words){

            int[] charCountWord = charCount(word);
            boolean isGoodString = true;
            for(int i=0; i<26; i++) {
                if(charCountWord[i] > charCount[i]) {
                    isGoodString = false;
                    break;
                }
            }
            if(isGoodString) {
                goodString = goodString + word.length();
            }
        }
        System.out.println(goodString);
        return goodString;
    }

    private int[] charCount(String charecters) {
        int[] counter = new int[26];
        char[] charArray = charecters.toCharArray();
        for(char eachChar: charArray) {
            counter[eachChar-'a'] = counter[eachChar-'a']+1;
        }
        return counter;
    }

    public static void main(String[] args) {
        goodString ad=new goodString();
        String[] words = {"cat","bt","hat","tree"};
        String s = "atach";

        ad.countCharacters(words,s);
        }
    }
