package String;

public class AlternateStringMerge {

    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder sb=new StringBuilder();
        int count=0;
        if(l1>l2){
             count=l1;
        }else{
            count=l2;
        }
        for(int i=0;i<count;i++){
            if(l1>=i+1) {
                sb.append(word1.charAt(i));
            }
            if(l2>=i+1) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AlternateStringMerge ls = new AlternateStringMerge();
        String str = ls.mergeAlternately  ("","");
        System.out.println(str);
    }
}
