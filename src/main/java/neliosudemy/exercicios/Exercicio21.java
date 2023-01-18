package neliosudemy.exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicio21 {
/*
    Principais tipos de Data a partir do Java 8
    - Data-hora local
        LocalDate
        LocalDateTime
    - Data-hora global
        Instant
    - Duração
        Duration
    - Outros
        ZoneId
        ChronoUnit
 */

    public static void main(String[] args) {

        /*
        o .toString() gera em formato ISO 8601 por padrão
         */

        DateTimeFormatter ldDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ldtDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate.toString());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " +localDateTime.toString());
        Instant instant = Instant.now();
        // O Z no fim significa GMT
        System.out.println("Instant: " +instant.toString());

        System.out.println("===============================================");

        LocalDate ld = LocalDate.parse("2022-07-20");
        System.out.println("LocalDate com parse: " +ld.toString());
        LocalDateTime ldt = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("LocalDateTime com parse: " +ldt.toString());
        Instant inst = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Instant com parse: " +inst.toString());


        LocalDate ldWithFormatter = LocalDate.parse("2022/07/20", ldDateTimeFormatter);
        System.out.println(ldWithFormatter.toString());
        LocalDateTime ldtWithFormatter = LocalDateTime.parse("20/07/2022 01:30", ldtDateTimeFormatter);
        System.out.println(ldtWithFormatter.toString());

        LocalDate off = LocalDate.of(2022, 7, 20);
        System.out.println("LocalDate com off: " +off.toString());

    }
}
