package com.hdm.gestionCars.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.DAO.RepositoryColorExterior;
import com.hdm.gestionCars.DAO.RepositoryColorInterior;
import com.hdm.gestionCars.DAO.RepositoryFabricant;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.request.CarRequest;
import com.hdm.gestionCars.response.CarResponse;
import com.hdm.gestionCars.service.ServiceCar;

@RestController
@RequestMapping(path = { "/api" })
public class ControllerCar {

	@Autowired
	ServiceCar repositoryCar;

	@Autowired
	private RepositoryFabricant fabricant;

	@Autowired
	private RepositoryColorExterior exterior;

	@Autowired
	private RepositoryColorInterior interior;

	@GetMapping(value = "/list-cars")
	public List<Car> allCars() {
		return repositoryCar.findAll();
	}

	@PostMapping(value = "/new-car")
	public CarResponse createNewCarInTheSystem(@RequestBody CarRequest request)
			throws IllegalAccessException, InvocationTargetException {

		Car car = new Car(request.getModel(), request.getVariante(), request.getConception(), request.getAilette(),
				request.getInscription(), request.getMarque(), request.getKilometre(), request.getPuissance(),
				request.getCapacite(), request.getCarburant(), request.getTransmission(), request.getcO2(),
				request.getTypePeinture(), 0, 0, 0, request.getEvaluateur(), request.getPrixReserve(),
				request.getImposition(), request.getPrixVente(), request.getAcheteurs(), request.getPrixAchat(),
				request.getVendeur(), request.getCoutsSupplementaires(), request.getRamasse());

		car.setFabricant(request.getFabricant());
		car.setCouleurExterieur(request.getCouleurExterieur());
		car.setCouleurInterieur(request.getCouleurInterieur());

		Car save = repositoryCar.save(car);
		CarResponse response = new CarResponse();
		BeanUtils.copyProperties(response, save);
		return response;
	}

}
