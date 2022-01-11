package com.hdm.gestionCars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryEntreprise;
import com.hdm.gestionCars.model.Entreprise;

@Service
public class ServiceEntreprise {

	@Autowired
	private RepositoryEntreprise entrepriseRepositoryEntreprise;

	public Entreprise createNewEntreprise(Entreprise entreprise) {
		return entrepriseRepositoryEntreprise.save(entreprise);
	}

	public Entreprise getEntrepriseBasedOnTheId(Long entrepriseId) {
		return entrepriseRepositoryEntreprise.findByEntrepriseId(entrepriseId);
	}

	public List<Entreprise> listOfAllEntreprises() {
		return entrepriseRepositoryEntreprise.findAll();
	}

}
