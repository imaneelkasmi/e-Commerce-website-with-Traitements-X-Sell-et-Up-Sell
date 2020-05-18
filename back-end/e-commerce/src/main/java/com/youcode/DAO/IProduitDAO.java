package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Produit;

public interface IProduitDAO extends JpaRepository<Produit, Integer>{

}
