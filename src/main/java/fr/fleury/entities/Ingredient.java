package fr.fleury.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ingredients")
public class Ingredient implements Serializable{
	
	//Attributs
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_i")
	private int id;
	private String nom;
	private String typeIngr; //Le but est de pouvoir regrouper pour les courses. 
	
	//Lien UML
	
	@OneToMany(mappedBy = "ingredient")
	@JsonIgnore
	private List<Quantite> quantites;
	
	//Constructeurs
	public Ingredient() {
		super();
	}
	public Ingredient(String nom, String typeIngr) {
		super();
		this.nom = nom;
		this.typeIngr = typeIngr;
	}
	public Ingredient(int id, String nom, String typeIngr) {
		super();
		this.id = id;
		this.nom = nom;
		this.typeIngr = typeIngr;
	}
	
	//Getters et setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTypeIngr() {
		return typeIngr;
	}
	public void setTypeIngr(String typeIngr) {
		this.typeIngr = typeIngr;
	}
	public List<Quantite> getQuantites() {
		return quantites;
	}
	public void setQuantites(List<Quantite> quantites) {
		this.quantites = quantites;
	}

	
	
	

}
