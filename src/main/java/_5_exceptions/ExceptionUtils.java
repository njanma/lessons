package _5_exceptions;

public class ExceptionUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void sneakyThrow(Throwable e) throws T {
        throw (T) e; // Приведение обобщенного типа, стирается в тип  (Throwable)  е
    }
}
