package _5_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App_23_generic_exception {

//    class SomethingWrong<E> extends Exception{}

    static <T extends Throwable> void throwAn(Class<T> clazz) {
        try {
            throw new IllegalArgumentException();
//        } catch (T ex) {  // ОШИБКА:  перехватить переменную типа нельзя!
        } catch (Throwable ex) {
            Logger.getGlobal().log(Level.WARNING, "An exception was thrown: " + ex);

            throwAs(ex, RuntimeException.class);
//            throwAs(ex, Exception.class);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e, Class<T> cl) throws T {
        throw (T) e;  // Приведение обобщенного типа, стирается в тип  (Throwable)  е
    }
}


