package com.youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.Entiter.Categorie;
import com.youcode.Services.ICategorieSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class CategorieCTR {
	@Autowired ICategorieSRV categorieSRV;
	
// Add 
	@PostMapping(value = "/categorie")
	private void addOrUpdateCategorie( @RequestBody Categorie category) {
		System.out.println(category);
		categorieSRV.addOrUpdateCategorie(category);
	}
//Update 
	@PutMapping("/categorie")
	public void updateCategorie(@RequestBody Categorie category) {
		categorieSRV.addOrUpdateCategorie(category);
	}
//Select All
	@GetMapping(value = "/public/categorie")
	public ResponseEntity<List<Categorie>> selectAllCategorie() {
		return ResponseEntity.ok(categorieSRV.selectAllCategorie());
	}
//Select By Id
	@GetMapping(value = "/public/categorie/{id}")
	public Categorie selectByIdCategorie(@PathVariable("id") int id ) {
		return categorieSRV.selectByIdCategorie(id).get();
	}
//Delete 
	@DeleteMapping( value = "/categorie/{id}")
	private void deleteCategorie(@PathVariable("id") int id) {
		categorieSRV.deleteCategorie(id);
	}
	@GetMapping("/parentcategorie")
	public ResponseEntity<List<Categorie>> getAll(){
		return ResponseEntity.ok(categorieSRV.getAllParents());
	}


}
