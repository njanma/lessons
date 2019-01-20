package _1_procedural;

import java.util.Scanner;

public class App_1_6_switch {
    public static void main(String[] args) {

        String monthString;

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        //byte, short, char, int, enum, String, wrappers: Character, Byte, Short, Integer
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            default:
                monthString = "Invalid month";
                //why?
//                break;
            case 7:
                monthString = "April";
                break;
        }
        System.out.println(monthString);
    }
}
