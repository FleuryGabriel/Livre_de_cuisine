package fr.fleury.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fleury.dao.IQuantiteDao;
import fr.fleury.entities.Quantite;
import fr.fleury.entities.Recette;

@Service
public class QuantiteServiceImpl implements IQuantiteService {

	// Lien UML
	@Autowired
	private IQuantiteDao qDao;

	@Override
	public Quantite addQuantite(Quantite qIn) {
		return qDao.save(qIn);
	}

	@Override
	public void delQuantite(int qId) {
		qDao.deleteById(qId);
	}

	@Override
	public Quantite modQuantite(Quantite qIn) {
		return qDao.save(qIn);
	}

	@Override
	public Quantite getQuantiteById(int qId) {
		Optional<Quantite> op = qDao.findById(qId);
		return op.get();
	}

	@Override
	public List<Quantite> getAllQuantite() {
		return qDao.findAll();
	}

	@Override
	public List<Quantite> getQuantiteByRecette(int id) {
		return qDao.getQuantiteByRecette(id);
	}

	@Override
	public Map<String, Double> genererListe(Map<Recette, Integer> repas) {

		Map<String, Integer> listeCourse = new HashMap<String, Integer>();

		// Ajustement des dosages à la demande de l'utilisateur
		for (Recette r : repas.keySet()) {
			if (r.getNbPersonnes() != repas.get(r)) {
				double coef = repas.get(r) / r.getNbPersonnes();
				for (Quantite q : r.getComposants()) {
					q.setDose(q.getDose() * coef);
				}
			}
		}

		// Remplissage d'un set des ingrédients présents dans la liste de course.
		Set<String> ingredientCourse = new HashSet<String>();
		for (Recette r : repas.keySet()) {
			for (Quantite q : r.getComposants()) {
				ingredientCourse.add(q.getNo_ingredient());
			}
		}

		for (String s : ingredientCourse) {
			listeCourse.put(s, 0);
			for (Recette r : repas.keySet()) {
				for (Quantite q : r.getComposants()) {
					if (q.getNo_recette().equals(s)) {
						//Compléter
					}
				}
			}
		}

		return null;
	}

}
