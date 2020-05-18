package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IOrderDAO;
import com.youcode.Entiter.Order;

@Service
public class OrderSRV implements IOrderSRV {
	@Autowired IOrderDAO orderDAO;

	@Override
	public void addOrUpdateOrder(Order order) {
		orderDAO.save(order);
	}

	@Override
	public Optional<Order> selectByIdOrder(int id) {
		return orderDAO.findById(id);
	}

	@Override
	public List<Order> selectAllOrder() {
		return orderDAO.findAll();
	}

	@Override
	public void deleteOrder(int id) {
		orderDAO.deleteById(id);
	}
}
