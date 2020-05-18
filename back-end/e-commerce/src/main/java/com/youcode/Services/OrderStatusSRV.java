package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IOrderStatusDAO;
import com.youcode.Entiter.OrderStatus;

@Service
public class OrderStatusSRV implements IOrderStatusSRV {
	@Autowired IOrderStatusDAO orderStatusDAO;

	@Override
	public void addOrUpdateOrderStatus(OrderStatus orderStatus) {
		orderStatusDAO.save(orderStatus);
	}

	@Override
	public Optional<OrderStatus> selectByIdOrderStatus(int id) {
		return orderStatusDAO.findById(id);
	}

	@Override
	public List<OrderStatus> selectAllOrderStatus() {
		return orderStatusDAO.findAll();
	}

	@Override
	public void deleteOrderStatus(int id) {
		orderStatusDAO.deleteById(id);
	}

}
