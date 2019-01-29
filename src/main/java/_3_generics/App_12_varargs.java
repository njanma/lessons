package _3_generics;

/**
 * http://www.angelikalanger.com/GenericsFAQ/FAQSections/ParameterizedTypes.html
 */
public class App_12_varargs {
    /**
     * The @SafeVarargs annotation is only permitted on methods that cannot be overridden, i.e.,
     * static methods,
     * final instance methods,
     * constructors, and
     * private instance methods (since Java 9).
     */
    @SafeVarargs
    private static <T> T[] varargsMethod(T... args) {
        T arg = args[0];//java.lang.ArrayIndexOutOfBoundsException: 0
        return args;
    }

    @SafeVarargs
    private static <T> T[] varargsWithFirst(T fst, T... args) {
        T arg = fst;
        return args;
    }

    //    @SafeVarargs
    private <T> T[] privateVarargsMethod(T... args) {
        return args;
    }


    public static void main(String... args) {
        String[] strings = varargsMethod("bad", "karma");
        String[] strings2 = varargsMethod();
        String[] strings3 = varargsWithFirst("");
    }
}
