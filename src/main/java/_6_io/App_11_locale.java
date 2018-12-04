package _6_io;

import java.util.Locale;

public class App_11_locale {
    public static void main(String[] args) {
        Locale fr = Locale.FRANCE;
        Locale us = Locale.US;
        Locale rus = new Locale("ru", "RU");

        Locale current = Locale.getDefault();
        getLocaleInfo(current);

        Locale.setDefault(Locale.CANADA);
        current = Locale.getDefault();
        getLocaleInfo(current);

        Locale.setDefault(new Locale("uk", "UA"));
        current = Locale.getDefault();
        getLocaleInfo(current);
    }

    public static void getLocaleInfo(Locale current) {
        System.out.println("Country code: " + current.getCountry());
        System.out.println("Country name: " + current.getDisplayCountry());
        System.out.println("Lang code: " + current.getLanguage());
        System.out.println("Lang name: " + current.getDisplayLanguage());
        System.out.println();
    }
}
