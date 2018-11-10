package lesson_2._6_encapsulation;

/**
 * private: члены класса доступны только внутри класса;
 * default (package-private) (модификатор, по-умолчанию): члены класса видны внутри пакета (если класс будет так объявлен он будет доступен только внутри пакета);
 * protected: члены класса доступны внутри пакета и в наследниках;
 * public: члены класс доступны всем;
 */
public class App_20 {
    public static void main(String[] args) {
        Fred fred = new Fred(45);

        fred.age = 12;
        System.out.println(fred.age);
    }
}

class Fred {
    int age;

    public Fred(int age) {
        this.age = age;
    }
}
