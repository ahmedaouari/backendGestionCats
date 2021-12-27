package com.hdm.gestionCars.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.RegulateurVitesse;
@Repository
public interface RepositoryRegulateurVitesse  extends JpaRepository<RegulateurVitesse, Long>{
	
}
