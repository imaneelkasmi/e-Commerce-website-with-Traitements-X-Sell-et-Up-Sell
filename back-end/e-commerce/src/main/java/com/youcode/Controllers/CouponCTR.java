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

import com.youcode.Entiter.Coupon;
import com.youcode.Services.ICouponSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class CouponCTR {
	@Autowired ICouponSRV couponSRV;
// Add 
	@PostMapping(value = "/coupon")
	private void addOrUpdateCoupon( @RequestBody Coupon coupon) {
		couponSRV.addOrUpdateCoupon(coupon);
	}
//Update 
	@PutMapping("/coupon")
	public void updateCoupon(@RequestBody Coupon coupon) {
		couponSRV.addOrUpdateCoupon(coupon);
	}
//Select All
	@GetMapping(value = "/coupon")
	public List<Coupon> selectAllCoupon() {
		return couponSRV.selectAllCoupon();
	}
//Select By Id
	@GetMapping(value = "/coupon/{id}")
	public Coupon selectByIdCoupon(@PathVariable("id") int id ) {
		return couponSRV.selectByIdCoupon(id).get();
	}
//Delete 
	@DeleteMapping( value = "/coupon/{id}")
	private void deleteCoupon(@PathVariable("id") int id) {
		couponSRV.deleteCoupon(id);
	}
}
