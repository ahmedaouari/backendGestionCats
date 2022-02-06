package com.hdm.gestionCars.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.model.Favorite;

public interface FavoriteDAO extends JpaRepository<Favorite, Long> {
	List<Favorite> findByEntreprise(Entreprise entreprise);
}
