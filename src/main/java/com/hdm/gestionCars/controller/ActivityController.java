package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.model.Activity;
import com.hdm.gestionCars.request.ActivityRequest;
import com.hdm.gestionCars.service.ActivityService;

@RestController
@RequestMapping(path = { "/api" })
public class ActivityController {

	@Autowired
	private ActivityService activityService;

	@PostMapping(value = "/new-activity")
	public ResponseEntity<Activity> createNewActivity(@RequestBody ActivityRequest request) {
		return new ResponseEntity<Activity>(activityService.createNewActivity(request), HttpStatus.CREATED);
	}

	@GetMapping(value = "/list-activities")
	public ResponseEntity<List<Activity>> listActivities() {
		return new ResponseEntity<List<Activity>>(activityService.getListActivities(), HttpStatus.OK);
	}

	@GetMapping(value = "/{entrepriseId}/list-activities")
	public ResponseEntity<List<Activity>> listActivitiesByEntreprise(
			@PathVariable(value = "entrepriseId") Long entrepriseId) {
		return new ResponseEntity<List<Activity>>(activityService.getListActivitiesByEntreprise(entrepriseId),
				HttpStatus.OK);
	}

	@PutMapping(value = "/change/activity")
	public ResponseEntity<Activity> updateTargetActivity(@RequestBody ActivityRequest request) {
		return new ResponseEntity<Activity>(activityService.changeStatus(request), HttpStatus.OK);
	}

	@GetMapping(value = "/max-activityBy-entreprise")
	public ResponseEntity<List<Object>> listActivitiesByEntrepriseMAXPrice(
			@RequestParam(value = "entrepriseId") Long entrepriseId) {
		List<Object> listOfActivitiesFromTheDBMax = activityService.listOfActivitiesFromTheDBMax(entrepriseId);
		return new ResponseEntity<List<Object>>(listOfActivitiesFromTheDBMax, HttpStatus.OK);
	}

	@GetMapping(value = "/max-activityBy-car/{carId}")
	public ResponseEntity<Integer> maxActivityByCar(@PathVariable(value = "carId") Integer carId) {
		Integer theHighestActivityPrice = activityService.getTheHighestActivityPrice(carId);
		return new ResponseEntity<Integer>(theHighestActivityPrice, HttpStatus.OK);
	}

}
