package fr.formation;

import java.util.ServiceLoader;

import fr.formation.model.Produit;
import fr.formation.service.ifaces.IProduitService;

public class App {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        // Récupérer le service ProduitService disponible
        ServiceLoader<IProduitService> services = ServiceLoader.load(IProduitService.class);

        // ProduitRepository repo; // Pas dispo
        // ProduitServiceV2 srv; // Pas dispo
        IProduitService srvProduit = services.findFirst().orElseThrow();

        // Afficher le toString du produit si trouvé
        // Sinon afficher le message "Produit non trouvé"
        try {
            Produit produit = srvProduit.findById(1);
            System.out.println(produit);
        }

        catch (Exception ex) {
            System.out.println("Produit non trouvé...");
        }

        // Tenter de manipuler le champ "id" de Produit par la réfléxivité
    }
}
