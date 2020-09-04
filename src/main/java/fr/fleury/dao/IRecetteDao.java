package fr.fleury.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Recette;

@Repository
public interface IRecetteDao extends JpaRepository<Recette, Integer>{

}
