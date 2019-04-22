package _10_patterns.creational;

import java.util.Locale;
import java.util.TimeZone;

/**
 * https://refactoring.guru/ru/design-patterns/factory-method
 */
public class App_1_factory_method {
    public static void main(String[] args) {
        java.util.Calendar.getInstance(TimeZone.getDefault());
        java.util.ResourceBundle.getBundle("app");
        java.text.NumberFormat.getInstance(Locale.ENGLISH);
        java.util.EnumSet.of(Numbers.ONE, Numbers.TWO);
        java.util.EnumSet.allOf(Numbers.class);
    }

    private enum Numbers {
        ONE, TWO
    }
}
