package com.youcode.Entiter;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "review")
@EntityListeners(AuditingEntityListener.class)
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int review_id ;
	private String comment ;
	private int rate ;
	
// relationship with Produit
	@ManyToOne
	@JoinColumn(name="produit_id", nullable = false)
	@JsonIgnore
	private Produit produit;
// relationship with client
	@ManyToOne
	@JoinColumn(name="client_id", nullable = false)
	private Client client;
	
// time updated at and created at
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updated_at;
	
//constructeur
	public Review() {
		super();
	}
	public Review(int id, String comment, int rate, Produit produit, Client client) {
		super();
		this.review_id = id;
		this.comment = comment;
		this.rate = rate;
		this.produit = produit;
		this.client = client;
	}
// Getter and Setter
	public int getId() {
		return review_id;
	}
	public void setId(int id) {
		this.review_id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Review [id=" + review_id + ", comment=" + comment + ", rate=" + rate + ", produit=" + produit + ", client="
				+ client + "]";
	}
	

}
