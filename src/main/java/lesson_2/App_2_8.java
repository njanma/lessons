package lesson_2;

class ParentA {
    void a() {
    }

    int d() {
        return 1;
    }
}

class ChildB extends ParentA {}

public class App_2_8 {
    public static void main(String[] args) {
        ChildB child = new ChildB();
        child.a();
        child.d();
    }
}


