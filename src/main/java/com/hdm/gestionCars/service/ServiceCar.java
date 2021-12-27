package com.hdm.gestionCars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.Car;


@Service
public class ServiceCar {

	@Autowired
RepositoryCar repositoryCar;
	
	public Car save(Car c){
		return repositoryCar.save(c);
	}

}
