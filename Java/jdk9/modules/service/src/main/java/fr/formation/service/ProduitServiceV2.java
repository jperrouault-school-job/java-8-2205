package fr.formation.service;

import fr.formation.exception.ProduitNotFoundException;
import fr.formation.model.Produit;
import fr.formation.repo.ProduitRepository;
import fr.formation.repo.ifaces.IProduitRepository;
import fr.formation.service.ifaces.IProduitService;

public class ProduitServiceV2 implements IProduitService {
    private IProduitRepository repoProduit = new ProduitRepository();

    @Override
    public Produit findById(int id) {
        return repoProduit.findById(id).orElseThrow(ProduitNotFoundException::new);
    }
}
