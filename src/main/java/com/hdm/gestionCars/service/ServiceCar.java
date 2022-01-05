package com.hdm.gestionCars.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.Car;

@Service
public class ServiceCar {

	@Autowired
	RepositoryCar repositoryCar;

	public Car save(Car c) {
		return repositoryCar.saveAndFlush(c);
	}

	public List<Car> findAll() {
		return repositoryCar.findAll();
	}

	public Car findCarById(Integer id) {
		return repositoryCar.getById(id);
	}
	@Transactional
	public  int    deleteBuId(Integer id){
		try {
			repositoryCar.deleteCar(id);
			return 1;
		} catch (Exception e) {
			 System.out.println(e);
			return 0;
		}
	}
	

}
