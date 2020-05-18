package com.youcode.Entiter;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name = "orders")
@EntityListeners(AuditingEntityListener.class)
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id ;
	private int prixTotal ;
	
// relationship with Order Status
	@ManyToOne
	@JoinColumn(name="status_id", nullable = false)
	private OrderStatus orderStatus;
// relationship with shipping
	@ManyToOne
	@JoinColumn(name="shipping_id", nullable = false)
	private Shipping shipping;
// relationship with Order Details
	@OneToMany(mappedBy ="order")
	private List<OrderDetails> orderDetails;	
// time updated at and created at
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updated_at;
    
// constructeur 
	public Order(int id, int prixTotal, OrderStatus orderStatus, Shipping shipping, List<OrderDetails> orderDetails) {
		super();
		this.order_id = id;
		this.prixTotal = prixTotal;
		this.orderStatus = orderStatus;
		this.shipping = shipping;
		this.orderDetails = orderDetails;
	}
	public Order() {
		super();
	}
// Getter and Setter
	public int getId() {
		return order_id;
	}
	public void setId(int id) {
		this.order_id = id;
	}
	public int getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Order [id=" + order_id + ", prixTotal=" + prixTotal + ", orderStatus=" + orderStatus + ", shipping="
				+ shipping + ", orderDetails=" + orderDetails + "]";
	}
	

	
}
