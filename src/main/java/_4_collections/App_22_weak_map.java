package _4_collections;

import java.util.WeakHashMap;

public class App_22_weak_map {

    public static void main(String[] args) throws Exception {
        WeakHashMap<Object, Object> weakHashMap = new WeakHashMap<>();
        Object newObject = new Object();

        weakHashMap.put(newObject, null);
        System.out.println(weakHashMap);

        newObject = null;
        System.gc();
        System.out.println(weakHashMap);
    }
}
