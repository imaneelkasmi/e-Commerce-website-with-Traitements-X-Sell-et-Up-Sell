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

import com.youcode.Entiter.OrderDetails;
import com.youcode.Services.IOrderDetailsSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class OrderDetailsCTR {
	@Autowired IOrderDetailsSRV orderDetailsSRV;
	// Add 
		@PostMapping(value = "/order-details")
		private void addOrUpdateOrderDetails( @RequestBody OrderDetails orderDetails) {
			orderDetailsSRV.addOrUpdateOrderDetails(orderDetails);
		}
	//Update 
		@PutMapping("/order-details")
		public void updateOrderDetails(@RequestBody OrderDetails orderDetails) {
			orderDetailsSRV.addOrUpdateOrderDetails(orderDetails);
		}
	//Select All
		@GetMapping(value = "/order-details")
		public List<OrderDetails> selectAllOrderDetails() {
			return orderDetailsSRV.selectAllOrderDetails();
		}
	//Select By Id
		@GetMapping(value = "/order-details/{id}")
		public OrderDetails selectByIdOrderDetails(@PathVariable("id") int id ) {
			return orderDetailsSRV.selectByIdOrderDetails(id).get();
		}
	//Delete 
		@DeleteMapping( value = "/order-details/{id}")
		private void deleteOrderDetails(@PathVariable("id") int id) {
			orderDetailsSRV.deleteOrderDetails(id);
		}
}
