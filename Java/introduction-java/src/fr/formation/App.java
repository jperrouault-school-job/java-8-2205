package fr.formation;

import fr.formation.model.Produit;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        // demo();
        // App.demo();

        Produit produit = new Produit("Mon produit");
        Produit produit2 = new Produit();
        Produit produit3 = new Produit("Test", 50f);

        // produit.setLibelle("Mon produit 1");
        System.out.println(produit);
    }

    public static void demo() {
        System.out.println("Démonstration");
    }
}
