package com.hdm.gestionCars.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.request.CarActivityRequest;

@Service
public class ServiceCar {

	@Autowired
	RepositoryCar repositoryCar;
	@Autowired
	ActivityService service;

	public Car save(Car c) {
		return repositoryCar.saveAndFlush(c);
	}

	public List<Car> findAll() {
		List<Car> cars = repositoryCar.findAll();
		return cars;
	}
	
	public List<CarActivityRequest> customFindAll() {
		List<Car> cars = repositoryCar.findAll();
		List<CarActivityRequest> carActivityRequests = new ArrayList<CarActivityRequest>();
		cars.stream().forEach(car -> {
			
			CarActivityRequest activityRequest = new CarActivityRequest();
			Integer theHighestActivityPrice = service.getTheHighestActivityPrice(car.getCarId());
			activityRequest.setCar(car);
			activityRequest.setEntrepriseId(theHighestActivityPrice);
			carActivityRequests.add(activityRequest);
		});

		return carActivityRequests;
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
