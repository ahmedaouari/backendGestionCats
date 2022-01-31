package com.hdm.gestionCars.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hdm.gestionCars.DAO.REpositoryAutreEquipement;
import com.hdm.gestionCars.DAO.RepositoruAutre;
import com.hdm.gestionCars.DAO.RepositoryAideStationnement;
import com.hdm.gestionCars.DAO.RepositoryAttelageRemorque;
import com.hdm.gestionCars.DAO.RepositoryAutresAmenagementsIntr;
import com.hdm.gestionCars.DAO.RepositoryClimatisation;
import com.hdm.gestionCars.DAO.RepositoryColorExterior;
import com.hdm.gestionCars.DAO.RepositoryColorInterior;
import com.hdm.gestionCars.DAO.RepositoryDocument;
import com.hdm.gestionCars.DAO.RepositoryFabricant;
import com.hdm.gestionCars.DAO.RepositoryMatriaulInterieur;
import com.hdm.gestionCars.DAO.RepositoryRegulateurVitesse;
import com.hdm.gestionCars.model.AideStationnement;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.Autre;
import com.hdm.gestionCars.model.AutresAmenagementsInt;
import com.hdm.gestionCars.model.AutresEquipement;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Climatisation;
import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Document;
import com.hdm.gestionCars.model.Fabricant;
import com.hdm.gestionCars.model.MateriauInterieur;
import com.hdm.gestionCars.model.RegulateurVitesse;
import com.hdm.gestionCars.request.CarRequest;
import com.hdm.gestionCars.service.IStorageFile;
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
	@Autowired
	RepositoryClimatisation repositoryClimatisation;
	 @Autowired
	 RepositoryAutresAmenagementsIntr repositoryAutresAmenagementsIntr;
	 @Autowired
	 RepositoruAutre repositoruAutre;
	 @Autowired
	 RepositoryDocument repositoryDocument;

	  @Autowired
	  IStorageFile storageService;

	  @PostMapping("/upload")
	  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	    try {
	      storageService.save(file);

	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(message);
	    } catch (Exception e) {
	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
	    }
	  }
	  
	  @GetMapping("/liste")
	    public List<Car> readAll(){
	        return repositoryCar.findAll();
	    }
	@GetMapping(value = "/list-cars")
	public List<Car> allCars() {
		return repositoryCar.findAll();
	}

	@PostMapping(value = "/new-car")
	public ResponseEntity<Object>  createNewCarInTheSystem(@RequestBody Car car) { 
		System.out.println(car.toString());
		   try{
			   repositoryCar.save(car);
	            return new ResponseEntity<>(car, HttpStatus.OK);
	        } catch (DataAccessException e) {
	            System.out.println("Exception in new car controller : "+e);
	            return new ResponseEntity<>(e,HttpStatus.NOT_ACCEPTABLE);
	        }
	}


	@GetMapping("/car/{id}")
	public ResponseEntity<Object> findbyid(@PathVariable("id") Integer id) {
		Optional<Car> car= repositoryCar.findCarById(id);
		if(car.isPresent()){
			return new ResponseEntity<>(car.get(), HttpStatus.OK);
		}
		else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
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
		List<AutresEquipement> AutreEquipements= repositoryAutreEquipement.findAll();
	//	List<MateriauInterieur> MateriauIntérieurs= repositoryMatriaulInterieur.findAll();
		List<Autre> autres=repositoruAutre.findAll();
		List<Document> documetes=repositoryDocument.findAll();
		List<Climatisation> Climatisations=repositoryClimatisation.findAll();
		List<AutresAmenagementsInt> AutresAmenagementsIntrs=repositoryAutresAmenagementsIntr.findAll();

		 Map<String, Object> map= new HashedMap();
		  map.put("fabricants",fabricants);
		  map.put("CouleurExterieurs",CouleurExterieurs);
		  map.put("CouleurInterieurs",CouleurInterieurs);
		  map.put("AttelageRemorques",AttelageRemorques);
		  map.put("AideStationnements",AideStationnements);
		  map.put("RegulateurVitesses",RegulateurVitesses);
		  map.put("AutreEquipements",AutreEquipements);
		 // map.put("MateriauIntérieurs",MateriauIntérieurs);
		  map.put("autres",autres);
		  map.put("documetes",documetes);
		  map.put("Climatisations",Climatisations);
		  map.put("AutresAmenagementsIntrs",AutresAmenagementsIntrs);

		  System.out.println(map);
		 return map;
		
	}

}
