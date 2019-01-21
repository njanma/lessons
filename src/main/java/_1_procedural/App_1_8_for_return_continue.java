package _1_procedural;

public class App_1_8_for_return_continue {
    public static void main(String[] args) {

        //continue
        continueWithLabel();

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




    private static void returnInFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            return;
        }
        System.out.println("!!!!!");
    }
}
