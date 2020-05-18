package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.Shipping;

public interface IShippingSRV {
	
	public void addOrUpdateShipping( Shipping shipping);
	public Optional<Shipping> selectByIdShipping(int id);
	public List<Shipping> selectAllShipping();
	public void deleteShipping(int id);
}
