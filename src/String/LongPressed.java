package String;

public class LongPressed {
    public boolean isLongPressedName(String name, String typed) {
        int np=0;
        int tp=0;
        char n[]=name.toCharArray();
        char t[]=typed.toCharArray();

        while(np<name.length() && tp<typed.length()){
                if(n[np]==t[tp]){
                    np++;
                    tp++;
                }
                else{
                    if(tp>0){
                        if(t[tp]==t[tp-1]){
                            tp++;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }
                }
        }
        while(np<name.length()){
            return false;
        }
        while(tp<typed.length()){
            if(tp>0){
                if(t[tp]==t[tp-1]){
                    tp++;
                }
                else{
                    return false;
                }
            }
            else{
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
