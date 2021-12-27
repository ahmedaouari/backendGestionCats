package com.hdm.gestionCars.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.AideStationnement;
@Repository
public interface  RepositoryAideStationnement  extends JpaRepository<AideStationnement, Long> {
	


}
