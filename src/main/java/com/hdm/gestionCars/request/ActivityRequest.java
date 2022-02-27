package com.hdm.gestionCars.request;

import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Entreprise;

public class ActivityRequest {
	private Long activityId;
	private Entreprise entreprise;
//	private Set<Car> cars = new HashSet<Car>();
	private Car car;
	private Double price;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

//	public Set<Car> getCars() {
//		return cars;
//	}
//
//	public void setCars(Set<Car> cars) {
//		this.cars = cars;
//	}

	public Long getActivityId() {
		return activityId;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

}
