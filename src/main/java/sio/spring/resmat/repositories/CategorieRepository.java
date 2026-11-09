package sio.spring.resmat.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sio.spring.resmat.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, UUID> {

}
