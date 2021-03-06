package fr.formation.exolambda3;

import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        // useCtor(Produit::new);

        Supplier<Produit> ctor1 = Produit::new;
        Function<String, Produit> ctor2 = Produit::new;
        InfiniteFunction<Produit> ctor3 = Produit::new;

        useCtor(ctor3);
    }

    public static void useCtor(InfiniteFunction<Produit> ctor) {
        Produit produit = ctor.apply("Libellé", "prix", 53, 4310d);

        System.out.println(produit);
    }

    public static void useCtor(Supplier<Produit> ctor) {
        Produit produit = ctor.get();

        System.out.println(produit);
    }

    public static void useCtor(Function<String, Produit> ctor) {
        Produit produit = ctor.apply("Libellé par défaut ...");

        System.out.println(produit);
    }
}
