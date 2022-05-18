package fr.formation.repo;

import java.util.Optional;

import fr.formation.model.Produit;
import fr.formation.repo.ifaces.IProduitRepository;

public class ProduitRepository implements IProduitRepository {
    @Override
    public Optional<Produit> findById(int id) {
        return Optional.ofNullable((id <= 3) ? null : new Produit(id));
    }
}
