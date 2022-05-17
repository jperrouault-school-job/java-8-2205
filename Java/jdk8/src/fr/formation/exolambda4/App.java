package fr.formation.exolambda4;

public class App {
    private static String message = "";

    public static void main(String[] args) {
        ProduitRepository repoProduit = new ProduitRepository();

        System.out.println(
            // repoProduit.findById(1).get()
            // repoProduit.findById(1).orElse(Produit::new)
            // repoProduit.findById(1).orElse(() -> new Produit(42))
            repoProduit.findById(10).orElse(() -> null)
        );

        repoProduit
            .findById(2)
            .filter(p -> p.getId() == 1)
            .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Pas de produit")
            );
        
        // Exemple association attribut (ne fonctionne pas pour les variables)
        repoProduit
            .findById(2)
            .filter(p -> p.getId() == 1)
            .ifPresentOrElse(
                p -> message = "Produit OK",
                () -> message = "Produit KO"
            );
        
        System.out.println(message);


        Produit produit = repoProduit.findById(10).orElseThrow(ProduitNotFoundException::new);
        System.out.println(produit);
    }
}
