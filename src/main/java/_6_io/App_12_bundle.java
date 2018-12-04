package _6_io;

import java.util.Locale;
import java.util.ResourceBundle;

public class App_12_bundle {
    public static void main(String[] args) {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("ru", "RU");
    }

    private static void printInfo(String language, String country) {
        Locale locale = new Locale(language, country);

        System.out.println("For locale: " + locale);

        ResourceBundle rb = ResourceBundle.getBundle("application", locale);

        String key = rb.getString("key");
        System.out.println(key);

        String value = rb.getString("value");
        System.out.println(value);

        System.out.println();
    }
}
