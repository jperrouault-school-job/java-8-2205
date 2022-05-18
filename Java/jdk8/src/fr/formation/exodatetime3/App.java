package fr.formation.exodatetime3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JULY, 1);
        Period period = Period.between(LocalDate.now(), date);

        System.out.println(period);
        
        System.out.println(
            ChronoUnit.WEEKS.between(LocalDate.now(), date)
        );
    }
}
