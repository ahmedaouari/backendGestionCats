package com.hdm.gestionCars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.FavoriteDAO;
import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.model.Favorite;
import com.hdm.gestionCars.request.FavoriteRequest;

@Service
public class FavoriteService {

	@Autowired
	private FavoriteDAO favoriteDAO;

	@Autowired
	private ServiceEntreprise entreprise;

	public Favorite createNewFavorite(FavoriteRequest request) {
		Favorite favorite = new Favorite();

		Entreprise _Entreprise = entreprise.getEntrepriseBasedOnTheId(request.getEntreprise().getEntrepriseId());
		if (_Entreprise != null) {
			Entreprise createNewEntreprise = entreprise.createNewEntreprise(_Entreprise);
			favorite.setEntreprise(createNewEntreprise);
		}
//		request.getCars().stream().forEach(car -> {
//			favorite.getCars().add(car);
//		});
		favorite.setCar(request.getCar());
		return favoriteDAO.save(favorite);
	}

	public List<Favorite> getListFavorites() {
		return favoriteDAO.findAll();
	}

	public List<Favorite> getListFavoritesByEntreprise(Long entrepriseId) {
		Entreprise _Entreprise = entreprise.getEntrepriseBasedOnTheId(entrepriseId);
		List<Favorite> findByEntreprise = null;
		if (_Entreprise != null) {
			findByEntreprise = favoriteDAO.findByEntreprise(_Entreprise);
		}
		return findByEntreprise;
	}
}
