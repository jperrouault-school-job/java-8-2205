package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Produit;
import fr.formation.projection.ProduitProjection;
import fr.formation.repo.ProduitRepository;

@RestController
public class HelloController {
    @Autowired
    private ProduitRepository repoProduit;

    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public List<ProduitProjection> hello() {
        return repoProduit.findAllProjected();
    }

    @GetMapping("/hello/{id}")
    public Produit hello(@PathVariable int id) {
        return Produit.builder()
            .id(id)
            .libelle("Hello")
            .build();
    }

    @GetMapping("/hello/produit")
    public boolean hello(Produit produit) {
        System.out.println(produit.getLibelle());

        return true;
    }

    @PostMapping("/hello/produit")
    public boolean postHello(@RequestBody Produit produit) {
        System.out.println(produit.getLibelle());

        return true;
    }
}
