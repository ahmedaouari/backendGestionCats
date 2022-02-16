package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.DAO.RepositoryVente;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Vente;

@CrossOrigin
@RestController
@RequestMapping(path = { "/api" })
public class VenteController {

	@Autowired
	RepositoryVente repositoryVente;
	
	
	@GetMapping(value = "/listvente")
	public List<Vente> allCars() {
		return repositoryVente.findAll();
	}
	@PostMapping(value = "/newVente")
	public ResponseEntity<Object>  createVente(@RequestBody Vente v) { 
		
		try{
			repositoryVente.save(v);
	            return new ResponseEntity<>(v, HttpStatus.OK);
	        } catch (DataAccessException e) {
	            System.out.println("Exception in new car controller : "+e);
	            return new ResponseEntity<>(e,HttpStatus.NOT_ACCEPTABLE);
	        }
		
	}
	

}
