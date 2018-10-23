package lesson_1;

public class App_1_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        a = a + b; // a = 5, b = 3
        b = a - b; // a = 5, b = 2
        a = a - b; // a = 3, b = 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
