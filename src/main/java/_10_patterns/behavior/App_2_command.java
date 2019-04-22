package _10_patterns.behavior;

/**
 * https://refactoring.guru/ru/design-patterns/command
 */
public class App_2_command {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run this command!");
            }
        }).start();
    }
}
