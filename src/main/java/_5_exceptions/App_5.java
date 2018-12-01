package _5_exceptions;

public class App_5 {

    public static void main(String[] args) {
//        System.out.println(sqrt(2.0));
//        System.out.println(sqrt(3.0));
        System.out.println(sqrt(1.5));
    }

    public static double sqrt(double arg) {// согласно объявлению метода ты должен вернуть double
        if (arg % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (arg % 2 == 1) {
            while (true) ;                 // нет, я решил "повиснуть"
        } else {
            throw new RuntimeException(); // или бросить исключение
        }
    }
}
