package _1_procedural;

public class App_1_8 {
    public static void main(String[] args) {

        //continue
        continueWithLabel();

        //nested for break
//        nestedForBreak();

        //return
//        returnInFor();
    }

    private static void continueWithLabel() {
        test:
        for (int i = 0; i <= 10; i++) {
            if (i < 5) {
                System.out.println("continue: " + i);
                continue test;
            }
            break test;
        }
    }


    private static void nestedForBreak() {
        for (int k = 0; k <= 5; k++) {
            System.out.print("k = " + k + "; ");

            for (int j = 0; j <= 5; j++) {
                System.out.print("j = " + j + "; ");

                if (j > 2) {
                    System.out.println("break");
                    break;
                }
            }
        }
    }

    private static void returnInFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            return;
        }
    }
}
