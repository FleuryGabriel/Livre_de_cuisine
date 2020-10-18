package fr.fleury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Ingredient;
import fr.fleury.entities.Recette;

@Repository
public interface IRecetteDao extends JpaRepository<Recette, Integer>{
	
	@Query(value = "SELECT * FROM ingredients AS i LEFT JOIN quantites AS q ON i.id_i=q.i_id LEFT JOIN Recette AS r ON r.id_r=q.r_id", nativeQuery = true)
	public List<Ingredient> getIngredients();

}
