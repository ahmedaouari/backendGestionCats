package com.hdm.gestionCars.config;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.hdm.gestionCars.DAO.REpositoryAutreEquipement;
import com.hdm.gestionCars.DAO.RepositoryAideStationnement;
import com.hdm.gestionCars.DAO.RepositoryAttelageRemorque;
import com.hdm.gestionCars.DAO.RepositoryColorExterior;
import com.hdm.gestionCars.DAO.RepositoryColorInterior;
import com.hdm.gestionCars.DAO.RepositoryFabricant;
import com.hdm.gestionCars.DAO.RepositoryMatriaulInterieur;
import com.hdm.gestionCars.DAO.RepositoryRegulateurVitesse;
import com.hdm.gestionCars.model.AideStationnement;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.AutreEquipement;
import com.hdm.gestionCars.model.CouleurExterieur;
import com.hdm.gestionCars.model.CouleurInterieur;
import com.hdm.gestionCars.model.Fabricant;
import com.hdm.gestionCars.model.MateriauIntérieur;
import com.hdm.gestionCars.model.RegulateurVitesse;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	RepositoryFabricant repositoryFabricant;
	@Autowired
	RepositoryColorExterior repositoryColorExterior;
	@Autowired
	RepositoryColorInterior repositoryColorInterior;
	@Autowired
	RepositoryAttelageRemorque repositoryAttelageRemorque;
	@Autowired
	RepositoryAideStationnement repositoryAideStationnement;
	@Autowired
	RepositoryRegulateurVitesse repositoryRegulateurVitesse;

	@Autowired
	REpositoryAutreEquipement repositoryAutreEquipement;
	@Autowired
	RepositoryMatriaulInterieur repositoryMatriaulInterieur;

	boolean first = false;

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {

		if (first == true) {

			// fabricant
			repositoryFabricant.save(new Fabricant("opel", "opel", "opel"));
			repositoryFabricant.save(new Fabricant("volkswagen", "volkswagen", "volkswagen"));
			repositoryFabricant.save(new Fabricant("renault ", "renault ", "renault "));
// repositoryColorExterior
			repositoryColorExterior.save(new CouleurExterieur("blue", "Blau", "blue"));
			repositoryColorExterior.save(new CouleurExterieur("red", "rot", "rouge"));
// repositoryColorInterior
			repositoryColorInterior.save(new CouleurInterieur("blue", "Blau", "blue"));
			repositoryColorInterior.save(new CouleurInterieur("red", "rot", "rouge"));

// RepositoryAttelageRemorque
			repositoryAttelageRemorque.save(new AttelageRemorque("Quelconque", "Beliebig", "any"));
			repositoryAttelageRemorque.save(new AttelageRemorque("Fixe, amovible ou pivotant",
					"Fest, abnehmbar oder schwenkbar", "Fixed, removable or swivel"));
			repositoryAttelageRemorque.save(
					new AttelageRemorque("Amovible ou pivotant", "Abnehmbar oder schwenkbar", "Removable or swivel"));
			repositoryAttelageRemorque.save(new AttelageRemorque("pivotant", "schwenken", "swivel"));
			// repositoryAideStationnement
			repositoryAideStationnement.save(new AideStationnement("Arrière", "Zurück", "Back"));
			repositoryAideStationnement.save(new AideStationnement("Devant", "Vor", "Before"));
			repositoryAideStationnement.save(new AideStationnement("caméra", "Kamera", "camera"));
			repositoryAideStationnement.save(new AideStationnement("Caméra 360°", "360° Kamera", "360 ° camera"));
			repositoryAideStationnement.save(
					new AideStationnement("Systèmes d'autoguidage", "Autoguiding-Systeme", "Autoguiding systems"));

// regulateurVitesse
			repositoryRegulateurVitesse.save(new RegulateurVitesse("Quelconque", "Beliebig", "Any"));
			repositoryRegulateurVitesse
					.save(new RegulateurVitesse("Régulateur de vitesse", "Geschwindigkeitsregler", "Speed regulator"));
			repositoryRegulateurVitesse.save(new RegulateurVitesse("Régulateur de vitesse à distance",
					"Tempomat mit Fernbedienung", "Remote cruise control"));

// repositoryAutreEquipement
			repositoryAutreEquipement.save(new AutreEquipement("SECTION", "SEKTION", "SECTION"));
			repositoryAutreEquipement
					.save(new AutreEquipement("Avertissement de distance", "Abstandswarnung", "Distance warning"));
			repositoryAutreEquipement
					.save(new AutreEquipement("Phares adaptatifs", "Adaptives Kurvenlicht", "Adaptive headlights"));
			repositoryAutreEquipement
					.save(new AutreEquipement("toutes roues motrices", "Allradantrieb", "all-wheel drive"));

//materiauIntérieur
			repositoryMatriaulInterieur.save(new MateriauIntérieur("Alcantara", "Alcantara", "Alcantara"));
			repositoryMatriaulInterieur.save(new MateriauIntérieur("Cuir partiel", "Teilleder", "Partial leather"));
			repositoryMatriaulInterieur.save(new MateriauIntérieur("Velours", "Samt", "Velvet"));
			repositoryMatriaulInterieur.save(new MateriauIntérieur("Plein cuir", "Vollleder", "Full leather"));

		}

	}

}
