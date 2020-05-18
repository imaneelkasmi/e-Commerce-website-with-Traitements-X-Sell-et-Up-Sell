package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.OrderStatus;

public interface IOrderStatusSRV {
	public void addOrUpdateOrderStatus( OrderStatus orderStatus);
	public Optional<OrderStatus> selectByIdOrderStatus(int id);
	public List<OrderStatus> selectAllOrderStatus();
	public void deleteOrderStatus(int id);

}
