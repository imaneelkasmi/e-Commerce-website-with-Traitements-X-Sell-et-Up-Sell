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

import com.youcode.Entiter.Superviseur;
import com.youcode.Services.ISuperviseurSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class SuperviseurCTR {
	@Autowired ISuperviseurSRV superviseurSRV;
	// Add 
		@PostMapping(value = "/superviseur")
		private void addOrUpdateSuperviseur( @RequestBody Superviseur superviseur) {
			superviseurSRV.addOrUpdateSuperviseur(superviseur);
		}
	//Update 
		@PutMapping("/superviseur")
		public void updateSuperviseur(@RequestBody Superviseur superviseur) {
			superviseurSRV.addOrUpdateSuperviseur(superviseur);
		}
	//Select All
		@GetMapping(value = "/superviseur")
		public List<Superviseur> selectAllSuperviseur() {
			return superviseurSRV.selectAllSuperviseur();
		}
	//Select By Id
		@GetMapping(value = "/superviseur/{id}")
		public Superviseur selectByIdSuperviseur(@PathVariable("id") int id ) {
			return superviseurSRV.selectByIdSuperviseur(id).get();
		}
	//Delete 
		@DeleteMapping( value = "/superviseur/{id}")
		private void deleteSuperviseur(@PathVariable("id") int id) {
			superviseurSRV.deleteSuperviseur(id);
		}
}
