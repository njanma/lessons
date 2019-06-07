package _9_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * A date in ISO format (yyyy-MM-dd) without time.
 */
public class App_2_local_date {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate.of(2019, 6, 6);
        LocalDate.of(2019, Month.JUNE, 6);
        LocalDate.parse("2019-06-06");

        LocalDate tomorrow = now.plusDays(1);
        LocalDate yesterday = now.minusDays(1);

        long diffInDays = yesterday.until(tomorrow, ChronoUnit.DAYS);

        final LocalDate feb29 = LocalDate.of(2016, 3, 31).minusMonths(1);

        LocalDate prevYear = now.minus(1, ChronoUnit.YEARS);

        DayOfWeek friday = LocalDate.parse("2019-06-07").getDayOfWeek();

        int six = LocalDate.parse("2019-06-06").getDayOfMonth();

        boolean isYearLeap = LocalDate.now().isLeapYear();


        boolean notBefore = LocalDate.parse("2019-06-12")
                .isBefore(LocalDate.parse("2019-06-11"));

        boolean isAfter = LocalDate.parse("2019-06-12")
                .isAfter(LocalDate.parse("2019-06-11"));

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());


        MonthDay monthDay = MonthDay.now();
        YearMonth yearMonth = YearMonth.now();
        Year year = Year.now();
        LocalDate localDateFromYearAndMonthDay = year.atMonthDay(monthDay);
        LocalDate localDateFromYMatDay = yearMonth.atDay(1);
    }
}
