package com.hdm.gestionCars.request;

import com.hdm.gestionCars.model.Car;

public class CarActivityRequest {

	private Car car;
	private Integer entrepriseId;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Integer getEntrepriseId() {
		return entrepriseId;
	}

	public void setEntrepriseId(Integer entrepriseId) {
		this.entrepriseId = entrepriseId;
	}

	public CarActivityRequest() {
		super();
	}

}
