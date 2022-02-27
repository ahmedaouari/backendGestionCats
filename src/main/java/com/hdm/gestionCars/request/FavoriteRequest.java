package com.hdm.gestionCars.request;

import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Entreprise;

public class FavoriteRequest {
	private Entreprise entreprise;

//	private Set<Car> cars = new HashSet<Car>();
	private Car car;

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

//	public Set<Car> getCars() {
//		return cars;
//	}
//
//	public void setCars(Set<Car> cars) {
//		this.cars = cars;
//	}

}
