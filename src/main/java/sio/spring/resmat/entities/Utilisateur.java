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
public class Utilisateur {
	@Id
	private UUID id = UUID.randomUUID();

	@Column(length = 50)
	private String nom;

	@Column(length = 50)
	private String prenom;

	@Column(length = 255)
	private String email;

	@Column(length = 50, unique = true)
	private String login;

	@Column(length = 255)
	private String motDePasse;

	private boolean gestionnaire;

	@OneToMany(mappedBy = "emprunteur")
	private List<Reservation> mesReservations;

	@OneToMany(mappedBy = "gestionnaire")
	private List<Reservation> reservationsGerees;

}
