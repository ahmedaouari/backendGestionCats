package com.hdm.gestionCars.model;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private String  Imposition	;
	private String  PrixVente;	
	private String  Acheteurs	;
	private String  prixAchat;	
	private String  Vendeur	;
	private String  CoutsSupplementaires;
	private String Ramasse;


	

@OneToOne
@JoinColumn(name = "fabricant_key", unique = true)
private  Fabricant fabricant;

@OneToOne
@JoinColumn(name = "CouleurExterieur", unique = true)
private CouleurExterieur CouleurExterieur;

@OneToOne
@JoinColumn(name = "CouleurInterieur", unique = true)
private CouleurInterieur CouleurInterieur;

@OneToMany(mappedBy = "car")
private Set<AttelageRemorque> attelageRemorques = new HashSet<>();

@OneToMany(mappedBy = "car")
 private   Set<AideStationnement> AideStationnements= new HashSet<>();;

@OneToMany(mappedBy = "car")
private   Set<RegulateurVitesse> regulateurVitesse =new HashSet<>();;

@OneToMany(mappedBy = "car")
  private   Set<AutresEquipement> autresEquipements= new HashSet<>();;
@OneToMany(mappedBy = "car")
private  Set<MateriauIntérieur> materiauIntérieur= new HashSet<>(); ;
@OneToMany(mappedBy = "car")
private  Set<Autre>  autres =new HashSet<>(); ;
@OneToMany(mappedBy = "car")
private  Set<Climatisation> Climatisations =new HashSet<>();;

@OneToMany(mappedBy = "car")
private  Set<AutresAmenagementsInt> autresAmenagementsInterieurs =new HashSet<>();;

@OneToMany(mappedBy = "car")
private  Set<PienceJointe>  pienceJointes = new HashSet<>();;

@OneToMany(mappedBy = "car")
private  Set<Document>  documents  =new HashSet<>();;





}
