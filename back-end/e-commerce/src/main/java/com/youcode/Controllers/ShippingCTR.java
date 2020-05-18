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

import com.youcode.Entiter.Shipping;
import com.youcode.Services.IShippingSRV;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
@RestController
public class ShippingCTR {
	@Autowired IShippingSRV shippingSRV;
// Add 
	@PostMapping(value = "/shipping")
	private void addOrUpdateShipping( @RequestBody Shipping shipping) {
		shippingSRV.addOrUpdateShipping(shipping);
	}
//Update 
	@PutMapping("/shipping")
	public void updateShipping(@RequestBody Shipping shipping) {
		shippingSRV.addOrUpdateShipping(shipping);
	}
//Select All
	@GetMapping(value = "/shipping")
	public List<Shipping> selectAllShipping() {
		return shippingSRV.selectAllShipping();
	}
//Select By Id
	@GetMapping(value = "/shipping/{id}")
	public Shipping selectByIdShipping(@PathVariable("id") int id ) {
		return shippingSRV.selectByIdShipping(id).get();
	}
//Delete 
	@DeleteMapping( value = "/shipping/{id}")
	private void deleteShipping(@PathVariable("id") int id) {
		shippingSRV.deleteShipping(id);
	}
}
