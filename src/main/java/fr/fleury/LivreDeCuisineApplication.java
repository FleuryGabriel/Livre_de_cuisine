package fr.fleury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fleury.entities.Recette;
import fr.fleury.services.IRecetteService;
import fr.fleury.services.RecetteServiceImpl;

@SpringBootApplication
public class LivreDeCuisineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivreDeCuisineApplication.class, args);
		
	}

}
