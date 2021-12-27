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
	
	public Moteur(String kilometre, String puissance, String capacite, String carburant, String transmission,
			String cO2) {
		super();
		this.kilometre = kilometre;
		Puissance = puissance;
		Capacite = capacite;
		this.carburant = carburant;
		this.transmission = transmission;
		CO2 = cO2;
	}
	public String getKilometre() {
		return kilometre;
	}
	public void setKilometre(String kilometre) {
		this.kilometre = kilometre;
	}
	public String getPuissance() {
		return Puissance;
	}
	public void setPuissance(String puissance) {
		Puissance = puissance;
	}
	public String getCapacite() {
		return Capacite;
	}
	public void setCapacite(String capacite) {
		Capacite = capacite;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getCO2() {
		return CO2;
	}
	public void setCO2(String cO2) {
		CO2 = cO2;
	}
	
	
}
