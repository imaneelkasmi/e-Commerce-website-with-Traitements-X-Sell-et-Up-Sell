package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Promotion;

public interface IPromotionSRV {
	public void addOrUpdatePromotion( Promotion promotion);
	public Optional<Promotion> selectByIdPromotion(int id);
	public List<Promotion> selectAllPromotion();
	public void deletePromotion(int id);
}
