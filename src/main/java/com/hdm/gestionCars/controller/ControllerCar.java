package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.AutrInformations;
import com.hdm.gestionCars.model.Car;



@RestController
public class ControllerCar {
	
	@Autowired
	RepositoryCar repositoryCar;
	
	
	@GetMapping
	public List<Car> allCars(){
		return  repositoryCar.findAll();
	}
	@PostMapping
	public Car create(){
		AutrInformations autreInformations =new AutrInformations("red", "red", "typePeinture", 12, 4, 2, "evaluateur");
		/*Moteur moteur=new Moteur();
		Prix prix=new Prix();*/
		AttelageRemorque attelageRemorque=new AttelageRemorque("nameFr", "nameAlg", "nameEN");
		Car c=new Car("fabricant", "model", "variante", "conception", "ailette", "inscription", "marque", "materiauInterieur", "airbags", "kilometre", "puissance", "capacite", "carburant", "transmission", "cO2", "couleurExterieure", "couleurIntErieure", "typePeinture",12, 3, 3, "evaluateur", "prixReserve", "imposition", "prixVente", "acheteurs", "prixAchat", "vendeur", "coutsSupplementaires", "ramasse");
		c.setAttelageRemorque(attelageRemorque);
		//c.set
	return 	repositoryCar.save(c);	
	}

}
