package com.example.product;

import com.example.product.entities.Produit;
import com.example.product.repositories.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProductApplicationTests {

/*	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("Mac Book", 800.00, new Date());
		 produitRepository.save(prod);
	}

	@Test
	public void testFindProduit() {
		Produit prod = produitRepository.findById(1L).get();
		System.out.println(prod);
	}

	@Test
	public void testUpdateProduit() {
		Produit prod = produitRepository.findById(1L).get();
		prod.setPrixProduit(1500.0);
		produitRepository.save(prod);
		System.out.println(prod);
	}

	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}

	@Test
	public void testFindAllProduits() {
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods)
			System.out.println(p);
	}*/

	void contextLoads() {
	}

}
