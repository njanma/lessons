package _1_procedural._hw.answer.hw1;

import java.util.Scanner;

//        Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
//        Вывести дату следующего дня в формате "День.Месяц.Год".
//        Учесть переход на следующий месяц, а также следующий год.
//        Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
public class Func_1 {
    public static void main(String[] args) {
        Scanner consoleScaner = new Scanner(System.in);
        System.out.println(nextDate(consoleScaner.nextInt(), consoleScaner.nextInt(), consoleScaner.nextInt()));
    }

    public static String nextDate(int day, int mount, int year) {
        if (dayIsCorrect(day + 1, mount, year)) {
            return (day + 1) + "." + mount + "." + year;
        }
        if (mount < 12) {
            return "1." + (mount + 1) + "." + year;
        }
        return "1.1." + (year + 1);
    }

    public static boolean dayIsCorrect(int day, int mount, int year) {
        switch (mount) {
            case 4:
            case 6:
            case 9:
                return day < 31;
            case 2:
                return isLeapYear(year) ? day < 30 : day < 29;
            default:
                return day < 32;
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }
}
