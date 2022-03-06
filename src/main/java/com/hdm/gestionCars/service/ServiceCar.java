package com.hdm.gestionCars.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.Car;

@Service
public class ServiceCar {

	@Autowired
	RepositoryCar repositoryCar;

	public Car save(Car c) {
		return repositoryCar.saveAndFlush(c);
	}

	public List<Car> findAll() {
		List<Car> cars = repositoryCar.findAll();
		cars.stream().forEach(car -> {
			car.getActivities().stream().sorted(Comparator.comparing(Activity::getPrice));
//			car.getActivities().stream().sorted(Comparator.comparingDouble(Activity::getPrice).reversed())
//					.collect(Collectors.toList());
		});

		return cars;
	}

	public List<Car> findAllCarEnStock() {
		return repositoryCar.findAllCarEnStock();
	}

	@Transactional
	public Optional<Car> findCarById(Integer id) {
		return repositoryCar.findById(id);
	}

	@Transactional
	public int deleteBuId(Integer id) {
		try {
			repositoryCar.deleteCar(id);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	@Transactional
	public List<Object> _Lists() {
		return repositoryCar.listOfAllCars();

	}

}
