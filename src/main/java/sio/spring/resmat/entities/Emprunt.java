package sio.spring.resmat.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Emprunt {
	@Id
	private UUID id = UUID.randomUUID();

	private LocalDateTime dateRemise;

	private LocalDateTime dateRetourPrevue;

	private LocalDateTime dateRetourEffective;

	@Column(length = 6500)
	private String commentaire;

	private boolean degradations;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	private Reservation reservation;

}
