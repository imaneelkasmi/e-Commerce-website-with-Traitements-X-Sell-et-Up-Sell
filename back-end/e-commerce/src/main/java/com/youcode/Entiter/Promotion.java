package com.youcode.Entiter;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "promotion")

public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int promotion_id ;
	
	private String status;
	private int percent;
	
// relationship with produit
	@OneToMany(mappedBy ="promotion")
	@JsonIgnore
	private List<Produit> listProduit;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date beginDate;
	
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date endDate;
	
	
	

	public Promotion() {
		super();
	}

	public Promotion(int id, String status, int percent, List<Produit> listProduit, Date beginDate, Date endDate) {
		super();
		this.promotion_id = id;
		this.status = status;
		this.percent = percent;
		this.listProduit = listProduit;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	public int getId() {
		return promotion_id;
	}

	public void setId(int id) {
		this.promotion_id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + promotion_id + ", status=" + status + ", percent=" + percent + ", listProduit=" + listProduit
				+ ", beginDate=" + beginDate + ", endDate=" + endDate + "]";
	}
	
	
	
}
