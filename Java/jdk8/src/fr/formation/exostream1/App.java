package fr.formation.exostream1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        // Exercice 1
        IntStream
            .range(0, 11)
            // .filter(i -> i % 2 == 0)
            .filter(IntUtil::estPair)
            .forEach(System.out::println);
        
        // Exercice 2
        IntStream
            .range(0, 11)
            // .filter(i -> i % 2 != 0)
            .filter(i -> !IntUtil.estPair(i))
            // .mapToObj(i -> new Produit(i))
            .mapToObj(Produit::new)
            // .forEach(System.out::println)
            .forEach(p -> System.out.println(p.getId()))
            ;
        
        // Exercice 3
        System.out.println(
            IntStream
                .range(0, 11)
                .filter(i -> !IntUtil.estPair(i))
                .sum()
        );
        
        // Exercice 3 - V2
        System.out.println(
            IntStream
                .range(0, 11)
                .filter(i -> !IntUtil.estPair(i))
                .reduce((acc, i) -> acc += i)
                .orElseThrow() // Message d'erreur pour Bastien
        );
    }
}
