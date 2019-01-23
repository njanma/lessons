package _1_procedural._hw.answer.hw4;

import java.util.HashMap;
import java.util.Map;

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
 */
public class String_2 {
    public static void main(String[] args) {
        System.out.println(convertorRimToArabNumber("IVIII"));
    }

    public static int convertorRimToArabNumber(final String rimNumber) {
        final int LENGT_RIM_NUMBER = rimNumber.length();
        int arabNumber = 0;
        Map<Character, Integer> abcRim = new HashMap<>();
        abcRim.put('M', 1000);
        abcRim.put('D', 500);
        abcRim.put('C', 100);
        abcRim.put('L', 50);
        abcRim.put('X', 10);
        abcRim.put('V', 5);
        abcRim.put('I', 1);
        for (int i = 0; i < LENGT_RIM_NUMBER; i++) {
            if (i == LENGT_RIM_NUMBER - 1 || abcRim.get(rimNumber.charAt(i)) >= abcRim.get(rimNumber.charAt(i + 1))) {
                arabNumber += abcRim.get(rimNumber.charAt(i));
            } else {
                arabNumber -= abcRim.get(rimNumber.charAt(i));
            }
        }
        return arabNumber;
    }
}
