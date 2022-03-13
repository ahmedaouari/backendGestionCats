package com.hdm.gestionCars.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long activityId;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "entreprise_key")
//	@JsonBackReference
	private Entreprise entreprise;

	@Enumerated
	private Activity_Type status;

	private Double price;

	private Date activityDate;

//	@OneToMany(mappedBy = "activity")
//	@JsonIgnore
//	private Set<Car> cars = new HashSet<Car>();

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE })
	@JoinColumn(name = "car_key", nullable = true)
	@JsonBackReference(value = "caractivity")
	private Car car;

	public Activity() {
		super();
	}

	public Activity(Long activityId, Entreprise entreprise
//			, Set<Car> cars
	) {
		super();
		this.activityId = activityId;
		this.entreprise = entreprise;
//		this.cars = cars;
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

//	public Set<Car> getCars() {
//		return cars;
//	}
//
//	public void setCars(Set<Car> cars) {
//		this.cars = cars;
//	}

	public Activity_Type getStatus() {
		return status;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
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
