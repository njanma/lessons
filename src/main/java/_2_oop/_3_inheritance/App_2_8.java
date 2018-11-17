package _2_oop._3_inheritance;

class Parent extends Object{
    public Parent() {
        super();
    }

    void a() {
    }

    int d() {
        return 1;
    }
}

class Child extends Parent {
    public Child() {
        super();
    }
}

public class App_2_8 {
    public static void main(String[] args) {
        Child child = new Child();
        child.a();
        child.d();
    }
}


