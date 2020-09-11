package fr.fleury.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fleury.dao.IQuantiteDao;
import fr.fleury.entities.Quantite;

@Service
public class QuantiteServiceImpl implements IQuantiteService{
	
	//Lien UML
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

}
