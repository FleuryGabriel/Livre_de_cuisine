package fr.fleury.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Ingredient;

@Repository
public interface IIngredientDao extends JpaRepository<Ingredient, Integer>{

}
