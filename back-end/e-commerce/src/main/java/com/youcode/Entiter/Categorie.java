package com.youcode.Entiter;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "categories")
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categorie_id ;
	private String lable ;
// relationship with Produit
	@OneToMany(mappedBy ="category")
	private List<Produit> listProduit ;
	
//Recursive relationship with Categorie
	
	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
	
    private List<Categorie> Child;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "categorie_id")
    @JsonIgnore
    private Categorie parent;
    
    

	public Categorie() {
		super();
	}

	public Categorie(int id, String label, List<Produit> listProduit, List<Categorie> child, Categorie parent) {
		super();
		this.categorie_id = id;
		this.lable = label;
		this.listProduit = listProduit;
		Child = child;
		this.parent = parent;
	}

	public int getId() {
		return categorie_id;
	}

	public void setId(int id) {
		this.categorie_id = id;
	}

	public String getLabel() {
		return lable;
	}

	public void setLabel(String label) {
		this.lable = label;
	}

	public List<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}

	public List<Categorie> getChild() {
		return Child;
	}

	public void setChild(List<Categorie> child) {
		Child = child;
	}

	public Categorie getParent() {
		return parent;
	}

	public void setParent(Categorie parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + categorie_id + ", label=" + lable + ", listProduit=" + listProduit + ", Child=" + Child
				+ ", parent=" + parent + "]";
	}
    

}
