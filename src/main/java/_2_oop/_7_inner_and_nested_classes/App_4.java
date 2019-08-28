package _2_oop._7_inner_and_nested_classes;

public class App_4 {

    public static void main(String[] args) {
        int i = A.i;
//        int i2 = A.getI();
    }

    class A {
        public static final int i = 2;

        //inner classes cannot have static declarations.
//        public static int getI(){return 1;}
    }

}