package com.hdm.gestionCars.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fabricant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fabricantID;

	private String nameFr;
	private String nameAlm;
	private String nameEn;

	@OneToOne(mappedBy = "fabricant", cascade = { CascadeType.ALL })
	private Car car;

	public Fabricant() {
	}

	public Fabricant(Long fabricantID, String nameFr, String nameAlm, String nameEn, Car car) {
		this.fabricantID = fabricantID;
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
		this.car = car;
	}

	public Fabricant(String nameFr, String nameAlm, String nameEn) {
		super();
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
	}

	public Long getFabricantID() {
		return fabricantID;
	}

	public void setFabricantID(Long fabricantID) {
		this.fabricantID = fabricantID;
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
		return "Fabricant [fabricantID=" + fabricantID + ", nameFr=" + nameFr + ", nameAlm=" + nameAlm + ", nameEn="
				+ nameEn + ", car=" + car + "]";
	}

}
