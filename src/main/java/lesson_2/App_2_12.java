package lesson_2;

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

//Предком может быть только класс, но не интерфейс
//class XXX extends I {}

class X_12 implements I {}

class Y_12 implements I, J {

    public int getJ() {
        return getI();
    }

}