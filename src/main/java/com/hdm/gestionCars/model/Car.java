package com.hdm.gestionCars.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
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
	private String Ramasse;


	
@OneToMany(mappedBy = "car")
private Set<AttelageRemorque> attelageRemorques = new HashSet<>();

@OneToOne
@JoinColumn(name = "fabricant_key", unique = true)
private  Fabricant fabricant;



}
