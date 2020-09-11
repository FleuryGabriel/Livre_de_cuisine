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

import fr.fleury.entities.Quantite;
import fr.fleury.services.IQuantiteService;

@RestController
@RequestMapping("/quantite")
@CrossOrigin(origins = "*")
public class QuantiteRest {
	
	@Autowired
	private IQuantiteService qService;
			
	@PostMapping(value = "/add", produces = "application/json")
	public Quantite addQuantite(@RequestBody Quantite q) {
		// appel methode service
		return qService.addQuantite(q);
	}

	@DeleteMapping(value = "/del/{id}")
	public void delQuantiteById(@PathVariable("id") int id) {
		// appel methode service
		qService.delQuantite(id);;
		
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<Quantite> getAllQuantite() {
		// appel methode service
		return qService.getAllQuantite();
	}

	@GetMapping(value = "/getById/{id}", produces = "application/json")
	public Quantite getQuantiteById(@PathVariable("id") int id) {
		// appel methode service
		return qService.getQuantiteById(id);
	}

	@PutMapping(value = "/update", produces = "application/json")
	public Quantite updateQuantite(@RequestBody Quantite q) {
		// appel methode service
		return qService.modQuantite(q);
	}

}
