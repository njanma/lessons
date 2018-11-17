package _2_oop._3_inheritance;

/**
 * class cast exception
 */
public class App_2_17 {
    public static void main(String[] args) {
        numberFunc(new E());
        numberFunc(new Double(15.0));
        numberFunc(new Integer(5));
    }

    static void numberFunc(Object arg) {
        Number number = (Number) arg;
        System.out.println("number is: " + number.intValue());
    }
}

class E {
}
