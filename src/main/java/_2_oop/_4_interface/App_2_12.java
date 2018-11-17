package _2_oop._4_interface;

public class App_2_12 {
}

interface I {
    default int getI(){
        return 15;
    }
}

interface J {
    int getJ();
}

interface J2 extends J {
    default int multiplyJ(int multiplier) {
        return getJ() * multiplier;
    }
}

//Предком может быть только класс, но не интерфейс
//class XXX extends I {}

class X implements I {}

class Y implements I, J {

    public int getJ() {
        return getI();
    }

}