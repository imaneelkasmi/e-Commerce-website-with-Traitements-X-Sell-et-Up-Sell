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
@Table(name = "order_details")
@EntityListeners(AuditingEntityListener.class)
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_details_id;
	private int nbPiece;
	
// relationship with Produit
	@ManyToOne
	@JoinColumn(name="produit_id", nullable = false)
	private Produit produit;
// relationship with Order
	@ManyToOne
	@JoinColumn(name="order_id", nullable = false)
	@JsonIgnore
	private Order order;
// relationship with Client
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
	public OrderDetails() {
		super();
	}

	public OrderDetails(int id, int nbPiece, Produit produit, Order order, Client client) {
		super();
		this.order_details_id = id;
		this.nbPiece = nbPiece;
		this.produit = produit;
		this.order = order;
		this.client = client;
	}
// Getter and Setter
	public int getId() {
		return order_details_id;
	}

	public void setId(int id) {
		this.order_details_id = id;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + order_details_id + ", nbPiece=" + nbPiece + ", produit=" + produit + ", order=" + order
				+ ", client=" + client + "]";
	}
	
	
}
