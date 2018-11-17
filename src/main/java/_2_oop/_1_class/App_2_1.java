//TODO: пакеты
package _2_oop._1_class;

/**
 * 1) у класса всегда есть один конструктор
 * 2) если он не указан явно, компилятор добавит по-умолчанию без аргументов
 * 3) любой пользовательский класс неявно наследуется от java.lang.Object
 */
public class App_2_1 extends Object {

    //инициализация по-умолчанию: 0, false, null
    int x;
    Object y;
    static int staticZ;

    {
        y = new Object();
    }

    static {
        staticZ = 12;
    }

    public int getX() {
        return x + staticZ;
    }

    //доступны только статические переменные
    public static int getZ() {
        return staticZ;
    }
}