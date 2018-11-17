package _2_oop._8_local_and_anonymous_class;

public class App_2 {
    public static void main(String[] args) {
//        Anonym anonym = new Anonym();
//        anonym.exec();
    }
}

abstract class Anonym {
    abstract void exec();

    void doExec() {
        exec();
    }
}
