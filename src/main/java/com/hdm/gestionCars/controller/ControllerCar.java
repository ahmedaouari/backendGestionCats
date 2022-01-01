package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.DAO.RepositoryColorExterior;
import com.hdm.gestionCars.DAO.RepositoryColorInterior;
import com.hdm.gestionCars.DAO.RepositoryFabricant;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Fabricant;
import com.hdm.gestionCars.request.CarRequest;
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
	public Car createNewCarInTheSystem(@RequestBody CarRequest request) {

		Car car = new Car(request.getModel(), request.getVariante(), request.getConception(), request.getAilette(),
				request.getInscription(), request.getMarque(), request.getKilometre(), request.getPuissance(),
				request.getCapacite(), request.getCarburant(), request.getTransmission(), request.getcO2(),
				request.getTypePeinture(), 0, 0, 0, request.getEvaluateur(), request.getPrixReserve(),
				request.getImposition(), request.getPrixVente(), request.getAcheteurs(), request.getPrixAchat(),
				request.getVendeur(), request.getCoutsSupplementaires(), request.getRamasse());

		Fabricant fabricant_ = fabricant.getById(request.getFabricantID());
		CouleurExterieur exterior_ = exterior.getById(request.getExteriorId());
		CouleurInterieur interior_ = interior.getById(request.getInteriorId());
		if (fabricant_ != null && exterior_ != null && interior_ != null) {
			car.setFabricant(fabricant_);
			car.setCouleurExterieur(exterior_);
			car.setCouleurInterieur(interior_);
		}

		Car save = repositoryCar.save(car);
		return save;
	}

	@GetMapping(value = "/car/{id}")
	public Car getCarById(@PathVariable(name = "id") Integer id) {
		Car car = repositoryCar.findCarById(id);
		return car;

	}

}
