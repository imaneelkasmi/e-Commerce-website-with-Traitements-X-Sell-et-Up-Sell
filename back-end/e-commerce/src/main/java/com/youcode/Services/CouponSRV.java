package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.ICouponDAO;
import com.youcode.Entiter.Coupon;

@Service
public class CouponSRV implements ICouponSRV {
	@Autowired ICouponDAO couponDAO;

	@Override
	public void addOrUpdateCoupon(Coupon coupon) {
		couponDAO.save(coupon);
	}

	@Override
	public Optional<Coupon> selectByIdCoupon(int id) {
		return couponDAO.findById(id);
	}

	@Override
	public List<Coupon> selectAllCoupon() {
		return couponDAO.findAll();
	}

	@Override
	public void deleteCoupon(int id) {
		couponDAO.deleteById(id);
	}

}
