package by.itacademy.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {

    public static final String EMPTY = "";

    public static String defaultIfEmpty(String value) {
        return value == null ? EMPTY : value;
    }
}
