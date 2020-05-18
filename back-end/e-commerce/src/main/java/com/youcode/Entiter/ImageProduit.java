package com.youcode.Entiter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "image_produit")
public class ImageProduit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int image_id ;
	private String lable ;
	private String alt ;
// relationship with prouduit
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="pruduit_id", nullable = false)
	private Produit pruduit;
	
	
	
	public ImageProduit() {
		super();
	}
	public ImageProduit(int id, String lable, String alt, Produit pruduit) {
		super();
		this.image_id = id;
		this.lable = lable;
		this.alt = alt;
		this.pruduit = pruduit;
	}
	public int getId() {
		return image_id;
	}
	public void setId(int id) {
		this.image_id = id;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public Produit getPruduit() {
		return pruduit;
	}
	public void setPruduit(Produit pruduit) {
		this.pruduit = pruduit;
	}
	@Override
	public String toString() {
		return "ImageProduit [id=" + image_id + ", lable=" + lable + ", alt=" + alt + ", pruduit=" + pruduit + "]";
	}
	
	
}
