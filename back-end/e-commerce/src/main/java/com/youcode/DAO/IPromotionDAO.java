package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Promotion;

public interface IPromotionDAO extends JpaRepository<Promotion, Integer> {

}
