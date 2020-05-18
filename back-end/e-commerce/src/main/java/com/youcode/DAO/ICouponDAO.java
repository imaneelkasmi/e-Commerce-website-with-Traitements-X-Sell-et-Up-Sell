package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Coupon;

public interface ICouponDAO extends JpaRepository<Coupon, Integer>{

}
