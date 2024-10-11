package HourAndDate;

import java.time.LocalDateTime;
import java.time.Duration;

public class DateOperations {
    public static void main(String[] args) {
        LocalDateTime localDateNow = LocalDateTime.now();
        LocalDateTime retirementDate = LocalDateTime.parse("2029-07-30T00:00:00");
        Duration timeLeftToRetire = Duration.between(localDateNow, retirementDate);
        System.out.println("Dias Restantes Para se Aposentar: " + timeLeftToRetire.toDays());
    }
}
