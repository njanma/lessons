package _7_multithreading;

public class App_2 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("PRINT");
        }
    }
}
