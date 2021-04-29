import java.util.*;

public class GroupAnagram {
    public List<List<String>> anaGrp(String[] strs){
        if(strs.length==0) return new ArrayList<>() ;
        Map<String,List> mp= new HashMap<>();
        for (String s : strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList());
                mp.get(key).add(s);
            }
        }
        System.out.println(new ArrayList(mp.values()));
//        System.out.println(new ArrayList(mp.values()));
        return new ArrayList(mp.values());
    }
    public static void main(String[] args) {
        GroupAnagram ga=new GroupAnagram();
        ga.anaGrp(new String[]{"abc","bca","dfg","ert","ret"});
    }
}
