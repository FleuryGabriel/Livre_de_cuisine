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
	private String no_recette;
	private String no_ingredient;
	private int quantite;
	private String unite;
	
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
	public Quantite(String no_recette, String no_ingredient, int quantite, String unite) {
		super();
		this.no_recette = no_recette;
		this.no_ingredient = no_ingredient;
		this.quantite = quantite;
		this.unite = unite;
	}
	public Quantite(int id, String no_recette, String no_ingredient, int quantite, String unite) {
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
	public String getNo_recette() {
		return no_recette;
	}
	public void setNo_recette(String no_recette) {
		this.no_recette = no_recette;
	}
	public String getNo_ingredient() {
		return no_ingredient;
	}
	public void setNo_ingredient(String no_ingredient) {
		this.no_ingredient = no_ingredient;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
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
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	
	
	
	
	

}
