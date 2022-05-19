package fr.formation.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.model.Produit;
import fr.formation.projection.ProduitProjection;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    public List<Produit> findByLibelle(String libelle);

    @Query("select p from Produit p")
    public List<ProduitProjection> findAllProjected();
}
