package com.hdm.gestionCars.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.ActivityDAO;
import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.model.Activity_Type;
import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.request.ActivityRequest;

@Service
public class ActivityService {
	@Autowired
	private ActivityDAO activityDAO;

	@Autowired
	private ServiceEntreprise entreprise;

	public Activity createNewActivity(ActivityRequest request) {
		Activity activity = new Activity();

		Entreprise _Entreprise = entreprise.getEntrepriseBasedOnTheId(request.getEntreprise().getEntrepriseId());
		if (_Entreprise != null) {
			Entreprise createNewEntreprise = entreprise.createNewEntreprise(_Entreprise);
			activity.setEntreprise(createNewEntreprise);
		}
		activity.setStatus(Activity_Type.EN_COURS);
		activity.setActivityDate(new Date());
		activity.setPrice(request.getPrice());
		
		request.getCars().stream().forEach(car -> {
			activity.getCars().add(car);
		});

		return activityDAO.save(activity);
	}

	public List<Activity> getListActivities() {
		return activityDAO.findAll();
	}

	public List<Activity> getListActivitiesByEntreprise(Long entrepriseId) {
		Entreprise _Entreprise = entreprise.getEntrepriseBasedOnTheId(entrepriseId);
		List<Activity> findByEntreprise = null;
		if (_Entreprise != null) {
			findByEntreprise = activityDAO.findByEntreprise(_Entreprise);
		}
		return findByEntreprise;
	}

}
