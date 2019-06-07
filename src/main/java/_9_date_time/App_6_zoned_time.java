package _9_date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Zone API
 */
public class App_6_zoned_time {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        ZonedDateTime zonedDateTimeOfInst = ZonedDateTime.ofInstant(Instant.now(), zoneId);
        ZonedDateTime nowFromUtcZone = Instant.now().atZone(ZoneId.of("UTC"));
        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");

        //В 2013 году переход на летнее время в Центральной Европе произошел 31 марта в 2:00.
        //Если попытаться рассчитать время в несуществующий момент 2:30 31 марта 2013 года,
        //то на самом деле будет получено время 3:30
        ZonedDateTime skipped = ZonedDateTime.of(
                LocalDate.of(2013, 3, 31),
                LocalTime.of(2, 30),
                ZoneId.of("Europe/Berlin"));


        ZoneOffset offset = ZoneOffset.of("+02:00");
        ZoneOffset dateTimeOffset = zonedDateTime.getOffset();
        OffsetDateTime offSetByTwo = OffsetDateTime.of(LocalDateTime.now(), offset);

        LocalDate localDate = zonedDateTime.toLocalDate();
        LocalTime localTime = zonedDateTime.toLocalTime();
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
    }
}
