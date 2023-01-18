package neliosudemy.exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercicio22 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant instant = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("LocalDate + Format " + localDate.format(dateFormatter));
        System.out.println("Format + LocalDate " + dateFormatter.format(localDate));
        System.out.println("LocalDate formatando direto " +localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\n");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("LocalDateTime + Format " + localDateTime.format(dateTimeFormatter));
        System.out.println("Format + LocalDateTime " + dateTimeFormatter.format(localDateTime));
        System.out.println("LocalDateTime formatando direto " +localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("\n");

        DateTimeFormatter dateTimeFormatterZ = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Format + Instant " +dateTimeFormatterZ.format(instant));

        DateTimeFormatter dateFormatterIso = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("LocalDateTime com formato ISO " +dateFormatterIso.format(localDateTime));

    }
}
