package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.service.ServiceEntreprise;

@RestController
@RequestMapping(path = { "/api" })
public class EntrepriseController {

	@Autowired
	private ServiceEntreprise service;

	@GetMapping(value = "/list-entreprises")
	public List<Entreprise> getListEntreprises() {
		return service.listOfAllEntreprises();
	}
	

}
