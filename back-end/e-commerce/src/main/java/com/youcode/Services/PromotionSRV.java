package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IPromotionDAO;
import com.youcode.Entiter.Promotion;

@Service
public class PromotionSRV implements IPromotionSRV {
	@Autowired IPromotionDAO promotionDAO;

	@Override
	public void addOrUpdatePromotion(Promotion promotion) {
		promotionDAO.save(promotion);
	}

	@Override
	public Optional<Promotion> selectByIdPromotion(int id) {
		
		return promotionDAO.findById(id);
	}

	@Override
	public List<Promotion> selectAllPromotion() {
		
		return promotionDAO.findAll();
	}

	@Override
	public void deletePromotion(int id) {
		promotionDAO.deleteById(id);
		
	}
	
}
