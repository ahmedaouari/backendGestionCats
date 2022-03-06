package com.hdm.gestionCars.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.hdm.gestionCars.model.Car;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long activityId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "entreprise_key")
	@JsonBackReference
	private Entreprise entreprise;

	@Enumerated
	private Activity_Type status;

	private Double price;

	private Date activityDate;

	@ManyToOne()
	private Car car;

	public Activity() {
		super();
	}

	public Activity(Long activityId, Entreprise entreprise,Car cars) {
		super();
		this.activityId = activityId;
		this.entreprise = entreprise;
		this.car= cars;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public void setCars(Car cars) {
		this.car = cars;
	}

	public Car getCars() {
		return car;
	}

	public Activity_Type getStatus() {
		return status;
	}

	public void setStatus(Activity_Type status) {
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

}
