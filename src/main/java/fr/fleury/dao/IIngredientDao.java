package fr.fleury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Ingredient;

@Repository
public interface IIngredientDao extends JpaRepository<Ingredient, Integer>{
	
	@Query(value = "SELECT i.* FROM ingredients i WHERE i.nom LIKE %:pCle%", nativeQuery = true)
	public List<Ingredient> findByMotCle(@Param("pCle") String cle);

}
