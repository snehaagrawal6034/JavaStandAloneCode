package String;

public class AlternateStringMerge {

    public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int currentIndex = 0;
            while(currentIndex<Math.min(word1.length(), word2.length())) {
                sb.append(word1.substring(currentIndex, currentIndex+1));
                sb.append(word2.substring(currentIndex, currentIndex+1));
                currentIndex++;
            }

            if(currentIndex< word1.length()) {
                sb.append(word1.substring(currentIndex));
            }
            if(currentIndex < word2.length()) {
                sb.append(word2.substring(currentIndex));
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        AlternateStringMerge ls = new AlternateStringMerge();
        String str = ls.mergeAlternately  ("ufu","oiuy");
        System.out.println(str);
    }
}
