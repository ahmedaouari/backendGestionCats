package com.hdm.gestionCars.request;

import java.util.HashSet;
import java.util.Set;

import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Entreprise;

public class ActivityRequest {

	private Entreprise entreprise;

	private Set<Car> cars = new HashSet<Car>();

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

}
