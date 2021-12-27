package com.hdm.gestionCars.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.PienceJointe;
@Repository
public interface  RepositoryPienceJointextends extends JpaRepository<PienceJointe, Long>{
	
}
	
	


