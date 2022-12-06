package String;

class ReformatNumber {
    public static String reformatNumber(String number) {
        //"1-23-45 6"
        // 123-45
        // remove whitespace and -
        // num.length == 2 && num.length == 3 as it is
        // num.length == 4 - 2 blocks of
        // num.length > 4 3 digits-repeat the process with smaller number

         number = number.replace("-","");
         number = number.replace(" ", "");

         if(number.length()==2 || number.length()==3){
             return number;
         }

         if(number.length()==4){
             return number.substring(0,2)+"-"+number.substring(2,4);
         }

        return number.substring(0,3)+"-"+reformatNumber(number.substring(3));
    }

    public static void main(String[] args) {
        System.out.println(ReformatNumber.reformatNumber("1-23-45 6"));
    }

}