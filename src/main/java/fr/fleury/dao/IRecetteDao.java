package fr.fleury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Recette;

@Repository
public interface IRecetteDao extends JpaRepository<Recette, Integer> {

	@Query(value = "SELECT * FROM recettes r WHERE r.nom LIKE %:pCle%", nativeQuery = true)
	public List<Recette> findByMotCle(@Param("pCle") String cle);

	@Query(value = "SELECT r.* FROM recettes r INNER JOIN quantites q ON r.id_r=q.r_id INNER JOIN ingredients i ON q.i_id=i.id_i WHERE i.id_i=:pId", nativeQuery = true)
	public List<Recette> findByIngredient(@Param("pId") int idIngredient);

}
