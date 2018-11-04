package lesson_2;

/**
 * при вызове определенного конструктора, конструктор по умолчанию не вызывается
 */
public class App_2_6 {
    App_2_6() {
        System.out.print("App()");
    }

    App_2_6(int k) {
        System.out.print("App(int)");
    }

    public static void main(String[] args) {
        new App_2_6(0);
    }
}
