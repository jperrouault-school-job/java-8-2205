package fr.formation.exostream1;

public class Produit {
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit() { }

    public Produit(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produit [id=" + this.id + "]";
    }
}
