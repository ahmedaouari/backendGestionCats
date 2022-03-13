package com.hdm.gestionCars.DAO;

import java.util.ArrayList;
import java.util.List;

import com.hdm.gestionCars.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.request.CarActivityRequest;

@Repository
public interface RepositoryCar extends JpaRepository<Car, Integer> {

	@Modifying
	@Query("DELETE FROM  Car  where carId = :carId")
	void deleteCar(@Param("carId") int carId);

	@Modifying
	@Query("FROM  Car  where statut = true")
	ArrayList<Car> findAllCarEnStock();

	@Query(value = "SELECT * FROM Car c LEFT JOIN Activity a ON c.car_id = a.car_key and a.price=(SELECT max(price) FROM Activity)", nativeQuery = true)
	List<Activity> listOfAllCars();

//	FROM Activity
//	SELECT c.car_id, MAX(price), a.activity_date FROM ((activity a LEFT JOIN entreprise e  ON a.entreprise_key = e.entreprise_id) LEFT JOIN car c ON a.car_key = c.car_id) WHERE a.entreprise_key = 1;
//	SELECT e.entreprise_name, c.car_id, MAX(price), a.activity_date FROM ((activity a LEFT JOIN entreprise e  ON a.entreprise_key = e.entreprise_id) LEFT JOIN car c ON a.car_key = c.car_id) WHERE a.entreprise_key = 1;

// FROM CAR
//	SELECT MAX(a.price) FROM car c LEFT JOIN activity a ON c.activity_key = a.activity_id WHERE c.car_id = 1;

}
