package com.hdm.gestionCars.DAO;

import java.util.ArrayList;
import java.util.List;

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
	List<Object> listOfAllCars();

	@Query(value = "SELECT * FROM car c WHERE c.car_id IN (SELECT vc.car FROM vente_car vc WHERE vc.vente = ?1)", nativeQuery = true)
	List<Car> getListCarsByVente(Integer venteId);
}
