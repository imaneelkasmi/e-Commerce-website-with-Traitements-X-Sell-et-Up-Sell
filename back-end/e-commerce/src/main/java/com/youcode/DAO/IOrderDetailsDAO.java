package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.OrderDetails;

public interface IOrderDetailsDAO extends JpaRepository<OrderDetails, Integer> {

}
