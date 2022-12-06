package Interviews;

import java.util.HashMap;
import java.util.Map;

enum Digits {
    ONE("One", 1, null, "Eleven"),
    TWO("Two", 2, "Twenty", "Tweleve"),
    THREE("Three", 3, "Thirty", "Thirteen"),
    FOUR("Four", 4, "Forty", "Forteen"),
    FIVE("Five", 5, "Fifty", "Fifteen"),
    SIX("Six", 6, "Sixty", "Sixteen"),
    SEVEN("Seven", 7, "Seventy", "Seventeen"),
    EIGHT("Eight", 8, "Eighty", "Eighteen"),
    NINE("Nine", 9, "Ninety", "Nineteen");

    private final String word;
    private final int digit;
    private final String teenWord;
    private final String elevenWord;

    Digits(String word, int digit, String teenWord, String elevenWord) {
        this.word = word;
        this.digit = digit;
        this.teenWord = teenWord;
        this.elevenWord = elevenWord;
    }

    static Map<Integer, Digits> map = new HashMap<>();
    static {
        for (Digits value : Digits.values()) {
            map.put(value.digit, value);
        }
    }

    public static String digitToWord(int digit) {
        return map.get(digit).word;
    }

    public static String teensToWord(int digit) {
        if (digit == 1) {
            return map.get(digit).elevenWord;
        } else {
            return map.get(digit).teenWord;
        }
    }
}