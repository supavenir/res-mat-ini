package sio.spring.resmat.services;

import java.util.List;

import org.springframework.stereotype.Service;

import sio.spring.resmat.entities.TypeMateriel;
import sio.spring.resmat.repositories.TypeMaterielRepository;

@Service
public class TypeMaterielService {

	private final TypeMaterielRepository typeMaterielRepository;

	TypeMaterielService(TypeMaterielRepository typeMaterielRepository) {
		this.typeMaterielRepository = typeMaterielRepository;
	}

	public List<TypeMateriel> findAll() {
		return typeMaterielRepository.findAll();
	}

}
