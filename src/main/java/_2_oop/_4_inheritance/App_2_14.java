package _2_oop._4_inheritance;

/**
 * task
 */
public class App_2_14 {
    public static void main(String[] args) {
        B1 x = new C1();
        printLetter(new C1());
        printLetter(new B1());
        printLetter(new A1());
    }


    static void printLetter(A1 a){
        a.f();
    }
}

class A1 {
    public void f() {
        System.out.println("A.f()");
    }
}

class B1 extends A1 {
    @Override
    public void f() {
        System.out.println("B.f()");
    }
}

class C1 extends B1 {
    @Override
    public void f() {
        System.out.println("C.f()");
    }
}
