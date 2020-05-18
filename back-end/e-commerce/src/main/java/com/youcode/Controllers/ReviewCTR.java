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

import com.youcode.Entiter.Review;
import com.youcode.Services.IReviewSRV;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class ReviewCTR {

	@Autowired IReviewSRV reviewSRV;
// Add 
	@PostMapping(value = "/review")
	private void addOrUpdateReview( @RequestBody Review review) {
		reviewSRV.addOrUpdateReview(review);
		
	}
//Update 
	@PutMapping("/review")
	public void updateReview(@RequestBody Review review) {
		reviewSRV.addOrUpdateReview(review);
	}
//Select All
	@GetMapping(value = "/review")
	public List<Review> selectAllReview() {
		return reviewSRV.selectAllReview();
	}
//Select By Id
	@GetMapping(value = "/review/{id}")
	public Review selectByIdReview(@PathVariable("id") int id ) {
		return reviewSRV.selectByIdReview(id).get();
	}
//Delete 
	@DeleteMapping( value = "/review/{id}")
	private void deleteReview(@PathVariable("id") int id) {
		reviewSRV.deleteReview(id);
		
	}
	
}
