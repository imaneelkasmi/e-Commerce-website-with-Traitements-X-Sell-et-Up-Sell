package com.youcode.Entiter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;






@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id ;
	@Column(unique = true)
	private String username ;
	private String password ;
	
// relationship with Promotion
	@ManyToOne
	@JoinColumn(name="roles_id")
	private Roles roles;

//constructeur 
	public User() {
		super();
	}


	public User(int id, String username, String password, Roles roles) {
		super();
		this.user_id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
}
// Getter and Setter


	public int getId() {
		return user_id;
	}


	public void setId(int id) {
		this.user_id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String user_name) {
		this.username = user_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "User [id=" + user_id + ", user_name=" + username + ", password=" + password + ", roles=" + roles + "]";
	}
	
	
}
