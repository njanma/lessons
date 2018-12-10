package _7_multithreading;

public class App_10_hb {

    static int data = 0;
    static /*volatile*/ boolean run = false;

    public static void main(String[] args) {
        new Thread(()-> {
            while (run); //0 .. infinity
            System.out.println(data); // 1!!!
        }).start();
        data = 1;
        run = false;
    }
}