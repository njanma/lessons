package _3_generics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App_9_exception {

    //class SomethingWrong<E> extends Exception{}

    public static <T extends Throwable> void doWork(Runnable r, Class<T> cl) {
        try {
            r.run();
//        } catch (T ex) {  // ОШИБКА:  перехватить переменную типа нельзя!
        } catch  (Throwable ex)  {
            App_9_exception.<RuntimeException>throwAs(ex);
            Logger.getGlobal().log(Level.WARNING, "An exception was thrown: " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;  // Приведение обобщенного типа, стирается в тип  (Throwable)  е
    }
}


