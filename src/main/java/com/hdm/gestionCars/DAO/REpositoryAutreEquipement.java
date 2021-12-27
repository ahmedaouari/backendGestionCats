package com.hdm.gestionCars.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.AutreEquipement;
@Repository
public interface REpositoryAutreEquipement extends JpaRepository<AutreEquipement, Long>{
	
}


