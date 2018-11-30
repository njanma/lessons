package _4_collections;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class App_21_enum_collections {
    public static void main(String[] args) {
        //Set
        Set<Weekday> always = EnumSet.allOf(Weekday.class);
        Set<Weekday> never = EnumSet.noneOf(Weekday.class);
        Set<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        Set<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);

        //Map
        Map<Weekday, Integer> days = new EnumMap<>(Weekday.class);
        days.put(Weekday.MONDAY, 1);
        days.put(Weekday.TUESDAY, 2);
        days.put(Weekday.WEDNESDAY, 3);
    }

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,
    }
}
