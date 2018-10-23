package lesson_1;

public class App_1_8 {
    public static void main(String[] args) {

        //while (expression)
        int k = 10;
        while (k > 0) {
            System.out.println("k = " + k);
            k--;
        }

        //do while
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        //infinite loop
//        while (true)
//            System.out.println("unreachable!");
    }
}
