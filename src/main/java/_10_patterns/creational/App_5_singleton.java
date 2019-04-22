package _10_patterns.creational;

/**
 * https://refactoring.guru/ru/design-patterns/singleton
 */
public class App_5_singleton {
    public static void main(String[] args) {
        java.lang.Runtime.getRuntime();
        java.awt.Desktop.getDesktop();
        java.lang.System.getSecurityManager();
    }

    private static class LazySingleton {
        private static LazySingleton instance = null;

        private LazySingleton() {
        }

        public static synchronized LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }
    }
}
