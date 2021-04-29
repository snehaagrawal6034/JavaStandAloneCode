package hashtable;

public class AlienDict {
        public boolean isAlienSorted(String[] words, String order) {


            int dictionary[] = createDict(order);
            for(int i=0;i<words.length-1;i++){
                if(compare(words[i], words[i+1], dictionary)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        public int [] createDict(String order){
            int[] index = new int[26];
            for(int i=0;i<order.length();i++){
                index[order.charAt(i)-'a'] = i;
            }
            return index;
        }

        // return true if str2 > str1, otherwise false.
        public boolean compare(String str1, String str2, int dict[]) {
            for(int i=0; i<Math.min(str1.length(), str2.length()); i++) {
                if(dict[str1.charAt(i) - 'a'] < dict[str2.charAt(i)- 'a']) {
                    return true;
                } else if(dict[str1.charAt(i) - 'a'] > dict[str2.charAt(i)- 'a']) {
                    return false;
                }
            }
            // one string is prefix of other. hello, helloword
            if(str1.length() > str2.length()) {
                return false;
            } else {
                return true;
            }
        }
    }
