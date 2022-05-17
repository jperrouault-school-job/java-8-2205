package fr.formation.model;

public class Produit {
    // final = constante
    private final int id = 1;
    private String libelle;
    private float prix;

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Produit() {
        // this.libelle = "Défaut";
        this("Défaut");
    }

    public Produit(String libelle) {
        this.libelle = libelle;
    }

    public Produit(Object... obj) {
        // obj = tableau
        this.libelle = (String)obj[0];
        this.prix = (Float)obj[1];

        System.out.println(this.libelle);
        System.out.println(this.prix);
    }

    @Override
    public String toString() {
        return "Produit [libelle = " + this.libelle + "]";
    }
}
