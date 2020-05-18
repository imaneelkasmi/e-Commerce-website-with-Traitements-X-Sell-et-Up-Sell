package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Categorie;

public interface ICategorieSRV {
	public void addOrUpdateCategorie( Categorie Category);
	public Optional<Categorie> selectByIdCategorie(int id);
	public List<Categorie> selectAllCategorie();
	public void deleteCategorie(int id);

}
