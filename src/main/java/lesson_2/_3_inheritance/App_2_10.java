package lesson_2._3_inheritance;

class A {
    A() {}
    A(int i) {}
    A(Object o) {}
    void f() {}
    int g(int i) {return i + 1;}
}
class B extends A {}

/**
 * конструкторы, в отличии от методов, не наследуются.
 */
public class App_2_10 {
    public static void main(String[] args) {
        new B().f();
        new B().g(0);

        new A();
        new A(0);
        new A(null);
        new B();
//      new B(0);    // ошибка компиляции
//      new B(null); // ошибка компиляции
    }
}