package com.hdm.gestionCars.model;

import javax.persistence.Embeddable;

@Embeddable
public class Prix {
	private String PrixReserve;
	private String  Imposition	;
	private String  PrixVente;	
	private String  Acheteurs	;
	private String  prixAchat;	
	private String  Vendeur	;
	private String  CoutsSupplementaires;
	private String  Ramasse;
	
	
	public Prix(String prixReserve, String imposition, String prixVente, String acheteurs, String prixAchat,
			String vendeur, String coutsSupplementaires, String ramasse) {
		super();
		PrixReserve = prixReserve;
		Imposition = imposition;
		PrixVente = prixVente;
		Acheteurs = acheteurs;
		this.prixAchat = prixAchat;
		Vendeur = vendeur;
		CoutsSupplementaires = coutsSupplementaires;
		Ramasse = ramasse;
	}
	public String getPrixReserve() {
		return PrixReserve;
	}
	public void setPrixReserve(String prixReserve) {
		PrixReserve = prixReserve;
	}
	public String getImposition() {
		return Imposition;
	}
	public void setImposition(String imposition) {
		Imposition = imposition;
	}
	public String getPrixVente() {
		return PrixVente;
	}
	public void setPrixVente(String prixVente) {
		PrixVente = prixVente;
	}
	public String getAcheteurs() {
		return Acheteurs;
	}
	public void setAcheteurs(String acheteurs) {
		Acheteurs = acheteurs;
	}
	public String getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(String prixAchat) {
		this.prixAchat = prixAchat;
	}
	public String getVendeur() {
		return Vendeur;
	}
	public void setVendeur(String vendeur) {
		Vendeur = vendeur;
	}
	public String getCoutsSupplementaires() {
		return CoutsSupplementaires;
	}
	public void setCoutsSupplementaires(String coutsSupplementaires) {
		CoutsSupplementaires = coutsSupplementaires;
	}
	public String getRamasse() {
		return Ramasse;
	}
	public void setRamasse(String ramasse) {
		Ramasse = ramasse;
	}
	
	

}
