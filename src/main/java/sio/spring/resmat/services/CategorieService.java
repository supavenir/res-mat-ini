package sio.spring.resmat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import sio.spring.resmat.entities.Categorie;
import sio.spring.resmat.repositories.CategorieRepository;

@Service
public class CategorieService {

	private final CategorieRepository categorieRepository;

	CategorieService(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

}
