package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.model.Favorite;
import com.hdm.gestionCars.request.FavoriteRequest;
import com.hdm.gestionCars.service.FavoriteService;

@RestController
@RequestMapping(path = { "/api" })
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;

	@PostMapping(value = "/new-favorite")
	public ResponseEntity<Favorite> createNewFavorite(@RequestBody FavoriteRequest request) {
		return new ResponseEntity<Favorite>(favoriteService.createNewFavorite(request), HttpStatus.CREATED);
	}

	@GetMapping(value = "/list-favorites")
	public ResponseEntity<List<Favorite>> listFavorites() {
		return new ResponseEntity<List<Favorite>>(favoriteService.getListFavorites(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{entrepriseId}/list-favoritesByEntreprise")
	public ResponseEntity<List<Favorite>> listActivitiesByEntreprise(@PathVariable(value = "entrepriseId") Long entrepriseId) {
		return new ResponseEntity<List<Favorite>>(favoriteService.getListFavoritesByEntreprise(entrepriseId), HttpStatus.OK);
	}
}
