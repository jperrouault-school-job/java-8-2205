package fr.formation;

import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var fruits = List.of("Banane", "Pomme", "Fraise", "Kiwi");

        fruits.stream()
            .sorted()
            // Solution #1
            // .skip(fruits.size() - 1)
            // .findFirst()

            // Solution #2
            .reduce((acc, fruit) -> fruit)

            .ifPresent(System.out::println)
            ;
    }
}
