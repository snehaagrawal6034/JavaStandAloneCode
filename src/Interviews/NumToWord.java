package Interviews;

public class NumToWord {

        public static void main(String[] args) {
            int x = 232;
            NumToWord numberToWord = new NumToWord();
            for (int i = 0; i <= 999; i++) {
                System.out.println(i + "\t" + numberToWord.numberToWord(i));

            }
        }

        // 0 < number < 999
        public String numberToWord(int number) {
            StringBuilder wordBuilder = new StringBuilder();
            // 0 to 99999

            // 9500 - nine thousand five hundred
            // 95000  - ninety thousnad
            // 99
            // 99000
//            if (number/10000 !=0){
//                // 9
//                wordBuilder = wordBuilder.append(teensToWord(number/10000)).append(" ");
//            }
//            number = number%10000;
//            if (number/1000 !=0) {
//                wordBuilder = wordBuilder.append(digitToWord(number/1000)).append(" thousand ");
//            }
//            number = number%1000;
            if (number/100 !=0){
                // 9
                wordBuilder = wordBuilder.append(digitToWord(number/100)).append(" hundred ");
            }
            // nine hundred ninety nine
            // 999
            number = number%100;
            // 99
            if (number/10 != 0) {
                // 9
                if (number>=10 && number <= 19) {
                    wordBuilder = wordBuilder.append(elevensToWord(number)).append(" ");
                    number = 0;
                } else {
                    wordBuilder = wordBuilder.append(teensToWord(number/10)).append(" ");
                }
            }

            // 9
            number = number%10;
            if (number != 0) {
                // 9
                wordBuilder = wordBuilder.append(digitToWord(number));
            }
            // 123
            return wordBuilder.toString().trim();
        }

    public String digitToWord(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                throw new IllegalArgumentException("incorrect number");
        }
    }

    public String teensToWord(int number) {
        switch (number) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default:
                throw new IllegalArgumentException("incorrect number");
        }
    }

    public String elevensToWord(int number) {
        switch (number) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Forteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                throw new IllegalArgumentException("incorrect number");
        }
    }
}
