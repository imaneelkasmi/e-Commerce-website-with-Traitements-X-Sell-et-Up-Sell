package com.youcode.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Categorie;

public interface ICategorieDAO extends JpaRepository<Categorie, Integer>{
	public List<Categorie> findByParentIsNull();

}	
