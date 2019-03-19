package by.itacademy.util;

import lombok.experimental.UtilityClass;

import java.util.Objects;

@UtilityClass
public class StringUtil {

    private static final String EMPTY = "";

    public static boolean isEmpty(String value) {
        return Objects.isNull(value) || EMPTY.equals(value.trim());
    }

    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }
}
