package _8_java8;

public class App_2_effective_final {
    public static void main(String[] args) {
        String name = "username";
//        name = "user";
        int counter = 0;
        Runnable printName = () -> {
            System.out.println("hi " + name);
//            counter++;
        };
    }
}
