package com.hdm.gestionCars.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.Entreprise;

public interface ActivityDAO extends JpaRepository<Activity, Long> {

	List<Activity> findByEntreprise(Entreprise entreprise);

	Activity findByActivityId(Long activityId);

	@Query(value = "SELECT MAX(a.price), a.entreprise_key, a.activity_id, a.activity_date FROM Activity a LEFT JOIN Entreprise e ON a.entreprise_key = e.entreprise_id WHERE a.entreprise_key= :entrepriseId", nativeQuery = true)
	List<Object> listOfActivitiesFromTheDBMax(@Param(value = "entrepriseId") Long entrepriseId);

	@Query(value = "SELECT a.entreprise.entrepriseId FROM Activity a WHERE a.price=(SELECT MAX(price) FROM Activity a2 WHERE a.car.carId = ?1)")
	Integer findMaxActivityByCar(Integer carId);

}
