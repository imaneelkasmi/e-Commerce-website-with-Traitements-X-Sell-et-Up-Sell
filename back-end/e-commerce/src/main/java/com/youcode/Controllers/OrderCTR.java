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

import com.youcode.Entiter.Order;
import com.youcode.Services.IOrderSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class OrderCTR {
	@Autowired IOrderSRV OrderSRV;
	
	// Add 
		@PostMapping(value = "/order")
		private void addOrUpdateOrder( @RequestBody Order order) {
			OrderSRV.addOrUpdateOrder(order);
		}
	//Update 
		@PutMapping("/order")
		public void updateOrder(@RequestBody Order order) {
			OrderSRV.addOrUpdateOrder(order);
		}
	//Select All
		@GetMapping(value = "/order")
		public List<Order> selectAllOrder() {
			return OrderSRV.selectAllOrder();
		}
	//Select By Id
		@GetMapping(value = "/order/{id}")
		public Order selectByIdOrder(@PathVariable("id") int id ) {
			return OrderSRV.selectByIdOrder(id).get();
		}
	//Delete 
		@DeleteMapping( value = "/order/{id}")
		private void deleteOrder(@PathVariable("id") int id) {
			OrderSRV.deleteOrder(id);
		}
	
}
