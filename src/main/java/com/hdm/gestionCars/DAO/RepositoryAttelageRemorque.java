package com.hdm.gestionCars.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.AttelageRemorque;
@Repository
public interface RepositoryAttelageRemorque extends JpaRepository<AttelageRemorque, Long>{
	
}