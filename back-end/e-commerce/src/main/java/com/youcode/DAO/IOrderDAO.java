package com.youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.Entiter.Order;

public interface IOrderDAO extends JpaRepository<Order, Integer>{

}
