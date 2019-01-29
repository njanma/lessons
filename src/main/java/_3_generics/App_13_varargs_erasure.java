package _3_generics;

public class App_13_varargs_erasure {
    static <T> T[] method_1(T t1, T t2) {
        return method_2(t1, t2);                       // unchecked warning
    }

    static <T> T[] method_2(T... args) {
        return args;
    }


    public static void main(String... args) {
        String[] strings = method_1("bad", "karma");     // ClassCastException
    }

//    Here is what the compiler generates:

//    static Object[] method_1( Object t1, Object t2) {
//        return method_2( new Object[] {t1, t2} );                   // unchecked warning
//    }
//    static Object[] method_2( Object[] args) {
//        return args;
//    }
//    public static void main(String[] args) {
//        String[] strings = (String[]) method_1("bad", "karma");       // ClassCastException
//    }
}
