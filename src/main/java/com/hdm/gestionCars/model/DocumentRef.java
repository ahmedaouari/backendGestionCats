package com.hdm.gestionCars.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DocumentRef {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = true)
	private String dateEntre;

	@Column(nullable = true)
	private String dateSortie;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "doucument")
	private Document doucument;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "car")
	private Car car;

	public Document getDoucument() {
		return doucument;
	}

	public void setDoucument(Document doucument) {
		this.doucument = doucument;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDateEntre() {
		return dateEntre;
	}

	public void setDateEntre(String dateEntre) {
		this.dateEntre = dateEntre;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}

	public DocumentRef(long id, String dateEntre, String dateSortie) {
		super();
		this.id = id;
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
	}

	public DocumentRef() {
		super();
	}

	public DocumentRef(String dateEntre, String dateSortie, Document doucument) {
		super();
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
		this.doucument = doucument;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
