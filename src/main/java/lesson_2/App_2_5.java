package lesson_2;

public class App_2_5 {

    App_2_5() {
        this(f());
    }

    App_2_5(int k) {
        System.out.println("A(int)");
    }

    static int f() {
        System.out.println("f()");
        return 0;
    }

    public static void main(String[] args) {
        new App_2_5();
    }
}
