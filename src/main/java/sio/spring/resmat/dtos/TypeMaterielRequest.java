package sio.spring.resmat.dtos;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeMaterielRequest {
	private UUID id;
	private String nom;
	private String description;
	private int dureeMaxEmprunt;
	private boolean auCatalogue;
	private UUID categorieId;
}
