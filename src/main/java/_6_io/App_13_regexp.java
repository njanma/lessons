package _6_io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO: https://regex101.com
 */
public class App_13_regexp {
    public static void main(String[] args) {

        String regex = "[+-]?\\d+";
        String tel1 = "+375295555555";
        String tel2 = "+375(29)555-55-55";

        match(regex, tel1);

        match(regex, tel2);
        find(regex, tel2);
    }

    static void match(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (Pattern.matches(regex, input) || matcher.matches()) {
            System.out.println("matches!");
        }
    }

    static void find(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }

    }
}
