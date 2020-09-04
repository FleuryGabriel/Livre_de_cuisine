package fr.fleury.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fleury.dao.IIngredientDao;
import fr.fleury.entities.Ingredient;

@Service
public class IngredientServiceImpl implements IIngredientService{
	
	//Lien UML
	
	@Autowired
	private IIngredientDao iDao;

	@Override
	public void addIngredient(Ingredient iIn) {
		iDao.save(iIn);
	}

	@Override
	public void delIngredient(int iId) {
		iDao.deleteById(iId);
	}

	@Override
	public void modIngredient(Ingredient iIn) {
		iDao.save(iIn);
	}

	@Override
	public Ingredient getIngredientById(int iId) {
		Optional<Ingredient> op = iDao.findById(iId);
		return op.get();
	}

	@Override
	public List<Ingredient> getAllIngredient() {
		return iDao.findAll();
	}

}
