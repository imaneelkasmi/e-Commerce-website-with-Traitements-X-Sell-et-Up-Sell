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

import com.youcode.Entiter.Promotion;
import com.youcode.Services.IPromotionSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class PromotionCTR {
	@Autowired IPromotionSRV promotionSRV;
	
	// Add 
		@PostMapping(value = "/promotion")
		private void addOrUpdatePromotion( @RequestBody Promotion promotion) {
			promotionSRV.addOrUpdatePromotion(promotion);
		}
	//Update 
		@PutMapping("/promotion")
		public void updatePromotion(@RequestBody Promotion promotion) {
			promotionSRV.addOrUpdatePromotion(promotion);
		}
	//Select All
		@GetMapping(value = "/promotion")
		public List<Promotion> selectAllPromotion() {
			return promotionSRV.selectAllPromotion();
		}
	//Select By Id
		@GetMapping(value = "/promotion/{id}")
		public Promotion selectByIdPromotion(@PathVariable("id") int id ) {
			return promotionSRV.selectByIdPromotion(id).get();
		}
	//Delete 
		@DeleteMapping( value = "/promotion/{id}")
		private void deletePromotion(@PathVariable("id") int id) {
			promotionSRV.deletePromotion(id);
			
		}
	
}
