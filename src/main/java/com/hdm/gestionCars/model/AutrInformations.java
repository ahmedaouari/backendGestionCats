package com.hdm.gestionCars.model;

import javax.persistence.Embeddable;

@Embeddable
public class AutrInformations {
	
	private String CouleurExterieure;
	private String CouleurIntErieure;
	private String TypePeinture;
	private int NbrPortes;
	private int nbrplaces;
	private int nbrCles;
	private String evaluateur;
	
	
	public AutrInformations(String couleurExterieure, String couleurIntErieure, String typePeinture, int nbrPortes,
			int nbrplaces, int nbrCles, String evaluateur) {
		super();
		CouleurExterieure = couleurExterieure;
		CouleurIntErieure = couleurIntErieure;
		TypePeinture = typePeinture;
		NbrPortes = nbrPortes;
		this.nbrplaces = nbrplaces;
		this.nbrCles = nbrCles;
		this.evaluateur = evaluateur;
	}
	public String getCouleurExterieure() {
		return CouleurExterieure;
	}
	public void setCouleurExterieure(String couleurExterieure) {
		CouleurExterieure = couleurExterieure;
	}
	public String getCouleurIntErieure() {
		return CouleurIntErieure;
	}
	public void setCouleurIntErieure(String couleurIntErieure) {
		CouleurIntErieure = couleurIntErieure;
	}
	public String getTypePeinture() {
		return TypePeinture;
	}
	public void setTypePeinture(String typePeinture) {
		TypePeinture = typePeinture;
	}
	public int getNbrPortes() {
		return NbrPortes;
	}
	public void setNbrPortes(int nbrPortes) {
		NbrPortes = nbrPortes;
	}
	public int getNbrplaces() {
		return nbrplaces;
	}
	public void setNbrplaces(int nbrplaces) {
		this.nbrplaces = nbrplaces;
	}
	public int getNbrCles() {
		return nbrCles;
	}
	public void setNbrCles(int nbrCles) {
		this.nbrCles = nbrCles;
	}
	public String getEvaluateur() {
		return evaluateur;
	}
	public void setEvaluateur(String evaluateur) {
		this.evaluateur = evaluateur;
	}
	
	

}
