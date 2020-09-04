package fr.fleury.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fleury.entities.Quantite;

@Repository
public interface IQuantiteDao extends JpaRepository<Quantite, Integer>{

}
