package sio.spring.resmat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation {
	@Id
	private UUID id = UUID.randomUUID();

	private LocalDateTime dateResa = LocalDateTime.now();

	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@Column(length = 6500)
	private String commentaire;

	private boolean avis;

	@Column(length = 6500)
	private String motivationAvis;

	@ManyToOne(optional = false)
	private Utilisateur emprunteur;

	@ManyToOne(optional = false)
	private Utilisateur gestionnaire;

	@ManyToOne(optional = false)
	private TypeMateriel typeMateriel;

	@OneToOne(mappedBy = "reservation", optional = true, fetch = FetchType.LAZY)
	private Emprunt emprunt;
}
