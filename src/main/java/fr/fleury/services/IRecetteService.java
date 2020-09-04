package fr.fleury.services;

import java.util.List;

import fr.fleury.entities.Recette;

public interface IRecetteService {
	
	public void addRecette(Recette rIn);
	public void delRecette(int rId);
	public void modRecette(Recette rIn);
	
	public Recette getRecetteById(int rId);
	public List<Recette> getAllRecette();

}
