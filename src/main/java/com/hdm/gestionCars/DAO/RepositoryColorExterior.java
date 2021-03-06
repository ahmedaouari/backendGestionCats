package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.CouleurExterieur;

@Repository
public interface RepositoryColorExterior extends JpaRepository<CouleurExterieur, Long> {

}
