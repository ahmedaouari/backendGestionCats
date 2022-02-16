package com.hdm.gestionCars.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;
    private  boolean statut ;
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "activity_key", nullable = true)
	private Activity activity;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "favorite_key", nullable = true)
	private Favorite favorite;

	@ManyToOne
	@JoinColumn(name = "fabricant")
	private Fabricant fabricant;

	@ManyToOne
	@JoinColumn(name = "couleurExterieur")
	private CouleurExterieur couleurExterieur;

	@ManyToOne
	@JoinColumn(name = "couleurInterieur")
	private CouleurInterieur couleurInterieur;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carAttelageRemorque", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "AttelageRemorque") })
	private Set<AttelageRemorque> attelageRemorques = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carAideStationnements", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "aideStationnements") })
	private Set<AideStationnement> AideStationnements = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carRegulateurVitesse", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "regulateurVitesse") })
	private Set<RegulateurVitesse> regulateurVitesse = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carAutresEquipements", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "autresEquipements") })
	private Set<AutresEquipement> autresEquipements = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carMateriauInterieur", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "materiauInterieur") })
	private Set<MateriauInterieur> materiauInterieur = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carAutres", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "autres") })
	private Set<Autre> autres = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carClimatisations", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "climatisations") })
	private Set<Climatisation> Climatisations = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carAutresAmenagementsInterieurs", joinColumns = {
			@JoinColumn(name = "car") }, inverseJoinColumns = { @JoinColumn(name = "autresAmenagementsInterieurs") })
	private Set<AutresAmenagementsInt> autresAmenagementsInterieurs = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "carPienceJointes", joinColumns = { @JoinColumn(name = "car") }, inverseJoinColumns = {
			@JoinColumn(name = "pienceJointes") })
	private Set<PienceJointe> pienceJointes = new HashSet<>();

	
	
	@OneToMany(mappedBy = "car" ,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JsonIgnoreProperties("car")
    private Set<DocumentRef> documents=new HashSet<>();

	public Car() {
	}
      
	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
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
		
	}

	public Car(Integer carId, String model, String variante, String conception, String ailette, String inscription,
			String marque, String kilometre, String puissance, String capacite, String carburant, String transmission,
			String cO2, String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur,
			String prixReserve, String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse, Fabricant fabricant, CouleurExterieur couleurExterieur,
			CouleurInterieur couleurInterieur, Set<AttelageRemorque> attelageRemorques,
			Set<AideStationnement> aideStationnements, Set<RegulateurVitesse> regulateurVitesse,
			Set<AutresEquipement> autresEquipements, Set<MateriauInterieur> materiauIntérieur, Set<Autre> autres,
			Set<Climatisation> climatisations, Set<AutresAmenagementsInt> autresAmenagementsInterieurs,
			Set<PienceJointe> pienceJointes, Set<DocumentRef> documents) {
		super();
		this.carId = carId;
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
		this.attelageRemorques = attelageRemorques;
		AideStationnements = aideStationnements;
		this.regulateurVitesse = regulateurVitesse;
		this.autresEquipements = autresEquipements;
		this.materiauInterieur = materiauIntérieur;
		this.autres = autres;
		Climatisations = climatisations;
		this.autresAmenagementsInterieurs = autresAmenagementsInterieurs;
		this.pienceJointes = pienceJointes;
       this.documents=documents;
	}

	public Car(String model, String variante, String conception, String ailette, String inscription, String marque,
			String kilometre, String puissance, String capacite, String carburant, String transmission, String cO2,
			String typePeinture, int nbrPortes, int nbrplaces, int nbrCles, String evaluateur, String prixReserve,
			String imposition, String prixVente, String acheteurs, String prixAchat, String vendeur,
			String coutsSupplementaires, String ramasse, Fabricant fabricant, CouleurExterieur couleurExterieur,
			CouleurInterieur couleurInterieur, Set<AttelageRemorque> attelageRemorques,
			Set<AideStationnement> aideStationnements, Set<RegulateurVitesse> regulateurVitesse,
			Set<AutresEquipement> autresEquipements, Set<MateriauInterieur> materiauIntérieur, Set<Autre> autres,
			Set<Climatisation> climatisations, Set<AutresAmenagementsInt> autresAmenagementsInterieurs,
			Set<PienceJointe> pienceJointes) {
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
		this.attelageRemorques = attelageRemorques;
		AideStationnements = aideStationnements;
		this.regulateurVitesse = regulateurVitesse;
		this.autresEquipements = autresEquipements;
		this.materiauInterieur = materiauIntérieur;
		this.autres = autres;
		Climatisations = climatisations;
		this.autresAmenagementsInterieurs = autresAmenagementsInterieurs;
		this.pienceJointes = pienceJointes;
		this.statut=true;
	}

	

	public Car(String model2, String variante2, String conception2, String ailette2, String inscription2,
			String marque2, String kilometre2, String puissance2, String capacite2, String carburant2,
			String transmission2, String getcO2, String typePeinture2, int nbrPortes2, int nbrplaces2, int nbrCles2,
			String evaluateur2, String prixReserve2, String imposition2, String prixVente2, String acheteurs2,
			String prixAchat2, String vendeur2, String coutsSupplementaires2, String ramasse2, Fabricant fabricant2,
			CouleurExterieur couleurExterieur2, CouleurInterieur couleurInterieur2,
			Set<AideStationnement> aideStationnements2, Set<AttelageRemorque> attelageRemorques2,
			Set<AideStationnement> aideStationnements3, Set<RegulateurVitesse> regulateurVitesse2,
			Set<AutresEquipement> autresEquipements2, Set<MateriauInterieur> materiauIntérieur, Set<Autre> autres2,
			Set<Climatisation> climatisations2, Set<AutresAmenagementsInt> autresAmenagementsInterieurs2,
			Set<PienceJointe> pienceJointes2) {
		this.model = model2;
		this.variante = variante2;
		this.conception = conception2;
		this.ailette = ailette2;
		this.inscription = inscription2;
		this.marque = marque2;
		this.kilometre = kilometre2;
		this.puissance = puissance2;
		this.capacite = capacite2;
		this.carburant = carburant2;
		this.transmission = transmission2;
		this.cO2 = cO2;
		this.typePeinture = typePeinture2;
		this.nbrPortes = nbrPortes2;
		this.nbrplaces = nbrplaces2;
		this.nbrCles = nbrCles2;
		this.evaluateur = evaluateur2;
		this.prixReserve = prixReserve2;
		this.imposition = imposition2;
		this.prixVente = prixVente2;
		this.acheteurs = acheteurs2;
		this.prixAchat = prixAchat2;
		this.vendeur = vendeur2;
		this.coutsSupplementaires = coutsSupplementaires2;
		this.ramasse = ramasse2;
		this.fabricant = fabricant2;
		this.couleurExterieur = couleurExterieur2;
		this.couleurInterieur = couleurInterieur2;
		this.attelageRemorques = attelageRemorques2;
		AideStationnements = aideStationnements2;
		this.regulateurVitesse = regulateurVitesse2;
		this.autresEquipements = autresEquipements2;
		this.materiauInterieur = materiauIntérieur;
		this.autres = autres2;
		Climatisations = climatisations2;
		this.autresAmenagementsInterieurs = autresAmenagementsInterieurs2;
		this.pienceJointes = pienceJointes2;
		this.statut=true;
		
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

	
	
	

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Favorite getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public Set<MateriauInterieur> getMateriauInterieur() {
		return materiauInterieur;
	}

	public void setMateriauInterieur(Set<MateriauInterieur> materiauInterieur) {
		this.materiauInterieur = materiauInterieur;
	}

	public Set<DocumentRef> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<DocumentRef> documents) {
		this.documents = documents;
	//&	this.documents = documents;
       for(DocumentRef d: documents){
            d.setCar(this);
        }
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
