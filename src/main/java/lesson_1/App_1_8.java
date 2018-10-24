package lesson_1;

public class App_1_8 {
    public static void main(String[] args) {

        //continue
        test:
        for (int i = 0; i <= 10; i++) {
            if (i < 5) {
                System.out.println("continue: " + i);
                continue test;
            }
            break test;
        }

        //nested for break
        for (int k = 3; k > 0; --k) {
            System.out.println("k = " + k);
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println("j = " + j);
                    break;
                }
            }
        }

        //return
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            return;
        }
    }
}
