package _3_generics;

import java.util.ArrayList;

public class App_3_intersection_type {

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) elem.close();
    }

    public static <T extends AutoCloseable & Runnable> void runAndcloseAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) {
            elem.run();
            elem.close();
        }
    }
}
