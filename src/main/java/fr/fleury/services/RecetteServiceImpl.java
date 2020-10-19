package fr.fleury.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fleury.dao.IRecetteDao;
import fr.fleury.entities.Ingredient;
import fr.fleury.entities.Recette;

@Service
public class RecetteServiceImpl implements IRecetteService{
	
	//Lien UML
	@Autowired
	private IRecetteDao rDao;

	@Override
	public Recette addRecette(Recette rIn) {
		return rDao.save(rIn);
	}

	@Override
	public void delRecette(int rId) {
		rDao.deleteById(rId);
	}

	@Override
	public Recette modRecette(Recette rIn) {
		return rDao.save(rIn);
	}

	@Override
	public Recette getRecetteById(int rId) {
		Optional<Recette> op = rDao.findById(rId);
		return op.get();
	}

	@Override
	public List<Recette> getAllRecette() {
		return rDao.findAll();
	}


}
