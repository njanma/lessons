package _1_procedural._hw.answer.hw1;

import java.util.Scanner;

//        Написать программу, вычисляющую корни квадратного уравнения вида ax² + bx + c = 0,
//        где a, b и c - вводимые пользователем из консоли данные.
//        Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
//        При решении создать и использовать следующие вынесенные функции:
//        функция isPositive, определяющая, является ли число положительным
//        функция isZero, определяющая, является ли число нулём
//        функция discriminant, вычисляющая дискриминант
public class Func_3 {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Введите a , b ,c:");
        int a = consoleScanner.nextInt();
        int b = consoleScanner.nextInt();
        int c = consoleScanner.nextInt();
        int discr = discriminant(a, b, c);
        if (isPositive(discr)) {
            if (isZero(discr)) {
                System.out.println("X1=X2=" + (-b / (2 * a)));
            } else
                System.out.println("X1=" + (Math.sqrt(discr) - b) / (2 * a) + "  X2=" + (-Math.sqrt(discr) - b) / (2 * a));
        } else System.out.println("D<0 в дествительных числах решения нет");
    }

    public static boolean isPositive(int discr) {
        return discr >= 0;
    }

    public static boolean isZero(int discr) {
        return discr == 0;
    }

    public static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}
