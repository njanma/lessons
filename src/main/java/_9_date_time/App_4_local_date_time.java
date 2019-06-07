package _9_date_time;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * A combination of date and time.
 */
public class App_4_local_date_time {
    public static void main(String[] args) {

        final LocalDateTime now = LocalDateTime.now();
        LocalDateTime.of(2019, Month.JUNE, 7, 18, 30);
        LocalDateTime.parse("2019-06-07T18:30:00");


        now.plusDays(1);
        now.minusHours(2);
        now.getMonth();
    }
}
