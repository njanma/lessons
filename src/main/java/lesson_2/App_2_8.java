package lesson_2;

class ParentA extends Object{
    public ParentA() {
        super();
    }

    void a() {
    }

    int d() {
        return 1;
    }
}

class ChildB extends ParentA {
    public ChildB() {
        super();
    }
}

public class App_2_8 {
    public static void main(String[] args) {
        ChildB child = new ChildB();
        child.a();
        child.d();
    }
}


