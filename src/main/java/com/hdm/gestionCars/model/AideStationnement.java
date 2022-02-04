package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AideStationnement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nameFr;
private String nameAlg;
private String nameEN;



public AideStationnement(String nameFr, String nameAlg, String nameEN) {
	super();
	this.nameFr = nameFr;
	this.nameAlg = nameAlg;
	this.nameEN = nameEN;
}

public AideStationnement(long id, String nameFr, String nameAlg, String nameEN) {
	super();
	this.id = id;
	this.nameFr = nameFr;
	this.nameAlg = nameAlg;
	this.nameEN = nameEN;
}


public AideStationnement() {
	super();
}


public long getIdAideStationnement() {
	return id;
}
public void setIdAideStationnement(long idAideStationnement) {
	this.id = idAideStationnement;
}
public String getNameFr() {
	return nameFr;
}
public void setNameFr(String nameFr) {
	this.nameFr = nameFr;
}
public String getNameAlg() {
	return nameAlg;
}
public void setNameAlg(String nameAlg) {
	this.nameAlg = nameAlg;
}
public String getNameEN() {
	return nameEN;
}
public void setNameEN(String nameEN) {
	this.nameEN = nameEN;
}


}
