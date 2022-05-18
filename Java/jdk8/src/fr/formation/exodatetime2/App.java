package fr.formation.exodatetime2;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int somme = IntStream.range(0, 11).sum();
        Period period = Period.ofDays(somme);
        
        System.out.println(now.plus(period));
    }
}
