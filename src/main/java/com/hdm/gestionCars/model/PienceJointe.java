package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class PienceJointe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String path;
	private String type;
	 @ManyToOne
	  @JoinColumn(name = "car")
	    private Car car;
	 
	public PienceJointe(String name, String path, String type) {
		super();
		this.name = name;
		this.path = path;
		this.type = type;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public long getIdPienceJointe() {
		return id;
	}
	public void setIdPienceJointe(long idPienceJointe) {
		this.id = idPienceJointe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
