package com.hdm.gestionCars.request;

import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Fabricant;

public class CarRequest {

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
	private String puissance;
	private String capacite;
	private String carburant;
	private String transmission;
	private String cO2;

	private String typePeinture;
	private int nbrPortes;
	private int nbrplaces;
	private int nbrCles;
	private String evaluateur;

	private String prixReserve;
	private String imposition;
	private String prixVente;
	private String acheteurs;
	private String prixAchat;
	private String vendeur;
	private String coutsSupplementaires;
	private String ramasse;

	private Fabricant fabricant;

	private CouleurExterieur couleurExterieur;

	private CouleurInterieur couleurInterieur;

	public CarRequest() {
	}

	public CarRequest(int id, String model, String variante, String conception, String ailette, String inscription,
			String marque, String kilometre, String puissance, String capacite, String carburant, String transmission,
			String cO2, String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur,
			String prixReserve, String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse, Fabricant fabricant, CouleurExterieur couleurExterieur,
			CouleurInterieur couleurInterieur) {
		super();
		this.id = id;
		this.model = model;
		this.variante = variante;
		this.conception = conception;
		this.ailette = ailette;
		this.inscription = inscription;
		this.marque = marque;
		this.kilometre = kilometre;
		this.puissance = puissance;
		this.capacite = capacite;
		this.carburant = carburant;
		this.transmission = transmission;
		this.cO2 = cO2;
		this.typePeinture = typePeinture;
		this.nbrPortes = nbrPortes;
		this.nbrplaces = nbrplaces;
		this.nbrCles = nbrCles;
		this.evaluateur = evaluateur;
		this.prixReserve = prixReserve;
		this.imposition = imposition;
		this.prixVente = prixVente;
		this.acheteurs = acheteurs;
		this.prixAchat = prixAchat;
		this.vendeur = vendeur;
		this.coutsSupplementaires = coutsSupplementaires;
		this.ramasse = ramasse;
		this.fabricant = fabricant;
		this.couleurExterieur = couleurExterieur;
		this.couleurInterieur = couleurInterieur;
	}

	public CarRequest(String model, String variante, String conception, String ailette, String inscription,
			String marque, String kilometre, String puissance, String capacite, String carburant, String transmission,
			String cO2, String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur,
			String prixReserve, String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse, Fabricant fabricant, CouleurExterieur couleurExterieur,
			CouleurInterieur couleurInterieur) {
		super();
		this.model = model;
		this.variante = variante;
		this.conception = conception;
		this.ailette = ailette;
		this.inscription = inscription;
		this.marque = marque;
		this.kilometre = kilometre;
		this.puissance = puissance;
		this.capacite = capacite;
		this.carburant = carburant;
		this.transmission = transmission;
		this.cO2 = cO2;
		this.typePeinture = typePeinture;
		this.nbrPortes = nbrPortes;
		this.nbrplaces = nbrplaces;
		this.nbrCles = nbrCles;
		this.evaluateur = evaluateur;
		this.prixReserve = prixReserve;
		this.imposition = imposition;
		this.prixVente = prixVente;
		this.acheteurs = acheteurs;
		this.prixAchat = prixAchat;
		this.vendeur = vendeur;
		this.coutsSupplementaires = coutsSupplementaires;
		this.ramasse = ramasse;
		this.fabricant = fabricant;
		this.couleurExterieur = couleurExterieur;
		this.couleurInterieur = couleurInterieur;
	}
	
	

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
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
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

	public String getcO2() {
		return cO2;
	}

	public void setcO2(String cO2) {
		this.cO2 = cO2;
	}

	public String getTypePeinture() {
		return typePeinture;
	}

	public void setTypePeinture(String typePeinture) {
		this.typePeinture = typePeinture;
	}

	public int getNbrPortes() {
		return nbrPortes;
	}

	public void setNbrPortes(int nbrPortes) {
		this.nbrPortes = nbrPortes;
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
		return prixReserve;
	}

	public void setPrixReserve(String prixReserve) {
		this.prixReserve = prixReserve;
	}

	public String getImposition() {
		return imposition;
	}

	public void setImposition(String imposition) {
		this.imposition = imposition;
	}

	public String getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(String prixVente) {
		this.prixVente = prixVente;
	}

	public String getAcheteurs() {
		return acheteurs;
	}

	public void setAcheteurs(String acheteurs) {
		this.acheteurs = acheteurs;
	}

	public String getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(String prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getVendeur() {
		return vendeur;
	}

	public void setVendeur(String vendeur) {
		this.vendeur = vendeur;
	}

	public String getCoutsSupplementaires() {
		return coutsSupplementaires;
	}

	public void setCoutsSupplementaires(String coutsSupplementaires) {
		this.coutsSupplementaires = coutsSupplementaires;
	}

	public String getRamasse() {
		return ramasse;
	}

	public void setRamasse(String ramasse) {
		this.ramasse = ramasse;
	}

	public Fabricant getFabricant() {
		return fabricant;
	}

	public void setFabricant(Fabricant fabricant) {
		this.fabricant = fabricant;
	}

	public CouleurExterieur getCouleurExterieur() {
		return couleurExterieur;
	}

	public void setCouleurExterieur(CouleurExterieur couleurExterieur) {
		this.couleurExterieur = couleurExterieur;
	}

	public CouleurInterieur getCouleurInterieur() {
		return couleurInterieur;
	}

	public void setCouleurInterieur(CouleurInterieur couleurInterieur) {
		this.couleurInterieur = couleurInterieur;
	}

}
