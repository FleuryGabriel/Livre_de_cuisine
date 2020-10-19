package fr.fleury.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Quantite;

@Repository
public interface IQuantiteDao extends JpaRepository<Quantite, Integer>{
	
	@Query(value = "SELECT * FROM quantites WHERE r_id=:pId", nativeQuery=true)
	public List<Quantite> getQuantiteByRecette(@Param(value="pId") int idRecette);

}
