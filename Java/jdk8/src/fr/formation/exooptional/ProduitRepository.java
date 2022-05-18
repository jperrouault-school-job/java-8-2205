package fr.formation.exooptional;

import java.util.Optional;

public class ProduitRepository {
    public Optional<Produit> findById(int id) {
        // if (id <= 3) {
        //     return Optional.empty();
        // }

        // return Optional.of(new Produit(id));

        return Optional.ofNullable((id <= 3) ? null : new Produit(id));
    }
}
