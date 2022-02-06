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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long activityId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "entreprise_key")
	@JsonIgnore
	private Entreprise entreprise;

	@Enumerated
	private Activity_Type status;

	private Double price;

	private Date activityDate;

	@OneToMany(mappedBy = "activity")
	private Set<Car> cars = new HashSet<Car>();

	public Activity() {
		super();
	}

	public Activity(Long activityId, Entreprise entreprise, Set<Car> cars) {
		super();
		this.activityId = activityId;
		this.entreprise = entreprise;
		this.cars = cars;
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

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
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
