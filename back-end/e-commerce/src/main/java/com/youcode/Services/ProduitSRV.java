package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IProduitDAO;
import com.youcode.Entiter.Produit;

@Service
public class ProduitSRV implements IProduitSRV{
	@Autowired
	IProduitDAO produitDAO;

	@Override
	public void addOrUpdateProduit(Produit produit) {
		produitDAO.save(produit);
	}

	@Override
	public Optional<Produit> selectByIdProduit(int id) {
		
		return produitDAO.findById(id);
	}

	@Override
	public List<Produit> selectAllProduit() {
		return produitDAO.findAll();
	}

	@Override
	public void deleteProduit(int id) {
		produitDAO.deleteById(id);
		
	}
}
