package lesson_2._2_constructor;

/**
 * поведение this в кострукторе
 */
public class App_2_2 {

    public App_2_2() {
        this(8);
    }

    public App_2_2(int c) {
        //recursive invocation
        //this();
    }

    public static void main(String[] args) {
        new App_2_2();
        new App_2_2(15);
    }
}
