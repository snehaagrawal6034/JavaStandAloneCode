package String;

public class ThousandSeparator {
    public String thousandSeparator(int n) {

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int counter = 0;

        if(sb.length()<=3){
            return sb.toString();
        }

        for(int i=sb.length()-1;i>=1;i--){
            counter++;
            if(counter==3){
                sb.insert(i,".");
                counter=0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ThousandSeparator thousandSeparator = new ThousandSeparator();
        String  l = thousandSeparator.thousandSeparator(678);
        System.out.println(l);
    }
}
