package _7_multithreading;

public class App_11_hb_isAlive {

    static boolean run = true;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> run = false);
        thread.start();

        while (thread.isAlive()) ; // t t t f!
        
        while (run) {// f!
            System.out.println("No way!");
        }
    }
}
