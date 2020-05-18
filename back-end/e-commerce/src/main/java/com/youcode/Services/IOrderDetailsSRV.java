package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.OrderDetails;

public interface IOrderDetailsSRV {

	public void addOrUpdateOrderDetails( OrderDetails orderDetails);
	public Optional<OrderDetails> selectByIdOrderDetails(int id);
	public List<OrderDetails> selectAllOrderDetails();
	public void deleteOrderDetails(int id);
}
