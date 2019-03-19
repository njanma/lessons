package by.itacademy.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JspHelper {

    private static final String PREFIX = "/WEB-INF/jsp/";
    private static final String SUFFIX = ".jsp";


    public static String getPath(String pageName) {
        return PREFIX + pageName + SUFFIX;
    }
}
