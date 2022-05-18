package fr.formation;

import java.lang.reflect.Field;

import fr.formation.model.Produit;

public class App {
    public static void main(String[] args) throws Exception {
        Produit produit = new Produit();
        Field field = Produit.class.getDeclaredField("id");

        field.setAccessible(true);
        System.out.println(field.get(produit));
        
        field.set(produit, 43);
        System.out.println(field.get(produit));
    }
}
