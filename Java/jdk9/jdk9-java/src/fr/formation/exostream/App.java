package fr.formation.exostream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(
            Paths.get(System.getProperty("user.dir") + "/produits.csv"),
            StandardCharsets.ISO_8859_1
        ).stream()
        .map(String::trim)
        .dropWhile(l -> !l.isEmpty())
        .skip(1)
        .forEach(System.out::println);
    }
}
