package fr.fleury.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.fleury.entities.Ingredient;
import fr.fleury.entities.Recette;
import fr.fleury.services.IRecetteService;

@RestController
@RequestMapping("/recette")
@CrossOrigin(origins = "*")
public class RecetteRest {
	
	@Autowired
	private IRecetteService rService;
			
	@PostMapping(value = "/add", produces = "application/json")
	public Recette addRecette(@RequestBody Recette r) {
		// appel methode service
		return rService.addRecette(r);
	}

	@DeleteMapping(value = "/del/{id}")
	public void delRecetteById(@PathVariable("id") int id) {
		// appel methode service
		rService.delRecette(id);;
		
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<Recette> getAllRecette() {
		// appel methode service
		return rService.getAllRecette();
	}

	@GetMapping(value = "/getById/{id}", produces = "application/json")
	public Recette getRecetteById(@PathVariable("id") int id) {
		// appel methode service
		return rService.getRecetteById(id);
	}

	@PutMapping(value = "/update", produces = "application/json")
	public Recette updateEtudiant(@RequestBody Recette r) {
		// appel methode service
		return rService.modRecette(r);
	}
	

}
