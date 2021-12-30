package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CouleurExterieur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nameFr;
	private String nameAlm;
	private String nameEn;

	@ManyToOne
	@JoinColumn(name = "car")
	private Car car;

	public CouleurExterieur() {
	}

	public CouleurExterieur(Long id, String nameFr, String nameAlm, String nameEn, Car car) {
		this.id = id;
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
		this.car = car;
	}

	public CouleurExterieur(String nameFr, String nameAlm, String nameEn) {
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

	@Override
	public String toString() {
		return "CouleurExterieur [id=" + id + ", nameFr=" + nameFr + ", nameAlm=" + nameAlm + ", nameEn=" + nameEn
				+ ", car=" + car + "]";
	}

}
