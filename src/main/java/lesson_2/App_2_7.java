package lesson_2;


class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}

public class App_2_7 {
    public static void main(String[] args) {
        B ref = new C();
    }
}
