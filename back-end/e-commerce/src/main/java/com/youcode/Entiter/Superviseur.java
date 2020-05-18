package com.youcode.Entiter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "superviseur")
@EntityListeners(AuditingEntityListener.class)
public class Superviseur extends User {

	
	private String name;
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updated_at;

//constructeur 
	public Superviseur() {
		super();
	}

	public Superviseur(String name, String email, Date created_at, Date updated_at) {
		super();
		this.name = name;
		this.email = email;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
// Getter and Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "Superviseur [name=" + name + ", email=" + email + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
    
}
