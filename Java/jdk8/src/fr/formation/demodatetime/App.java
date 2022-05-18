package fr.formation.demodatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate lastYear = now.minusYears(1);

        System.out.println(
            Period.between(lastYear, now)
        );

        Period period = Period.parse("P1Y3M5D");
        System.out.println(now.plus(period));

        System.out.println("------------------");

        LocalTime tnow = LocalTime.now();
        LocalTime lastHour = tnow.minus(1, ChronoUnit.HOURS);

        System.out.println(
            Duration.between(lastHour, tnow)
        );


        System.out.println("---------------");
        System.out.println(
            now.format(DateTimeFormatter.ofPattern("MM dd-yyyy"))
        );

        System.out.println(
            now.format(
                DateTimeFormatter
                    .ofLocalizedDate(FormatStyle.FULL)
                    .withLocale(Locale.ENGLISH)
            )
        );
    }
}
