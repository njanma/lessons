package _2_oop._3_inheritance;

/**
 * anonymous class
 */
public class App_2_16 {
    public static void main(String[] args) {
        func("Hi");
        func(new int[]{1,2,3});
        func(new D());

        numberFunc(new Double(15.0));
//        numberFunc(new D());
        numberFunc(new Number() {
            @Override
            public int intValue() {
                return 0;
            }
            @Override
            public long longValue() {
                return 0;
            }
            @Override
            public float floatValue() {
                return 0;
            }
            @Override
            public double doubleValue() {
                return 0;
            }
        });
    }

    static void func(Object arg){
        System.out.println("arg is: " + arg.toString());
    }

    static void numberFunc(Number number){
        System.out.println("number is: " + number.intValue());
    }
}

class D{}
