package lesson_2;

/**
 * 1) у класса всегда есть один конструктор
 * 2) если он не указан явно, компилятор добавит по-умолчанию без аргументов
 * 3) любой пользовательский класс неявно наследуется от java.lang.Object
 */
public class App_2_1 extends Object {

    int x;

    public App_2_1() {
        //добавится всегда по-умолчанию, если иной super(...) не прописан явно
        super();
        x = this.hashCode();
    }

    public App_2_1(int k) {
    }
}

class Children1 extends App_2_1 {
    public Children1() {
        super();
        // к моменту вызова конструктора потомка предок уже сконструирован
        System.out.println(x);
    }
}
