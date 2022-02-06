package com.hdm.gestionCars.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.Entreprise;

public interface ActivityDAO extends JpaRepository<Activity, Long> {

	List<Activity> findByEntreprise(Entreprise entreprise);

}
