package lesson_2._3_inheritance;

public class App_2_11 {
}

abstract class Grandpa {
    void doSomething(){}
    abstract void doNothing();
}

class ParentImpl extends Grandpa{

    void doNothing() {
        doSomething();
    }

}
