package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Climatisation;

@Repository
public interface RepositoryClimatisation extends JpaRepository<Climatisation, Long> {

}
