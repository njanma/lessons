package lesson_1;

public class App_1_7 {
    public static void main(String[] args) {

        //for (initialization; termination; increment)
        for (int i = 0; i < 1_0; i++) {
            System.out.println("i = " + i);
        }

        //break
        int o = 10;
        for (; o > 0; --o) {
            System.out.println("i = " + o);
            if (o == 5) {
                break;
            }
        }

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

        //for each
        int[] ints = {1, 2, 3};
        for (int arg : ints) {
            System.out.println(arg);
        }

//        // task
//        for (int k = 0; k < 10; k++) {
//            System.out.println("k = " + k);
//            k--;
//        }
//
//        //infinite loop
//        for (; ; )
//            System.out.println("infinite!");
    }
}
