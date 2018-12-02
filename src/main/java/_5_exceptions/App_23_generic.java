package _5_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App_23_generic {
//        class SomethingWrong<E> extends Exception{}
//        class SomethingWrong extends Exception{}

    static void throwAnException() {
        try {
            throw new IllegalArgumentException();
//        } catch (T ex) {  // ОШИБКА:  перехватить переменную типа нельзя!
        } catch (Throwable ex) {
            Logger.getGlobal().log(Level.WARNING, "An exception was thrown: " + ex);
        }
    }


}
