package com.hdm.gestionCars.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nameFr;
	private String nameAln;
	private String nameNeg;
	
	
	
	public Document() {
		super();
	}
	public Document(String nameFr, String nameAln, String nameNeg) {
		super();
		this.nameFr = nameFr;
		this.nameAln = nameAln;
		this.nameNeg = nameNeg;
	}
	public String getNameFr() {
		return nameFr;
	}
	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}
	public String getNameAln() {
		return nameAln;
	}
	public void setNameAln(String nameAln) {
		this.nameAln = nameAln;
	}
	public String getNameNeg() {
		return nameNeg;
	}
	public void setNameNeg(String nameNeg) {
		this.nameNeg = nameNeg;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	
	
	

}
