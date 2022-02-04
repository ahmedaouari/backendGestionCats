package com.hdm.gestionCars.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DocumentRef {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Date dateEntre;
	private Date dateSortie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateEntre() {
		return dateEntre;
	}
	public void setDateEntre(Date dateEntre) {
		this.dateEntre = dateEntre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public DocumentRef(long id, Date dateEntre, Date dateSortie) {
		super();
		this.id = id;
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
	}
	public DocumentRef() {
		super();
	}
	
	
	
	

}
