package _9_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * DateTimeFormatter
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html">date formatter</a>
 */
public class App_7_formatting {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
        String sameLocalDateString = DateTimeFormatter.ISO_DATE.format(localDateTime);

        String formattedByPattern = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        String formattedByStyle = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
    }
}
