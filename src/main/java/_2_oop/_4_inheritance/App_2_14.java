package _2_oop._4_inheritance;

/**
 * task
 */
public class App_2_14 {
    public static void main(String[] args) {
        B1 x = new C1();
        x.f();
    }
}

class A1 {
    public void f() {
        System.out.println("A.f()");
    }
}

class B1 extends A1 {
    public void f() {
        System.out.println("B.f()");
    }
}

class C1 extends B1 {
    public void f() {
        System.out.println("C.f()");
    }
}
