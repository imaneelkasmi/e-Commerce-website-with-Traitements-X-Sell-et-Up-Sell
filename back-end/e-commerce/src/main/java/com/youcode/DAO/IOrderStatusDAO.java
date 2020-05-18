package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.OrderStatus;

public interface IOrderStatusDAO extends JpaRepository<OrderStatus, Integer>{

}
