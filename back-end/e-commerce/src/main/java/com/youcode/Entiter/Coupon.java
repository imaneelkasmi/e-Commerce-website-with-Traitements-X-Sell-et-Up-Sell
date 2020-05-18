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
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "coupon")
@EntityListeners(AuditingEntityListener.class)
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coupon_id ;
	private String  code;
	private int status;
	private int discount;
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date dateExpiration;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updated_at;
// relationship with Client
    @ManyToOne
    @JsonIgnore
	@JoinColumn(name="client_id", nullable = false)
    private Client client;
//constructeur
	public Coupon() {
		super();
	}
	public Coupon(int id, String code, int status, int discount, Date dateExpiration, Date created_at, Date updated_at,
			Client client) {
		super();
		this.coupon_id = id;
		this.code = code;
		this.status = status;
		this.discount = discount;
		this.dateExpiration = dateExpiration;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.client = client;
	}
// Getter and Setter
	public int getId() {
		return coupon_id;
	}
	public void setId(int id) {
		this.coupon_id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + coupon_id + ", code=" + code + ", status=" + status + ", discount=" + discount
				+ ", dateExpiration=" + dateExpiration + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", client=" + client + "]";
	}
	
    

}
