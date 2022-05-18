package fr.formation.model;

public class Produit {
    private int id;
    private String libelle;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Produit() { }

    public Produit(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + "]";
    }
}
