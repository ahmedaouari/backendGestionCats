package com.hdm.gestionCars.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.AutresAmenagementsInt;
@Repository
public interface RepositoryAutresAmenagementsIntr extends JpaRepository<AutresAmenagementsInt, Long>{
	
}


