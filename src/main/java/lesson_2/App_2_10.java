package lesson_2;

class Ax {
    Ax() {}
    Ax(int i) {}
    Ax(Object o) {}
    void f() {}
    int g(int i) {return i + 1;}
}
class Bx extends Ax {}

/**
 * конструкторы, в отличии от методов, не наследуются.
 */
public class App_2_10 {
    public static void main(String[] args) {
        new Bx().f();
        new Bx().g(0);

        new Ax();
        new Ax(0);
        new Ax(null);
        new Bx();
//      new Bx(0);    // ошибка компиляции
//      new Bx(null); // ошибка компиляции
    }
}