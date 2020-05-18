package com.youcode.Entiter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id ;
	private String lable ;
//constructeur 
	public Roles() {
		super();
	}
	public Roles(int id, String lable) {
		super();
		this.role_id = id;
		this.lable = lable;
	}
// Getter and Setter
	public int getId() {
		return role_id;
	}
	public void setId(int id) {
		this.role_id = id;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	@Override
	public String toString() {
		return "Roles [id=" + role_id + ", lable=" + lable + "]";
	}

}
