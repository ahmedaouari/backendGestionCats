package com.hdm.gestionCars.model;

import javax.persistence.Embedded;

public class Car {
	
	private int idCar;
	private String Fabricant;
	private String model;
	private String variante;
	private String conception;
	private String AILETTE;
	private String inscription;
	private String marque;
	
	// moteur 
	@Embedded
	private Moteur moteur;
	

	// histrorique de voiture 
	private String PossessionArt;
	private String TerrainOccasion;
	// join class document 
	private String Documents;
	private String CarnetEntretien;
	private String DernierePrestation;
	
	
	// information suplimentaire 
		
	private String CouleurExterieure;
	private String CouleurIntErieure;
	private String TypePeinture;
	private int NbrPortes;
	private int nbrplaces;
	private int nbrCles;
	private String evaluateur;
	// Quelconque;Fixe, amovible ou pivotant Amovible ou pivotant ;pivotant
	private String attelageRemorque;
	
	private boolean ideStationnementArriere;
	private boolean ideStationnementDevant;
	private boolean ideStationnementcamera;
	private boolean ideStationnementCamera360;
	private boolean ideStationnementSystèmesAutoguidage;
	

// Régulateur de vitesse
	private String Quelconque;
	private String RégulateueVitesse;
	private String RégulateurVitesseDistancen;
	 // autre  equipement 
	private boolean section;
	private boolean AvertissementDistance;
	private boolean PharesAdaptatifs;
	private boolean rouesMotrices;
	private boolean PneusSsaisons;
	private boolean ParebriseChauffant;
	//private boolean Aide au démarrage en côte
	private boolean PharesbiXénon;
	private boolean FeuxRouteEblouissement;
	private boolean RailsToit;
	private boolean HayonElectrique;
	private boolean AntidemarrageElectrique;
	private boolean ESP;
	private boolean Assistantfeuxroute;
	private boolean SystèmelimitationVitesse;
	private boolean FeuVirage;
	private boolean LumiereLaser;
	private boolean pharesLED;
	private boolean FeuxJourLED;
	private boolean JantesAlliage;
	private boolean CapteurLumière;
	private boolean SuspensionPneumatique;
	private boolean AssistanteVisionNocturne;
	private boolean FeuxBrouillard;
	private boolean AssistanceFreinageUrgence;
	private boolean RoueSecours;
	private boolean KitDepannage;
	private boolean ToitPanoramique;
	private boolean capteurPluie;
	private boolean ControlePressionPneus;
	private boolean NettoyageFhares;
	private boolean toitOuvrant;
	private boolean VerrouillageCentraliseCle;
	private boolean DirectionAssistee;
	private boolean PneusEte;
	private boolean SuspensionSport;
	private boolean ForfaitSport;
	private boolean AideMaintienVoie;
	private boolean JantesAcier;
	private boolean DemarrageArretAutomatique;
	private boolean LumieresAllumeesJournee;
	private boolean AssistantAngleMort;
	private boolean ControleTraction;
	private boolean Reconnaissancepanneauxsignalisation;
	private boolean PneusHiver;
	private boolean Pharesxenon;
	private boolean systemeVerrouillageCentralise;



	
	

}
