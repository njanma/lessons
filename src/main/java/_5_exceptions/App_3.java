package _5_exceptions;

import java.util.function.Supplier;

/**
 * \                      буфер сообщений
 * \                    +----------------+
 * \                +->| msg2 msg1 msg0 | --> out
 * \                /   +----------------+        \
 * \               /                                 +-> +--------+
 * \ВАШЕ ПРИЛОЖЕНИЕ                                      | КОНСОЛЬ|
 * \               \                                 +-> +--------+
 * \                \                               /
 * \                 +------------------------> err
 * \                 нет буфера, сразу печатаем
 */
public class App_3 {
    public static void main(String[] args) throws Exception {
        printMessage(() -> "message", 1000);
        throw new Error();
    }

    static void printMessage(Supplier<String> messageProducer, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(messageProducer.get());
        }
    }
}
