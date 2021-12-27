package com.hdm.gestionCars.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Fabricant;
	private String model;
	private String variante;
	private String conception;
	private String ailette;
	private String inscription;
	private String marque;
	// interieur 
	
   private String MateriauInterieur;
	private String Airbags;
	// moteur 
	private String kilometre;
	private String Puissance;
	private String Capacite;
	private String carburant;
	private String transmission;
	private String CO2;
	
	
	private String CouleurExterieure;
	private String CouleurIntErieure;
	private String TypePeinture;
	private int NbrPortes;
	private int nbrplaces;
	private int nbrCles;
	private String evaluateur;

	private String PrixReserve;
	private String  Imposition	;
	private String  PrixVente;	
	private String  Acheteurs	;
	private String  prixAchat;	
	private String  Vendeur	;
	private String  CoutsSupplementaires;
	private String  Ramasse;
@OneToOne
@JoinColumn(name = "AttelageRemorque")
private AttelageRemorque  attelageRemorque;




public int getIdCar() {
	return id;
}

public void setIdCar(int idCar) {
	this.id = idCar;
}

public String getFabricant() {
	return Fabricant;
}

public void setFabricant(String fabricant) {
	Fabricant = fabricant;
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

public String getMateriauInterieur() {
	return MateriauInterieur;
}

public void setMateriauInterieur(String materiauInterieur) {
	MateriauInterieur = materiauInterieur;
}

public String getAirbags() {
	return Airbags;
}

public void setAirbags(String airbags) {
	Airbags = airbags;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public AttelageRemorque getAttelageRemorque() {
	return attelageRemorque;
}

public void setAttelageRemorque(AttelageRemorque attelageRemorque) {
	this.attelageRemorque = attelageRemorque;
}

public Car(String fabricant, String model, String variante, String conception, String ailette, String inscription,
		String marque, String materiauInterieur, String airbags, String kilometre, String puissance, String capacite,
		String carburant, String transmission, String cO2, String couleurExterieure, String couleurIntErieure,
		String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur, String prixReserve,
		String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
		String coutsSupplementaires, String ramasse) {
	super();
	Fabricant = fabricant;
	this.model = model;
	this.variante = variante;
	this.conception = conception;
	this.ailette = ailette;
	this.inscription = inscription;
	this.marque = marque;
	MateriauInterieur = materiauInterieur;
	Airbags = airbags;
	this.kilometre = kilometre;
	Puissance = puissance;
	Capacite = capacite;
	this.carburant = carburant;
	this.transmission = transmission;
	CO2 = cO2;
	CouleurExterieure = couleurExterieure;
	CouleurIntErieure = couleurIntErieure;
	TypePeinture = typePeinture;
	NbrPortes = nbrPortes;
	this.nbrplaces = nbrplaces;
	this.nbrCles = nbrCles;
	this.evaluateur = evaluateur;
	PrixReserve = prixReserve;
	Imposition = imposition;
	PrixVente = prixVente;
	Acheteurs = acheteurs;
	this.prixAchat = prixAchat;
	Vendeur = vendeur;
	CoutsSupplementaires = coutsSupplementaires;
	Ramasse = ramasse;
}















	
	

}
