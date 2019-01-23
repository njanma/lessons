package _1_procedural._hw.answer.hw4;

import java.util.Scanner;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 **/
public class String_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String word = cs.next();
        System.out.println(isPolindrom(word));
    }

    public static boolean isPolindrom(final String word) {
        final int LENGT_WORD = word.length();
        for (int i = 0; i < LENGT_WORD / 2; i++) {
            if (word.charAt(i) != word.charAt(LENGT_WORD - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
