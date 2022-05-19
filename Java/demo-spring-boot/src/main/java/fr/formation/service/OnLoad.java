package fr.formation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import fr.formation.model.Produit;
import fr.formation.repo.ProduitRepository;

@Service
public class OnLoad implements CommandLineRunner {
    @Autowired
    private ProduitRepository repoProduit;

    @Override
    public void run(String... args) throws Exception {
        repoProduit.save(
            Produit.builder().libelle("TOTO").build()
        );

        repoProduit.save(
            Produit.builder().libelle("TOTO 2").build()
        );

        repoProduit.save(
            Produit.builder().libelle("TOTO 3").build()
        );
    }
}
