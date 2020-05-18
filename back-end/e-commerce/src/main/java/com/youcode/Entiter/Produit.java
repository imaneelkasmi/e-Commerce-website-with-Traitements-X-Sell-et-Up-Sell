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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "produit")
@EntityListeners(AuditingEntityListener.class)
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int produit_id ;
	
	private String name;
	private Integer price;
	private String marque;
	private String keyword;
	private Integer stock;
	private Integer sellCount;
// relationship with Order details

	@JsonIgnore
	@OneToMany(mappedBy ="produit")
	private List<OrderDetails> listeOrderDetails;

// relationship with reviews
	@OneToMany(mappedBy ="produit")
	private List<Review> listReviews;
	
// relationship with categorie
	@ManyToOne
	@JoinColumn(name="categorie_id", nullable = false)
	@JsonBackReference
	private Categorie category;
// relationship with ImageProduit
	@OneToMany(mappedBy ="pruduit")
	@JsonManagedReference
	private List<ImageProduit> listeImage;

// relationship with Promotion
	@ManyToOne
	@JoinColumn(name="promotion_id", nullable = false)
	private Promotion promotion;
	
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
    public Produit() {
		super();
	}
	public Produit(int id, String name, Integer price, String marque, String keyword, Integer stock, Integer sellCount,
			List<OrderDetails> listeOrderDetails, List<Review> listReviews, Categorie category,
			List<ImageProduit> listeImage, Promotion promotion, Date created_at, Date updated_at) {
		super();
		this.produit_id = id;
		this.name = name;
		this.price = price;
		this.marque = marque;
		this.keyword = keyword;
		this.stock = stock;
		this.sellCount = sellCount;
		this.listeOrderDetails = listeOrderDetails;
		this.listReviews = listReviews;
		this.category = category;
		this.listeImage = listeImage;
		this.promotion = promotion;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
// Getter and Setter
	public int getId() {
		return produit_id;
	}
	public void setId(int id) {
		this.produit_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getSellCount() {
		return sellCount;
	}
	public void setSellCount(Integer sellCount) {
		this.sellCount = sellCount;
	}
	public List<OrderDetails> getListeOrderDetails() {
		return listeOrderDetails;
	}
	public void setListeOrderDetails(List<OrderDetails> listeOrderDetails) {
		this.listeOrderDetails = listeOrderDetails;
	}
	public List<Review> getListReviews() {
		return listReviews;
	}
	public void setListReviews(List<Review> listReviews) {
		this.listReviews = listReviews;
	}
	public Categorie getCategory() {
		return category;
	}
	public void setCategory(Categorie category) {
		this.category = category;
	}
	public List<ImageProduit> getListeImage() {
		return listeImage;
	}
	public void setListeImage(List<ImageProduit> listeImage) {
		this.listeImage = listeImage;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
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
		return "Produit [id=" + produit_id + ", name=" + name + ", price=" + price + ", marque=" + marque + ", keyword="
				+ keyword + ", stock=" + stock + ", sellCount=" + sellCount + ", listeOrderDetails=" + listeOrderDetails
				+ ", listReviews=" + listReviews + ", category=" + category + ", listeImage=" + listeImage
				+ ", promotion=" + promotion + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}


}
