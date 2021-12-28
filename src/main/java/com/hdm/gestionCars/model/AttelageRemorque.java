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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, insertable = false)
	private long id;
	
	private String nameFr;
	private String nameAlg;
	private String nameEN;

	@ManyToOne
	@JoinColumn(name = "car_key", nullable = false)
	private Car car;
	 

	 
	
	
	
}
