package HourAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

class DateHourExample {

    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant globalDate = Instant.now();

        System.out.println("LocalDate = " + localDate);
        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Instant/GlobalDate = " + globalDate);

        LocalDateTime d01 = LocalDateTime.parse("2024-09-11T14:00:50");

        System.out.println("LocalDateTime/parse = " + d01);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(d01.format(formatter));
    }

}