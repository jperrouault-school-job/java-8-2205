package fr.formation.exostream2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        Path path = Paths.get(dir + "/produits.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.ISO_8859_1);

        List<Produit> produits = lines
            .stream()
            .skip(1) // On évite l'en-tête
            .map(String::trim)
            .filter(l -> !l.isEmpty())
            .map(l -> l.split(";"))
            .filter(l -> l.length == 3)
            .map(Produit::new)
            .sorted((p1, p2) -> Integer.compare(p1.getId(), p2.getId()))
            .collect(Collectors.toList());
        
        produits.forEach(System.out::println);

        System.out.println("-------");

        Produit produit = produits
            .stream()
            .filter(p -> p.getLibelle().contains("nai"))
            .findFirst()
            .orElse(new Produit());
        
        System.out.println(produit);
    }
}
