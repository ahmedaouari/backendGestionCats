package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.CouleurInterieur;

@Repository
public interface RepositoryColorInterior extends JpaRepository<CouleurInterieur, Long> {

}
