package _9_date_time;

import java.time.Duration;
import java.time.Instant;

/**
 * Time snapshot in milliseconds from EPOCH.
 */
public class App_1_instant {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Instant startOfEpoch = Instant.ofEpochMilli(0);

        Duration timeElapsed = Duration.between(start, end);
        Instant plus123Nanos = start.plusNanos(123);
        Instant plus1sec = start.plus(Duration.ofSeconds(1));
    }
}
