package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Review;

public interface IReviewSRV {
	public void addOrUpdateReview( Review review);
	public Optional<Review> selectByIdReview(int id);
	public List<Review> selectAllReview();
	public void deleteReview(int id);

}
