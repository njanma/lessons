package _9_date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 */
public class App_8_compatibility {
    public static void main(String[] args) {
        final Date javaOldDate = new Date();
        GregorianCalendar calendar = new GregorianCalendar(2019, Calendar.JUNE, 9);

        LocalDateTime.ofInstant(javaOldDate.toInstant(), ZoneId.systemDefault());
        LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        Date javaOldDateFromInstant = Date.from(Instant.now());
        ZonedDateTime zonedDateTimeFromCalendar = calendar.toZonedDateTime();
        GregorianCalendar.from(zonedDateTimeFromCalendar);

        LocalDateTime.ofEpochSecond(System.currentTimeMillis(), 0, ZoneOffset.UTC);

        System.out.println("calendar: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("local date: " + LocalDate.of(2019, 6, 9).getDayOfWeek().getValue());
    }
}
