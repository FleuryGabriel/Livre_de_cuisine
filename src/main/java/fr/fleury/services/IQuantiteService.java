package fr.fleury.services;

import java.util.List;

import fr.fleury.entities.Quantite;

public interface IQuantiteService {
	
	public Quantite addQuantite(Quantite qIn);
	public void delQuantite(int qId);
	public Quantite modQuantite(Quantite qIn);
	
	public Quantite getQuantiteById(int qId);
	public List<Quantite> getAllQuantite();
	
	public List<Quantite> getQuantiteByRecette(int id);
	

}
