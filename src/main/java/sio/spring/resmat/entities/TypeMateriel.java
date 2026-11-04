package sio.spring.resmat.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TypeMateriel {
	@Id
	private UUID id = UUID.randomUUID();

	@Column(length = 150, nullable = false)
	private String nom;

	@Column(length = 65000)
	private String description;

	private int dureeMaxEmprunt;

	@Column(nullable = false)
	private boolean auCatalogue;

	@ManyToOne()
	private Categorie categorie;

	@OneToMany(mappedBy = "type")
	private List<Materiel> materiels;

	@OneToMany(mappedBy = "typeMateriel")
	private List<Reservation> reservations;

}
