package fr.formation.exolambda3;

public class Produit {
    public Produit() {
        System.out.println("CREATION DU PRODUIT ...");
    }

    public Produit(String libelle) {
        System.out.println("CREATION DU PRODUIT ... " + libelle);
    }

    public Produit(Object... args) {
        System.out.println("CREATION DU PRODUIT INFINI ..." + args);
    }
}
