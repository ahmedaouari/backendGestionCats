package com.hdm.gestionCars.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.DAO.REpositoryAutreEquipement;
import com.hdm.gestionCars.DAO.RepositoryAideStationnement;
import com.hdm.gestionCars.DAO.RepositoryAttelageRemorque;
import com.hdm.gestionCars.DAO.RepositoryColorExterior;
import com.hdm.gestionCars.DAO.RepositoryColorInterior;
import com.hdm.gestionCars.DAO.RepositoryFabricant;
import com.hdm.gestionCars.DAO.RepositoryMatriaulInterieur;
import com.hdm.gestionCars.DAO.RepositoryRegulateurVitesse;
import com.hdm.gestionCars.model.AideStationnement;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.AutreEquipement;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Fabricant;
import com.hdm.gestionCars.model.MateriauIntérieur;
import com.hdm.gestionCars.model.RegulateurVitesse;
import com.hdm.gestionCars.request.CarRequest;
import com.hdm.gestionCars.service.ServiceCar;
@CrossOrigin
@RestController
@RequestMapping(path = { "/api" })
public class ControllerCar {

	@Autowired
	ServiceCar repositoryCar;

	@Autowired
	RepositoryFabricant repositoryFabricant;
	@Autowired
	RepositoryColorExterior repositoryColorExterior;
	@Autowired
	RepositoryColorInterior repositoryColorInterior;
	@Autowired
	RepositoryAttelageRemorque repositoryAttelageRemorque;
	@Autowired
	RepositoryAideStationnement repositoryAideStationnement;
	@Autowired 
	RepositoryRegulateurVitesse repositoryRegulateurVitesse;
	
	@Autowired
	REpositoryAutreEquipement repositoryAutreEquipement;
	@Autowired
	RepositoryMatriaulInterieur repositoryMatriaulInterieur;

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

		Fabricant fabricant_ = repositoryFabricant.getById(request.getFabricantID());
		CouleurExterieur exterior_ = repositoryColorExterior.getById(request.getExteriorId());
		CouleurInterieur interior_ = repositoryColorInterior.getById(request.getInteriorId());
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
	@GetMapping(value = "/delete/{id}")
	public int  deleteCar(@PathVariable(name = "id") Integer id) {
		return repositoryCar.deleteBuId(id);

	}
	@GetMapping(value = "/allRepositoryCar")
	public Map<String, Object> allRepositoryCar(){
		List<Fabricant> fabricants=repositoryFabricant.findAll();
		List<CouleurExterieur> CouleurExterieurs=repositoryColorExterior.findAll();
		List<CouleurInterieur> CouleurInterieurs=repositoryColorInterior.findAll();
		List<AttelageRemorque> AttelageRemorques= repositoryAttelageRemorque.findAll();
		List<AideStationnement> AideStationnements=repositoryAideStationnement.findAll();
		List<RegulateurVitesse> RegulateurVitesses= repositoryRegulateurVitesse.findAll();
		List<AutreEquipement> AutreEquipements= repositoryAutreEquipement.findAll();
		List<MateriauIntérieur> MateriauIntérieurs= repositoryMatriaulInterieur.findAll();
		 Map<String, Object> map= new HashedMap();
		  map.put("fabricants",fabricants);
		  map.put("CouleurExterieurs",CouleurExterieurs);
		  map.put("CouleurInterieurs",CouleurInterieurs);
		  map.put("AttelageRemorques",AttelageRemorques);
		  map.put("AideStationnements",AideStationnements);
		  map.put("RegulateurVitesses",RegulateurVitesses);
		  map.put("AutreEquipements",AutreEquipements);
		  map.put("MateriauIntérieurs",MateriauIntérieurs);
		  System.out.println(map);
		 return map;
		
	}

}
