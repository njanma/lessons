package _2_oop._5_interface;

public class App_2_12 {
}

interface I {
    public default int getI() {
        return 15;
    }
}

interface J {
    public final static String J_CONSTANT = "";

    public abstract int take(int i);

    public default int getI() {
        return 15;
    }

    public static int ddd() {
        return 0;
    }
}

interface J2 extends J {
    public default int multiplyJ(int multiplier) {
        return take(19) * multiplier;
    }
}

//Предком может быть только класс, но не интерфейс
//class XXX extends I {}

class X implements I {
}

class Y implements J {

    @Override
    public int take(int i) {
        return getI();
    }

    @Override
    public int getI() {
        return J.super.getI();
    }
}