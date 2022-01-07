package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Entreprise;

@Repository
public interface RepositoryEntreprise extends JpaRepository<Entreprise, Long> {
	Entreprise findByEntrepriseId(Long entrepriseId);
}
