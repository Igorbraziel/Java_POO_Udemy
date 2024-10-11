package HourAndDate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;

public class InstantToLocal {
    public static void main(String[] args) {
        Instant d1 = Instant.parse("2024-09-12T21:39:00Z");
        LocalDateTime localTime = LocalDateTime.ofInstant(d1, ZoneId.systemDefault());
        System.out.println(localTime);
    }
}
