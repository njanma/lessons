package lesson_1;

public class App_1_5 {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else if (!condition) { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2
        else {
            System.out.println(condition ? "!!!!" : "?????");
        }
    }
}
