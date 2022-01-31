package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.MateriauInterieur;
@Repository
public interface RepositoryMatriaulInterieur  extends JpaRepository<MateriauInterieur, Long>{

}
