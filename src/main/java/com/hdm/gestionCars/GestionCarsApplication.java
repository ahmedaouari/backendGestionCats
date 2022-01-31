package com.hdm.gestionCars;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hdm.gestionCars.DAO.RepositoryCar;
import com.hdm.gestionCars.model.AttelageRemorque;
import com.hdm.gestionCars.model.AutrInformations;
import com.hdm.gestionCars.model.Car;
import com.hdm.gestionCars.model.Moteur;
import com.hdm.gestionCars.model.Prix;
import com.hdm.gestionCars.service.IStorageFile;
import com.hdm.gestionCars.service.ServiceCar;

@SpringBootApplication
public class GestionCarsApplication implements CommandLineRunner {
	  @Resource
	  IStorageFile storageService;
	public static void main(String[] args) { SpringApplication.run(GestionCarsApplication.class, args);
	
	
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 storageService.deleteAll();
		    storageService.init();
		
	}

}
