package com.hdm.gestionCars.request;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.AideStationnement;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.Autre;
import com.hdm.gestionCars.model.AutresAmenagementsInt;
import com.hdm.gestionCars.model.AutresEquipement;
import com.hdm.gestionCars.model.Climatisation;
import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Document;
import com.hdm.gestionCars.model.DocumentRef;
import com.hdm.gestionCars.model.Fabricant;
import com.hdm.gestionCars.model.Favorite;
import com.hdm.gestionCars.model.MateriauInterieur;
import com.hdm.gestionCars.model.PienceJointe;
import com.hdm.gestionCars.model.RegulateurVitesse;

public class requestCar {
	private Integer carId;

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


	private Activity activity;


	private Favorite favorite;

	private Fabricant fabricant;

	
	private CouleurExterieur couleurExterieur;

	private CouleurInterieur couleurInterieur;

	private Set<AttelageRemorque> attelageRemorques = new HashSet<>();

	private Set<AideStationnement> AideStationnements = new HashSet<>();

	
	private Set<RegulateurVitesse> regulateurVitesse = new HashSet<>();


	private Set<AutresEquipement> autresEquipements = new HashSet<>();

	
	private Set<MateriauInterieur> materiauInterieur = new HashSet<>();

	
	private Set<Autre> autres = new HashSet<>();

	private Set<Climatisation> Climatisations = new HashSet<>();

	private Set<AutresAmenagementsInt> autresAmenagementsInterieurs = new HashSet<>();

	private Set<PienceJointe> pienceJointes = new HashSet<>();
	private Set<Document> documents = new HashSet<>();

	


	public requestCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
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

	public Set<AttelageRemorque> getAttelageRemorques() {
		return attelageRemorques;
	}

	public void setAttelageRemorques(Set<AttelageRemorque> attelageRemorques) {
		this.attelageRemorques = attelageRemorques;
	}

	public Set<AideStationnement> getAideStationnements() {
		return AideStationnements;
	}

	public void setAideStationnements(Set<AideStationnement> aideStationnements) {
		AideStationnements = aideStationnements;
	}

	public Set<RegulateurVitesse> getRegulateurVitesse() {
		return regulateurVitesse;
	}

	public void setRegulateurVitesse(Set<RegulateurVitesse> regulateurVitesse) {
		this.regulateurVitesse = regulateurVitesse;
	}

	public Set<AutresEquipement> getAutresEquipements() {
		return autresEquipements;
	}

	public void setAutresEquipements(Set<AutresEquipement> autresEquipements) {
		this.autresEquipements = autresEquipements;
	}

	public Set<MateriauInterieur> getMateriauIntérieur() {
		return materiauInterieur;
	}

	public void setMateriauIntérieur(Set<MateriauInterieur> materiauInterieur) {
		this.materiauInterieur = materiauInterieur;
	}

	public Set<Autre> getAutres() {
		return autres;
	}

	public void setAutres(Set<Autre> autres) {
		this.autres = autres;
	}

	public Set<Climatisation> getClimatisations() {
		return Climatisations;
	}

	public void setClimatisations(Set<Climatisation> climatisations) {
		Climatisations = climatisations;
	}

	public Set<AutresAmenagementsInt> getAutresAmenagementsInterieurs() {
		return autresAmenagementsInterieurs;
	}

	public void setAutresAmenagementsInterieurs(Set<AutresAmenagementsInt> autresAmenagementsInterieurs) {
		this.autresAmenagementsInterieurs = autresAmenagementsInterieurs;
	}

	public Set<PienceJointe> getPienceJointes() {
		return pienceJointes;
	}

	public void setPienceJointes(Set<PienceJointe> pienceJointes) {
		this.pienceJointes = pienceJointes;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", variante=" + variante + ", conception=" + conception
				+ ", ailette=" + ailette + ", inscription=" + inscription + ", marque=" + marque + ", kilometre="
				+ kilometre + ", puissance=" + puissance + ", capacite=" + capacite + ", carburant=" + carburant
				+ ", transmission=" + transmission + ", cO2=" + cO2 + ", typePeinture=" + typePeinture + ", nbrPortes="
				+ nbrPortes + ", nbrplaces=" + nbrplaces + ", nbrCles=" + nbrCles + ", evaluateur=" + evaluateur
				+ ", prixReserve=" + prixReserve + ", imposition=" + imposition + ", prixVente=" + prixVente
				+ ", acheteurs=" + acheteurs + ", prixAchat=" + prixAchat + ", vendeur=" + vendeur
				+ ", coutsSupplementaires=" + coutsSupplementaires + ", ramasse=" + ramasse + ", fabricant=" + fabricant
				+ ", couleurExterieur=" + couleurExterieur + ", couleurInterieur=" + couleurInterieur
				+ ", attelageRemorques=" + attelageRemorques + ", AideStationnements=" + AideStationnements
				+ ", regulateurVitesse=" + regulateurVitesse + ", autresEquipements=" + autresEquipements
				+ ", materiauIntérieur=" + materiauInterieur + ", autres=" + autres + ", Climatisations="
				+ Climatisations + ", autresAmenagementsInterieurs=" + autresAmenagementsInterieurs + ", pienceJointes="
				+ pienceJointes + ", documents=" + documents + "]";
	}

}
