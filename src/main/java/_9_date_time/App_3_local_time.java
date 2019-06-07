package _9_date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Time without a date.
 */
public class App_3_local_time {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime sixThirty = LocalTime.parse("06:30");
        LocalTime ofSixThirty = LocalTime.of(6, 30);

        LocalTime sevenThirtyByPlusHours = LocalTime.parse("06:30").plusHours(1);
        LocalTime sevenThirtyByWithHour = LocalTime.of(6, 30).withHour(1);
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        LocalTime fiveThirty = LocalTime.parse("06:30").minus(1, ChronoUnit.HOURS);

        int six = LocalTime.parse("06:30").getHour();
        int thirty = LocalTime.parse("06:30").getMinute();

        int secFromMidnight = LocalTime.now().toSecondOfDay();

        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));

        LocalTime maxTime = LocalTime.MAX;
    }
}
