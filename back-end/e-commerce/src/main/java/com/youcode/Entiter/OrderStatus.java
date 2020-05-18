package com.youcode.Entiter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "order_status")
public class OrderStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_status_id ;
	private String lable ;
	
//constructeur 
	
	public OrderStatus(int id, String lable) {
		super();
		this.order_status_id = id;
		this.lable = lable;
	}

	public OrderStatus() {
		super();
	}

	
// Getter and Setter
	public int getId() {
		return order_status_id;
	}
	
	public void setId(int id) {
		this.order_status_id = id;
	}
	
	public String getLable() {
		return lable;
	}
	
	public void setLable(String lable) {
		this.lable = lable;
	}

	@Override
	public String toString() {
		return "OrderStatus [id=" + order_status_id + ", lable=" + lable + "]";
	}
	
	
	
}
