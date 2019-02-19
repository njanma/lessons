package _6_io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App_14_regexp_format {
    public static void main(String[] args) {
        String value = "asdfasdf sdfsdf +375297295542 asdfasdf asdfasdfasdf " +
                "sdfas+375291590896dfssdfg asdf asdf as dfas 375297662933 df asdf a sdf";
        Pattern pattern = Pattern.compile("([+-]?375)(?<code>25|29|33|44)(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(value);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "$1 ($2) $3-$4-$5");
        }
        matcher.appendTail(stringBuffer);

        System.out.println(stringBuffer);
    }

    private static void test() {
        String value = "+375297295542";
        Pattern pattern = Pattern.compile("^(\\+375|80)\\s?\\(?(25|29|33|44)\\)?\\s?(\\d)(\\2)-?\\d{2}-?\\d{2}$");
        Matcher matcher = pattern.matcher(value);
        System.out.println(matcher.matches());
    }
}
