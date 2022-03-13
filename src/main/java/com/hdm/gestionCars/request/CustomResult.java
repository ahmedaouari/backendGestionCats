package com.hdm.gestionCars.request;

import java.util.List;

import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.Car;

public class CustomResult {

	private Car car;
	private List<Activity> activities;

	public CustomResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

}
