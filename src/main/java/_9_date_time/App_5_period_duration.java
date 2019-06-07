package _9_date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Period represents a quantity of time in terms of years and months and days.
 * Duration represents a quantity of time in terms of seconds and nano seconds.
 */
public class App_5_period_duration {
    public static void main(String[] args) {
        //Period
        LocalDate nowDate = LocalDate.now();
        LocalDate after5Days = nowDate.plus(Period.ofDays(5));
        int five = Period.between(after5Days, nowDate).getDays();
        //Duration
        LocalTime nowTime = LocalTime.now();
        LocalTime plus30sec = nowTime.plus(Duration.ofSeconds(30));
        Duration between = Duration.between(plus30sec, nowTime);
        long diffInMillis = between.toMillis();
        long thirty = between.getSeconds();
        long thirtyByChrono = ChronoUnit.SECONDS.between(plus30sec, nowTime);
    }
}
