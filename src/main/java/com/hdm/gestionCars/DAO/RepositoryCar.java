package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Car;

@Repository
public interface RepositoryCar extends JpaRepository<Car, Integer> {

	
	@Modifying
	@Query("DELETE FROM  Car  where carId = :carId")
	void  deleteCar(@Param("carId") int carId);

}
