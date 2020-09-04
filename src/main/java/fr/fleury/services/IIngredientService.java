package fr.fleury.services;

import java.util.List;

import fr.fleury.entities.Ingredient;

public interface IIngredientService {
	
	public void addIngredient(Ingredient iIn);
	public void delIngredient(int iId);
	public void modIngredient(Ingredient iIn);
	
	public Ingredient getIngredientById(int iId);
	public List<Ingredient> getAllIngredient();

}
