package com.hdm.gestionCars.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Vente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer VenteId;
	private String label;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "VenteCar", joinColumns = { @JoinColumn(name = "vente") }, inverseJoinColumns = {
			@JoinColumn(name = "car") })
	private Set<Car> cars = new HashSet<>();
	
	
	public Integer getVenteId() {
		return VenteId;
	}


	public void setVenteId(Integer venteId) {
		VenteId = venteId;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public Set<Car> getCars() {
		return cars;
	}


	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}


	public Vente() {
		// TODO Auto-generated constructor stub
	}

}
