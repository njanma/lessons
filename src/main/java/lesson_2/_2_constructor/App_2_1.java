package lesson_2._2_constructor;

public class App_2_1 {
    public static void main(String[] args) {
        new Children1();
    }
}

class Grandparent1 extends Object {
    int y;

    public Grandparent1() {
//        super(); добавится компилятором
        this.y = this.hashCode();
    }
}

class Parent1 extends Grandparent1 {
    int x;

    public Parent1() {
        //добавится всегда по-умолчанию, если иной super(...) не прописан явно
        super();
        x = y;
    }
}

class Children1 extends Parent1 {
    public Children1() {
        super();
        // к моменту вызова конструктора потомка предок уже сконструирован
        System.out.println(x);
    }
}
