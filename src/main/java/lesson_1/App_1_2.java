package lesson_1;

public class App_1_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
