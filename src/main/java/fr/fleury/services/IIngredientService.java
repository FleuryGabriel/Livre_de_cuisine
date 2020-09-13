package fr.fleury.services;

import java.util.List;

import fr.fleury.entities.Ingredient;

public interface IIngredientService {
	
	public Ingredient addIngredient(Ingredient iIn);
	public void delIngredient(int iId);
	public Ingredient modIngredient(Ingredient iIn);
	
	public Ingredient getIngredientById(int iId);
	public List<Ingredient> getAllIngredient();
	
	public List<Ingredient> getByMotCle(String cle);

}
