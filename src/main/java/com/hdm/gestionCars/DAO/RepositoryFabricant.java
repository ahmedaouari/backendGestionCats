package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Fabricant;

@Repository
public interface RepositoryFabricant extends JpaRepository<Fabricant, Long> {

}
