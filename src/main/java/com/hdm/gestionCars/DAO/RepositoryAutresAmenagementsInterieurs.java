package com.hdm.gestionCars.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.AutresAmenagementsInterieurs;
@Repository
public interface RepositoryAutresAmenagementsInterieurs extends JpaRepository<AutresAmenagementsInterieurs, Long>{
	
}


