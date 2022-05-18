package fr.formation.exooptional;

public class Produit {
    private int id;

    public Produit() { }

    public Produit(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produit [id=" + this.id + "]";
    }
}
