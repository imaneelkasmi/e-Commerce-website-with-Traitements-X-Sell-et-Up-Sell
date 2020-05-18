package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Coupon;

public interface ICouponSRV {
	public void addOrUpdateCoupon( Coupon coupon);
	public Optional<Coupon> selectByIdCoupon(int id);
	public List<Coupon> selectAllCoupon();
	public void deleteCoupon(int id);
}
