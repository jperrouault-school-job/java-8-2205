package fr.formation.exodatetime1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.of(2022, Month.JUNE, 1);

        // LocalDate date = LocalDate
        //     .parse(
        //         "01/06/2022",
        //         DateTimeFormatter.ofPattern("dd/MM/yyyy")
        //     );

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        LocalDate date = LocalDate.parse("01/06/2022",formatter);
        
        // Period period = Period.of(1, 5, 10);
        Period period = Period.parse("P1Y5M10D");

        date = date.plus(period);

        System.out.println(
            date.format(formatter)
        );
    }
}
