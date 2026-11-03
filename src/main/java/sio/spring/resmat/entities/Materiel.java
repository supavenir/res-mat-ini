package sio.spring.resmat.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Materiel {
	@Id
	private UUID id = UUID.randomUUID();

	@Column(length = 150, nullable = false)
	private String nom;

	@Column(length = 65000)
	private String description;

	@Column(nullable = false)
	private boolean disponible;

	@ManyToOne
	private TypeMateriel type;

}
