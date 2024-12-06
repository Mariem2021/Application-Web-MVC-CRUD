package com.example.product.services.serviceImpl;

import com.example.product.entities.Produit;
import com.example.product.repositories.ProduitRepository;
import com.example.product.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit saveProduit(Produit prod) {
        return produitRepository.save(prod);
    }

    @Override
    public Produit updateProduit(Produit prod) {
        return produitRepository.save(prod);
    }

    @Override
    public void deleteProduit(Produit prod) {
        produitRepository.delete(prod);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
