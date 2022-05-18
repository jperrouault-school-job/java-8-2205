package fr.formation.exostream2;

public class Produit {
    private int id;
    private String libelle;
    private float prix;

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public Produit() { }

    public Produit(String... args) {
        try {
            this.libelle = args[0];
            this.id = Integer.parseInt(args[2]);
            this.prix = Float.parseFloat(args[1].replace(",", "."));
        }

        catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + "]";
    }
}
