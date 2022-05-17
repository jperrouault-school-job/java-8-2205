package fr.formation.exolambda4;

public class ProduitRepository {
    public Option<Produit> findById(int id) {
        if (id <= 3) {
            return new Option<>(null);
        }

        return new Option<>(new Produit(id));
    }
}
