package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IReviewDAO;
import com.youcode.Entiter.Review;

@Service
public class ReviewSRV implements IReviewSRV {
	@Autowired IReviewDAO reviewDAO;

	@Override
	public void addOrUpdateReview(Review review) {
		reviewDAO.save(review);
		
	}

	@Override
	public Optional<Review> selectByIdReview(int id) {
		
		return reviewDAO.findById(id);
	}

	@Override
	public List<Review> selectAllReview() {
		return reviewDAO.findAll();
	}

	@Override
	public void deleteReview(int id) {
		reviewDAO.deleteById(id);
	}
}
