package fr.formation.exooptional;

public class App {
    public static void main(String[] args) {
        ProduitRepository repoProduit = new ProduitRepository();

        try {
            Produit produit = repoProduit
                .findById(10)
                .orElseThrow(ProduitNotFoundException::new);
            System.out.println(produit);
        }

        catch (ProduitNotFoundException pnfe) {
            System.out.println("Le produit n'a pas été trouvé ...");
        }
    }
}
