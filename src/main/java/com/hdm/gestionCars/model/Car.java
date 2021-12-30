package com.hdm.gestionCars.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@OneToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "fabricant_key", unique = true)
	@JsonIgnore
	private Fabricant fabricant;

	@OneToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "couleurExterieur_key", unique = true)
	@JsonIgnore
	private CouleurExterieur couleurExterieur;

	@OneToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "couleurInterieur_key", unique = true)
	@JsonIgnore
	private CouleurInterieur couleurInterieur;

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<AttelageRemorque> attelageRemorques = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<AideStationnement> AideStationnements = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<RegulateurVitesse> regulateurVitesse = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<AutresEquipement> autresEquipements = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<MateriauIntérieur> materiauIntérieur = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<Autre> autres = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<Climatisation> Climatisations = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<AutresAmenagementsInt> autresAmenagementsInterieurs = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<PienceJointe> pienceJointes = new HashSet<>();

	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private Set<Document> documents = new HashSet<>();

	public Car() {
	}

	public Car(int id, String model, String variante, String conception, String ailette, String inscription,
			String marque, String kilometre, String puissance, String capacite, String carburant, String transmission,
			String cO2, String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur,
			String prixReserve, String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse, Fabricant fabricant,
			com.hdm.gestionCars.model.CouleurExterieur couleurExterieur,
			com.hdm.gestionCars.model.CouleurInterieur couleurInterieur, Set<AttelageRemorque> attelageRemorques,
			Set<AideStationnement> aideStationnements, Set<RegulateurVitesse> regulateurVitesse,
			Set<AutresEquipement> autresEquipements, Set<MateriauIntérieur> materiauIntérieur, Set<Autre> autres,
			Set<Climatisation> climatisations, Set<AutresAmenagementsInt> autresAmenagementsInterieurs,
			Set<PienceJointe> pienceJointes, Set<Document> documents) {
		super();
		this.id = id;
		this.model = model;
		this.variante = variante;
		this.conception = conception;
		this.ailette = ailette;
		this.inscription = inscription;
		this.marque = marque;
		this.kilometre = kilometre;
		Puissance = puissance;
		Capacite = capacite;
		this.carburant = carburant;
		this.transmission = transmission;
		CO2 = cO2;
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
		this.fabricant = fabricant;
		couleurExterieur = couleurExterieur;
		couleurInterieur = couleurInterieur;
		this.attelageRemorques = attelageRemorques;
		AideStationnements = aideStationnements;
		this.regulateurVitesse = regulateurVitesse;
		this.autresEquipements = autresEquipements;
		this.materiauIntérieur = materiauIntérieur;
		this.autres = autres;
		Climatisations = climatisations;
		this.autresAmenagementsInterieurs = autresAmenagementsInterieurs;
		this.pienceJointes = pienceJointes;
		this.documents = documents;
	}

	public Car(String model, String variante, String conception, String ailette, String inscription, String marque,
			String kilometre, String puissance, String capacite, String carburant, String transmission, String cO2,
			String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur, String prixReserve,
			String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse) {
		super();
		this.model = model;
		this.variante = variante;
		this.conception = conception;
		this.ailette = ailette;
		this.inscription = inscription;
		this.marque = marque;
		this.kilometre = kilometre;
		Puissance = puissance;
		Capacite = capacite;
		this.carburant = carburant;
		this.transmission = transmission;
		CO2 = cO2;
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
		return couleurExterieur;
	}

	public void setCouleurExterieur(CouleurExterieur couleurExterieur) {
		couleurExterieur = couleurExterieur;
	}

	public CouleurInterieur getCouleurInterieur() {
		return couleurInterieur;
	}

	public void setCouleurInterieur(CouleurInterieur couleurInterieur) {
		couleurInterieur = couleurInterieur;
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

	public Set<MateriauIntérieur> getMateriauIntérieur() {
		return materiauIntérieur;
	}

	public void setMateriauIntérieur(Set<MateriauIntérieur> materiauIntérieur) {
		this.materiauIntérieur = materiauIntérieur;
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

}
