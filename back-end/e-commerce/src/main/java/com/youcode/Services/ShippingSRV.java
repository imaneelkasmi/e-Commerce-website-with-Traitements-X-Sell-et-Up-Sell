package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IShippingDAO;
import com.youcode.Entiter.Shipping;

@Service
public class ShippingSRV implements IShippingSRV {
	@Autowired IShippingDAO shippingDAO;

	@Override
	public void addOrUpdateShipping(Shipping shipping) {
		shippingDAO.save(shipping);
		
	}

	@Override
	public Optional<Shipping> selectByIdShipping(int id) {
		return shippingDAO.findById(id);
	}

	@Override
	public List<Shipping> selectAllShipping() {
		return shippingDAO.findAll();
	}

	@Override
	public void deleteShipping(int id) {
		shippingDAO.deleteById(id);
	}

}
