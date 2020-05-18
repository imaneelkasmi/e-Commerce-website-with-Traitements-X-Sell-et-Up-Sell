package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Order;

public interface IOrderSRV {
	public void addOrUpdateOrder( Order order);
	public Optional<Order> selectByIdOrder(int id);
	public List<Order> selectAllOrder();
	public void deleteOrder(int id);
}
