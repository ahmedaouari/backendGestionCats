package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Car;
@Repository
public interface RepositoryCar  extends JpaRepository<Car, Long> {

}
