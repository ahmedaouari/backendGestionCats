package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long entrepriseId;

	private String name;

	public Entreprise(Long entrepriseId, String name) {
		super();
		this.entrepriseId = entrepriseId;
		this.name = name;
	}

	public Entreprise() {
	}

	public Long getEntrepriseId() {
		return entrepriseId;
	}

	public void setEntrepriseId(Long entrepriseId) {
		this.entrepriseId = entrepriseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
