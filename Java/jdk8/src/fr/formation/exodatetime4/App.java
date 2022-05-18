package fr.formation.exodatetime4;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(2022, Month.DECEMBER, 25),
            LocalDate.of(2022, Month.JUNE, 6),
            LocalDate.of(2022, Month.MARCH, 21),
            LocalDate.of(2023, Month.JANUARY, 1),
            LocalDate.now()
        );

        // dates
        //     .stream()
        //     .sorted()
        //     .forEach(d -> System.out.println(
        //         d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))
        //     ));

        dates
            .stream()
            .sorted()
            .map(d -> d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)))
            .forEach(System.out::println);
    }
}
