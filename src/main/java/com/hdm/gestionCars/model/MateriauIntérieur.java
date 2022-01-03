package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MateriauIntérieur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nameFr;
	private String nameAlm;
	private String nameEn;

	@ManyToOne
	@JoinColumn(name = "car", nullable = true)
	private Car car;

	public MateriauIntérieur() {
		super();
	}

	public MateriauIntérieur(String nameFr, String nameAlm, String nameEn) {
		super();
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameFr() {
		return nameFr;
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	public String getNameAlm() {
		return nameAlm;
	}

	public void setNameAlm(String nameAlm) {
		this.nameAlm = nameAlm;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	
}
