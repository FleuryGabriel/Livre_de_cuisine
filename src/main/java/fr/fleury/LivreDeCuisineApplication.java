package fr.fleury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fleury.services.IRecetteService;
import fr.fleury.services.RecetteServiceImpl;

@SpringBootApplication
public class LivreDeCuisineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivreDeCuisineApplication.class, args);
		
		IRecetteService rService = new RecetteServiceImpl();
		
		System.out.println(rService.getIngredients());
	}

}
