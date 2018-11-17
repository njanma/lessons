package _1_procedural;

public class App_1_7 {
    public static void main(String[] args) {

        //for (initialization; termination; increment)
        for (int i = 0; i < 1_0; i++) {
            System.out.println("i = " + i);
        }

        //for each
        for (int arg : new int[]{1, 2, 3}) {
            System.out.println(arg);
        }

        //break
        int o = 10;
        for (; o > 0; --o) {
            System.out.println("i = " + o);
            if (o == 5) {
                break;
            }
        }

//        //infinite loop
//        for (; ; )
//            System.out.println("infinite!");
    }
}
