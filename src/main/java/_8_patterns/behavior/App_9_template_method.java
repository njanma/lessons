package _8_patterns.behavior;

/**
 * https://refactoring.guru/ru/design-patterns/template-method
 */
public class App_9_template_method {
    public static void main(String[] args) {
        new PrintLetters().doSomething();
        System.out.println();
        new PrintNumbers().doSomething();
    }
}
abstract class DoingSomething{

    final void doSomething(){
        System.out.println("doing something!");
        andThenDo();
    }

    abstract void andThenDo();
}

class PrintLetters extends DoingSomething{
    @Override
    void andThenDo() {
        System.out.println("some letters: A, B, C, etc.");
    }
}

class PrintNumbers extends DoingSomething{
    @Override
    void andThenDo() {
        System.out.println("some numbers: 0, 1, 2, etc.");
    }
}
