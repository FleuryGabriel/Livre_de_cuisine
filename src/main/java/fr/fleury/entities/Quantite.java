package fr.fleury.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quantites")
public class Quantite implements Serializable{
	
	//Attributs
	@Id
	@GeneratedValue
	@Column(name = "id_q")
	private int id;
	private int no_recette;
	private int no_ingredient;
	private String quantite;
	
	//Lien UML
	@ManyToOne
	@JoinColumn(name = "r_id", referencedColumnName = "id_r")
	private Recette recette;
	
	@ManyToOne
	@JoinColumn(name = "i_id", referencedColumnName = "id_i")
	private Ingredient ingredient;
	
	//Constructeur
	public Quantite() {
		super();
	}
	public Quantite(int no_recette, int no_ingredient, String quantite) {
		super();
		this.no_recette = no_recette;
		this.no_ingredient = no_ingredient;
		this.quantite = quantite;
	}
	public Quantite(int id, int no_recette, int no_ingredient, String quantite) {
		super();
		this.id = id;
		this.no_recette = no_recette;
		this.no_ingredient = no_ingredient;
		this.quantite = quantite;
	}
	
	//Getters et setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo_recette() {
		return no_recette;
	}
	public void setNo_recette(int no_recette) {
		this.no_recette = no_recette;
	}
	public int getNo_ingredient() {
		return no_ingredient;
	}
	public void setNo_ingredient(int no_ingredient) {
		this.no_ingredient = no_ingredient;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public Recette getRecette() {
		return recette;
	}
	public void setRecette(Recette recette) {
		this.recette = recette;
	}
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
	
	

}