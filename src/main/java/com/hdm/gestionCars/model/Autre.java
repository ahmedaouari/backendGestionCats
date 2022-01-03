package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Autre {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String nameFr;
	    private String nameAlm;
	    private String nameEn;
	    
	    @ManyToOne
		@JoinColumn(name = "car", nullable = true)
		private Car car;

}
