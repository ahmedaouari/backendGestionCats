package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Vente;
@Repository
public interface RepositoryVente extends JpaRepository<Vente, Long> {

}
