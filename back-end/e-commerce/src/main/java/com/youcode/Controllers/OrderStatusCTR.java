package com.youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.Entiter.OrderStatus;
import com.youcode.Services.IOrderStatusSRV;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class OrderStatusCTR {
	@Autowired IOrderStatusSRV orderStatusSRV ;
// Add 
	@PostMapping(value = "/order-status")
	private void addOrUpdateOrderStatus( @RequestBody OrderStatus orderStatus) {
		orderStatusSRV.addOrUpdateOrderStatus(orderStatus);
	}
//Update 
	@PutMapping("/order-status")
	public void updateOrderStatus(@RequestBody OrderStatus orderStatus) {
		orderStatusSRV.addOrUpdateOrderStatus(orderStatus);
	}
//Select All
	@GetMapping(value = "/order-status")
	public List<OrderStatus> selectAllOrderStatus() {
		return orderStatusSRV.selectAllOrderStatus();
	}
//Select By Id
	@GetMapping(value = "/order-status/{id}")
	public OrderStatus selectByIdOrderStatus(@PathVariable("id") int id ) {
		return orderStatusSRV.selectByIdOrderStatus(id).get();
	}
//Delete 
	@DeleteMapping( value = "/order-status/{id}")
	private void deleteOrderStatus(@PathVariable("id") int id) {
		orderStatusSRV.deleteOrderStatus(id);
	}
}
