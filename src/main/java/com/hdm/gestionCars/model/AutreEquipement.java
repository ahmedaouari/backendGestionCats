package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AutreEquipement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nameFr;
	private String nameAlg;
	private String nameEN;
	
	
	
	 public AutreEquipement(String nameFr, String nameAlg, String nameEN) {
		super();
		this.nameFr = nameFr;
		this.nameAlg = nameAlg;
		this.nameEN = nameEN;
	}
	@ManyToOne
	  @JoinColumn(name = "car")
	    private Car car;
	 
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public long getIdAutreEquipement() {
		return id;
	}
	public void setIdAutreEquipement(long idAutreEquipement) {
		this.id = idAutreEquipement;
	}
	public String getNameFr() {
		return nameFr;
	}
	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}
	public String getNameAlg() {
		return nameAlg;
	}
	public void setNameAlg(String nameAlg) {
		this.nameAlg = nameAlg;
	}
	public String getNameEN() {
		return nameEN;
	}
	public void setNameEN(String nameEN) {
		this.nameEN = nameEN;
	}
	
	

}
