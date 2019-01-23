package _1_procedural._hw.answer.hw2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами:
 * - с помощью цикла
 * - с помощью рекурсии.
 */
public class Iter_2 {
    public static void main(String[] args) {
        Scanner consoleScaner = new Scanner(System.in);
        System.out.print("Выберете метод 1 - цикл, любое число - рекурсия:");
        int method = consoleScaner.nextInt();
        System.out.println("Введите число");
        int number = consoleScaner.nextInt();
        int n = 1;
        int fib = method == 1 ? cucleFib(n) : recursFib(n);
        while (fib < number) {
            System.out.println(fib);
            fib = method == 1 ? cucleFib(++n) : recursFib(++n);
        }
    }

    public static int cucleFib(int n) {
        int fib1 = 1;
        int fib2 = 1;
        while (--n > 0) {
            fib2 += fib1;
            fib1 = fib2 - fib1;
        }
        return fib1;
    }

    public static int recursFib(int n) {
        if (n < 3) {
            return 1;
        }
        return recursFib(n - 1) + recursFib(n - 2);
    }
}
