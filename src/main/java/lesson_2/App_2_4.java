package lesson_2;

public class App_2_4 {
    App_2_4() {
        // this всегда вначале
        this(0);
        System.out.println("A()");
    }

    App_2_4(int k) {
        System.out.println("A(int)");
    }

    public static void main(String[] args) {
        new App_2_4();
    }
}