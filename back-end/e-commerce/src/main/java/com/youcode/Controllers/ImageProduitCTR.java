package com.youcode.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.Entiter.ImageProduit;
import com.youcode.Services.IimageProduitSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class ImageProduitCTR {
	@Autowired IimageProduitSRV imageProduitSRV;
// Add 
	@PostMapping(value = "/image")
	private void addOrUpdateImageProduit( @RequestBody ImageProduit imageProduit) {
		imageProduitSRV.addOrUpdateImageProduit(imageProduit);
	}
//Update 
	@PutMapping("/image")
	public void updateImageProduit(@RequestBody ImageProduit imageProduit) {
		imageProduitSRV.addOrUpdateImageProduit(imageProduit);
	}
//Select All
	@GetMapping(value = "/image")
	public List<ImageProduit> selectAllImageProduit() {
		return imageProduitSRV.selectAllImageProduit();
	}
//Select By Id
	@GetMapping(value = "/image/{id}")
	public ImageProduit selectByIdImageProduit(@PathVariable("id") int id ) {
		return imageProduitSRV.selectByIdImageProduit(id).get();
	}
//Delete 
	@DeleteMapping( value = "/image/{id}")
	private void deleteImageProduit(@PathVariable("id") int id) {
		imageProduitSRV.deleteImageProduit(id);
	}
}
