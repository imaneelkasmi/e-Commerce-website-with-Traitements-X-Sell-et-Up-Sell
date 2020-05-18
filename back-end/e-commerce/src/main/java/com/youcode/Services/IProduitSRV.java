package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Produit;

public interface IProduitSRV {
	public void addOrUpdateProduit( Produit produit);
	public Optional<Produit> selectByIdProduit(int id);
	public List<Produit> selectAllProduit();
	public void deleteProduit(int id);
}
