package String;

public class LongPressed {
    public boolean isLongPressedName(String name, String typed) {

        char fs[] = name.toCharArray();
        char ss[] = typed.toCharArray();
        int fp = 0;
        int sp = 0;

        while(fp<name.length() && sp<typed.length()){
            if(fs[0]!=ss[0]){
                return false;
            }
            if(fs[fp]==ss[sp]){
                fp++;
                sp++;
            } else if(fs[fp]!=ss[sp] && ss[sp]==ss[sp-1]){
                sp++;
            } else{
                return false;
            }
        }
        while(fp < name.length()) {
            return false;
        }
        while(sp<typed.length()) {
            if(ss[sp] == ss[sp-1]) {
                sp++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LongPressed test = new LongPressed();
        Boolean b = test.isLongPressedName("leelee","lleeelee");
        System.out.println(b);

    }
}
