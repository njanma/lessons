package _1_procedural._hw.answer.hw4;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате,
 * в число в арабском формате. Границы чисел: от 1 до 3999.
 * Предусмотреть случай, когда меньший символ идёт перед большим: Например: CM == 900.
 * Соответствие:
 * M - 1000
 * D - 500
 * C - 100
 * L - 50
 * X - 10
 * V - 5
 * I - 1
 * https://en.wikipedia.org/wiki/Roman_numerals
 */
public class String_2 {

    private static String[] romeDigits = {
            /* 0 */ "M",
            /* 1 */ "CM",
            /* 2 */ "D",
            /* 3 */ "CD",
            /* 4 */ "C",
            /* 5 */ "XC",
            /* 6 */ "L",
            /* 7 */ "XL",
            /* 8 */ "X",
            /* 9 */ "IX",
            /* 10 */ "V",
            /* 11 */ "IV",
            /* 12 */ "I"
    };
    private static int[] arabicDigits = {
            /* 0 */ 1000,
            /* 1 */ 900,
            /* 2 */ 500,
            /* 3 */ 400,
            /* 4 */ 100,
            /* 5 */ 90,
            /* 6 */ 50,
            /* 7 */ 40,
            /* 8 */ 10,
            /* 9 */ 9,
            /* 10 */ 5,
            /* 11 */ 4,
            /* 12 */ 1
    };

    public static void main(String[] args) {
        System.out.println(convertToArabic("CM"));
    }

    private static int convertToArabic(final String input) {
        int result = 0;
        String processedNumber = input;

        for (int i = 0; i < romeDigits.length; i++) {
            String romeDigit = romeDigits[i];
            int romeDigitLength = romeDigit.length();

            while ((processedNumber.length() >= romeDigitLength)
                    && (processedNumber.substring(0, romeDigitLength).equals(romeDigit))) {
                result += arabicDigits[i];
                processedNumber = processedNumber.substring(romeDigitLength);
            }
        }
        return result;
    }
}
