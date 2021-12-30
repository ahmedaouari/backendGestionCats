package com.hdm.gestionCars.response;

import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Fabricant;

public class CarResponse {
	private int id;

	private String model;
	private String variante;
	private String conception;
	private String ailette;
	private String inscription;
	private String marque;
	// interieur
	// moteur
	private String kilometre;
	private String Puissance;
	private String Capacite;
	private String carburant;
	private String transmission;
	private String CO2;

	private String TypePeinture;
	private int NbrPortes;
	private int nbrplaces;
	private int nbrCles;
	private String evaluateur;

	private String PrixReserve;
	private String Imposition;
	private String PrixVente;
	private String Acheteurs;
	private String prixAchat;
	private String Vendeur;
	private String CoutsSupplementaires;
	private String Ramasse;

	private Fabricant fabricant;

	private CouleurExterieur CouleurExterieur;

	private CouleurInterieur CouleurInterieur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

	public String getConception() {
		return conception;
	}

	public void setConception(String conception) {
		this.conception = conception;
	}

	public String getAilette() {
		return ailette;
	}

	public void setAilette(String ailette) {
		this.ailette = ailette;
	}

	public String getInscription() {
		return inscription;
	}

	public void setInscription(String inscription) {
		this.inscription = inscription;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getKilometre() {
		return kilometre;
	}

	public void setKilometre(String kilometre) {
		this.kilometre = kilometre;
	}

	public String getPuissance() {
		return Puissance;
	}

	public void setPuissance(String puissance) {
		Puissance = puissance;
	}

	public String getCapacite() {
		return Capacite;
	}

	public void setCapacite(String capacite) {
		Capacite = capacite;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getCO2() {
		return CO2;
	}

	public void setCO2(String cO2) {
		CO2 = cO2;
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

	public Fabricant getFabricant() {
		return fabricant;
	}

	public void setFabricant(Fabricant fabricant) {
		this.fabricant = fabricant;
	}

	public CouleurExterieur getCouleurExterieur() {
		return CouleurExterieur;
	}

	public void setCouleurExterieur(CouleurExterieur couleurExterieur) {
		CouleurExterieur = couleurExterieur;
	}

	public CouleurInterieur getCouleurInterieur() {
		return CouleurInterieur;
	}

	public void setCouleurInterieur(CouleurInterieur couleurInterieur) {
		CouleurInterieur = couleurInterieur;
	}

}
