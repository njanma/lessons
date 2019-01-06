package _1_procedural;

public class App_1_7_for_break {
    public static void main(String[] args) {

        //break;
//        forBreak();

        //nested for break
//        nestedForBreak();


    }

    private static void forBreak() {
        int o = 10;
        for (; o > 0; --o) {
            System.out.println("i = " + o);
            if (o == 5) {
                break;
            }
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
}
