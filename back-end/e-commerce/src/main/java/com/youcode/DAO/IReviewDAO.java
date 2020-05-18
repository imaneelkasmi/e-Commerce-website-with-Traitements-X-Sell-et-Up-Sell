package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Review;

public interface IReviewDAO extends JpaRepository<Review, Integer> {

}
