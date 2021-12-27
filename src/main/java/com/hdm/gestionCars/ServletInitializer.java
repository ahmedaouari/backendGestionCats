package com.hdm.gestionCars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.AutrInformations;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Moteur;
import com.hdm.gestionCars.model.Prix;

public class ServletInitializer extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GestionCarsApplication.class);
		}

}
