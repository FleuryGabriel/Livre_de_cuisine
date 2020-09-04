package fr.fleury.services;

import java.util.List;

import fr.fleury.entities.Quantite;

public interface IQuantiteService {
	
	public void addQuantite(Quantite qIn);
	public void delQuantite(int qId);
	public void modQuantite(Quantite qIn);
	
	public Quantite getQuantiteById(int qId);
	public List<Quantite> getAllQuantite(); //J'ai des doutes sur l'utilité de celle-ci...
	

}
