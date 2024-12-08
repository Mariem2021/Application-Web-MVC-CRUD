package com.example.product.services;

import com.example.product.entities.Categorie;
import com.example.product.entities.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit prod);
    Produit updateProduit (Produit prod);
    void deleteProduit(Produit prod);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByNomPrix (String nom, Double prix);
    List<Produit> findByCategorie (Categorie categorie);
/*
    List<Produit> findByCategorieIdCat(Long id);
*/
    List<Produit> findByOrderByNomProduitAsc();
    List<Produit> trierProduitsNomsPrix();
}
