package com.hdm.gestionCars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AttelageRemorque {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, insertable = false)
	private long id;
	
	private String nameFr;
	private String nameAlg;
	private String nameEN;

	
	
	
	public AttelageRemorque() {
		super();
	}

	public AttelageRemorque(String nameFr, String nameAlg, String nameEN) {
		super();
		this.nameFr = nameFr;
		this.nameAlg = nameAlg;
		this.nameEN = nameEN;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
