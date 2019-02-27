package _8_1_java8;

public class App_2_effective_final {
    public static void main(String[] args) {
        final String name = "username";
//        name = "user";
        Runnable printName = () -> {
            System.out.println("hi " + name);
        };
    }
}
