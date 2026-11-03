package sio.spring.resmat.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categorie {
	@Id
	private UUID id = UUID.randomUUID();

	@Column(length = 150, nullable = false)
	private String nom;

	@OneToMany(mappedBy = "categorie")
	private List<TypeMateriel> types;

}
