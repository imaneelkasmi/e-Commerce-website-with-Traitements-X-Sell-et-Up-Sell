package com.youcode.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.Entiter.Produit;
import com.youcode.Services.IProduitSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class ProduitCTR {
	@Autowired  IProduitSRV ProduitSRV;
	
// Add 
	@Secured("")
	@RequestMapping(method = RequestMethod.POST,value = "/produit")
	private int addOrUpdateProduit( @RequestBody Produit produit) {
		ProduitSRV.addOrUpdateProduit(produit);
		return produit.getId();
	}
//Update 
	@PutMapping("/produit")
	public void updateProduit(@RequestBody Produit produit) {
		ProduitSRV.addOrUpdateProduit(produit);
	}
//Select All
	@GetMapping(value = "/public/produit")
	public List<Produit> selectAllProduit() {
		return ProduitSRV.selectAllProduit();
	}
//Select By Id
	@GetMapping(value = "/public/produit/{id}")
	public Produit selectByIdProduit(@PathVariable("id") int id ) {
		return ProduitSRV.selectByIdProduit(id).get();
	}
//Delete 
	@DeleteMapping( value = "/produit/{id}")
	private void deleteProduit(@PathVariable("id") int id) {
		ProduitSRV.deleteProduit(id);
		
	}
	
}
