package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IOrderDetailsDAO;
import com.youcode.Entiter.OrderDetails;

@Service
public class OrderDetailsSRV implements IOrderDetailsSRV {
	@Autowired IOrderDetailsDAO orderDetailsDAO;

	@Override
	public void addOrUpdateOrderDetails(OrderDetails orderDetails) {
		orderDetailsDAO.save(orderDetails);
	}

	@Override
	public Optional<OrderDetails> selectByIdOrderDetails(int id) {
		return orderDetailsDAO.findById(id);
	}

	@Override
	public List<OrderDetails> selectAllOrderDetails() {
		return orderDetailsDAO.findAll();
	}

	@Override
	public void deleteOrderDetails(int id) {
		orderDetailsDAO.deleteById(id);
	}
}
