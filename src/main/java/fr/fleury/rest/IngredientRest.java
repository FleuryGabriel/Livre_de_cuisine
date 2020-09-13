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
import fr.fleury.services.IIngredientService;

@RestController
@RequestMapping("/ingredient")
@CrossOrigin(origins = "*")
public class IngredientRest {
	
	@Autowired
	private IIngredientService iService;
			
	@PostMapping(value = "/add", produces = "application/json")
	public Ingredient addIngredient(@RequestBody Ingredient i) {
		// appel methode service
		return iService.addIngredient(i);
	}

	@DeleteMapping(value = "/del/{id}")
	public void delIngredientById(@PathVariable("id") int id) {
		// appel methode service
		iService.delIngredient(id);;
		
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<Ingredient> getAllIngredient() {
		// appel methode service
		return iService.getAllIngredient();
	}

	@GetMapping(value = "/getById/{id}", produces = "application/json")
	public Ingredient getIngredientById(@PathVariable("id") int id) {
		// appel methode service
		return iService.getIngredientById(id);
	}

	@PutMapping(value = "/update", produces = "application/json")
	public Ingredient updateEtudiant(@RequestBody Ingredient i) {
		// appel methode service
		return iService.modIngredient(i);
	}
	
	@GetMapping(value = "/getCle/{pCle}", produces = "application/json")
	public List<Ingredient> getByCle(@PathVariable("pCle") String cle){
		return iService.getByMotCle(cle);
	}

}
