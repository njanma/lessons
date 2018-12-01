package _5_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App_23_generic_exception {

    public static void main(String[] args) {
        throwAnException();

//        throw new Exception();
//        sneakyThrow(new Exception());
    }
//    class SomethingWrong<E> extends Exception{}

    static void throwAnException() {
        try {
            throw new IllegalArgumentException();
//        } catch (T ex) {  // ОШИБКА:  перехватить переменную типа нельзя!
        } catch (Throwable ex) {
            Logger.getGlobal().log(Level.WARNING, "An exception was thrown: " + ex);

            App_23_generic_exception.<RuntimeException>throwAs(ex);
//            App_23_generic_exception.<Exception>throwAs(ex);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;  // Приведение обобщенного типа, стирается в тип  (Throwable)  е
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow(Throwable e) throws T {
        throw (T) e;
    }
}


