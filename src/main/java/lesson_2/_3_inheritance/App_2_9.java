package lesson_2._3_inheritance;

class X extends Object {}
class Y {}
class Z extends Thread {}
//class W extends X, Y{}


public class App_2_9 {
    public static void main(String[] args) {
        // проверим при помощи Reflection API
        Class[] classes = {X.class, Y.class, Z.class};
        for (Class clazz : classes) {
            Class parent = clazz.getSuperclass();
            System.out.println(clazz + " extends " + parent);
        }
        // проверим при помощи компилятора
        Object o1 = new X();
        Object o2 = new Y();
        Object o3 = new Z();
    }
}
