package com.hdm.gestionCars.model;

import javax.persistence.Embeddable;

@Embeddable
public class Moteur {

	private String kilometre;
	private String Puissance;
	private String Capacite;
	private String carburant;
	private String transmission;
	private String CO2;
}
