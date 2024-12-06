package com.example.product.services;

import com.example.product.entities.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit prod);
    Produit updateProduit (Produit prod);
    void deleteProduit(Produit prod);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
