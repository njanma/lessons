package _1_procedural._hw.answer.hw2;

import java.util.Scanner;

/**
 *  Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * //        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * //        Программа должна выводить:
 * //        a. Количество дней
 * //        b. Сумму осадков за этот период
 * //        c. Среднее количество осадков за этот период
 * //        d. Максимальное количество дневных осадков за этот период
 * //        Не использовать массивы!
 */
public class Iter_3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите количество дней:");
        int dayN = cs.nextInt();
        float rainFall;
        float maxRainFall = 0;
        float sumRainFall = 0;

        for (int i = 1; i <= dayN; ++i) {
            System.out.print("Введите количество осадков " + i + "дня=");
            rainFall = cs.nextInt();
            if (rainFall > 0) {
                maxRainFall++;
            }
            sumRainFall += rainFall;
        }
        System.out.println("Количество дней = " + dayN);
        System.out.println("Сумму осадков за этот период = " + sumRainFall);
        System.out.println("Среднее количество осадков за этот период = " + sumRainFall / dayN);
        System.out.println("Максимальное количество дневных осадков за этот период = " + maxRainFall);
    }
}
