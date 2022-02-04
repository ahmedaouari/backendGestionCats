package com.hdm.gestionCars.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CouleurInterieur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2461146127163337337L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long interiorId;

	private String nameFr;
	private String nameAlm;
	private String nameEn;

	@OneToOne(mappedBy = "couleurInterieur", cascade = { CascadeType.ALL })
	@JsonIgnore
	private Car car;

	public CouleurInterieur() {
	}

	public CouleurInterieur(Long id, String nameFr, String nameAlm, String nameEn, Car car) {
		this.interiorId = id;
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
		this.car = car;
	}

	public CouleurInterieur(String nameFr, String nameAlm, String nameEn) {
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
	}

	public Long getId() {
		return interiorId;
	}

	public void setId(Long id) {
		this.interiorId = id;
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
		return "CouleurInterieur [id=" + interiorId + ", nameFr=" + nameFr + ", nameAlm=" + nameAlm + ", nameEn="
				+ nameEn + ", car=" + car + "]";
	}

}
