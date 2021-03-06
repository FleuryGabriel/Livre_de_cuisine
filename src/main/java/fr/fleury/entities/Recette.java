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
@Table(name = "recettes")
public class Recette implements Serializable{
	
	//Attributs

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_r")
	private int id;
	private String nom;
	private String source; //D'où provient la recette
	private String typePlat; //Entrée, plat, dessert...
	private String lien; //Un lien vers la recette si elle est numérique
	private int nbPersonnes; //Nombre de personnes pour qui cette recette est faite.

	//Liens UML
	
	@OneToMany(mappedBy = "recette")
	private List<Quantite> composants;
	
	//Constructeurs
	public Recette() {
		super();
	}


	public Recette(String nom, String source, String typePlat, String lien,int nbPersonnes) {
		super();
		this.nom = nom;
		this.source = source;
		this.typePlat = typePlat;
		this.lien = lien;
		this.nbPersonnes = nbPersonnes;
	}


	public Recette(int id, String nom, String source, String typePlat, String lien, int nbPersonnes) {
		super();
		this.id = id;
		this.nom = nom;
		this.source = source;
		this.typePlat = typePlat;
		this.lien = lien;
		this.nbPersonnes = nbPersonnes;
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


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getTypePlat() {
		return typePlat;
	}


	public void setTypePlat(String typePlat) {
		this.typePlat = typePlat;
	}


	public String getLien() {
		return lien;
	}


	public void setLien(String lien) {
		this.lien = lien;
	}


	@JsonIgnore
	public List<Quantite> getComposants() {
		return composants;
	}


	public void setComposants(List<Quantite> composants) {
		this.composants = composants;
	}


	public int getNbPersonnes() {
		return nbPersonnes;
	}


	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}
	
	

}
