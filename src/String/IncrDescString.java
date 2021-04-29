package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncrDescString {
    public String sortString(String s) {
        char [] ch = s.toCharArray();
        int length = ch.length;
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char c:ch){
            freq[c-'a']++;
        }
        while(length!=0){
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    freq[i]--;
                    sb.append((char)(i+'a'));
                    length--;
                }
            }
            for(int i=25;i>=0;i--){
                if(freq[i]!=0){
                    freq[i]--;
                    sb.append((char)(i+'a'));
                    length--;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        IncrDescString ls = new IncrDescString();
        String s=ls.sortString("aaaabbbbcccc");
        System.out.println(s);
    }
}
