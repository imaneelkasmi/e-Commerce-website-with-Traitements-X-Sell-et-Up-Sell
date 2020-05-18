package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.ICategorieDAO;
import com.youcode.Entiter.Categorie;

@Service
public class CategorieSRV implements ICategorieSRV{
	@Autowired 
	ICategorieDAO categorieDAO;
	
	public void addOrUpdateCategorie( Categorie Category) {
		categorieDAO.save(Category);
	}
	public Optional<Categorie> selectByIdCategorie(int id) {
		
		return categorieDAO.findById(id);
	}
	public List<Categorie> selectAllCategorie() {
		return categorieDAO.findAll();		
	}
	public void deleteCategorie(int id) {
		categorieDAO.deleteById(id);
	}

}
