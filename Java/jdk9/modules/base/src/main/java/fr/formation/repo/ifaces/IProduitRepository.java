package fr.formation.repo.ifaces;

import java.util.Optional;

import fr.formation.model.Produit;

public interface IProduitRepository {
    public Optional<Produit> findById(int id);
}
