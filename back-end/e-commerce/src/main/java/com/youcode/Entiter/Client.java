package com.youcode.Entiter;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "client")
@EntityListeners(AuditingEntityListener.class)
public class Client extends User {

	
	private String lastName;
	private	String firstName;
	private String email;
	private String adresse;
	private String infoPaiement;
	private String phone;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updated_at;
    
// relationship with Coupon
    @OneToMany(mappedBy ="client")
    private List<Coupon> listCoupon;
// relationship with Order Details
    @OneToMany(mappedBy ="client")
    @JsonIgnore
    private List<OrderDetails> listOrderDetails;
// relationship with Review
    @JsonIgnore
    @OneToMany(mappedBy ="client")
    private List<Review> listReview;
//constructeur 
public Client() {
	super();
}
public Client(String lastName, String firstName, String email, String adresse, String infoPaiement, String phone,
		Date created_at, Date updated_at, List<Coupon> listCoupon, List<OrderDetails> listOrderDetails,
		List<Review> listReview) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.email = email;
	this.adresse = adresse;
	this.infoPaiement = infoPaiement;
	this.phone = phone;
	this.created_at = created_at;
	this.updated_at = updated_at;
	this.listCoupon = listCoupon;
	this.listOrderDetails = listOrderDetails;
	this.listReview = listReview;
}
//Getter and Setter
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getInfoPaiement() {
		return infoPaiement;
	}
	public void setInfoPaiement(String infoPaiement) {
		this.infoPaiement = infoPaiement;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public List<Coupon> getListCoupon() {
		return listCoupon;
	}
	public void setListCoupon(List<Coupon> listCoupon) {
		this.listCoupon = listCoupon;
	}
	public List<OrderDetails> getListOrderDetails() {
		return listOrderDetails;
	}
	public void setListOrderDetails(List<OrderDetails> listOrderDetails) {
		this.listOrderDetails = listOrderDetails;
	}
	public List<Review> getListReview() {
		return listReview;
	}
	public void setListReview(List<Review> listReview) {
		this.listReview = listReview;
	}
	@Override
	public String toString() {
		return "Client [lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + ", adresse=" + adresse
				+ ", infoPaiement=" + infoPaiement + ", phone=" + phone + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", listCoupon=" + listCoupon + ", listOrderDetails=" + listOrderDetails + ", listReview="
				+ listReview + "]";
	}


}
