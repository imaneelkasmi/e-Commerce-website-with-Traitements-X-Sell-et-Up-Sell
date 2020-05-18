package com.youcode.Entiter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping")
public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipping_id ;
	private String lable ;
	
	
//constructeur 
	public Shipping(int id, String lable) {
		super();
		this.shipping_id = id;
		this.lable = lable;
	}


	public Shipping() {
		super();
	}
// Getter and Setter


	public int getId() {
		return shipping_id;
	}


	public void setId(int id) {
		this.shipping_id = id;
	}


	public String getLable() {
		return lable;
	}


	public void setLable(String lable) {
		this.lable = lable;
	}


	@Override
	public String toString() {
		return "Shipping [id=" + shipping_id + ", lable=" + lable + "]";
	}
	


	
}
