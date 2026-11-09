package sio.spring.resmat.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sio.spring.resmat.entities.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel, UUID> {

}
