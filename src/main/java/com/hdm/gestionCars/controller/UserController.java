package com.hdm.gestionCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.model.User;
import com.hdm.gestionCars.service.ServiceUser;

@RestController
public class UserController {

	@Autowired
	private ServiceUser serviceUser;

	@PostMapping(value = "/signup")
	public User signUp(@RequestBody User user) {
		User signUpUser = serviceUser.signUpUser(user);
		return signUpUser;
	}

	@GetMapping(value = "/list-users")
	public List<User> listusers() {
		List<User> listUsers = serviceUser.getListUsers();
		return listUsers;
	}

	@PutMapping(value = "/user/{id}")
	public User update(@PathVariable Long id, @RequestBody User user) {
		User updateUser = serviceUser.updateUser(id, user);
		return updateUser;
	}

	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable Long id) {
		serviceUser.eraseUserFromTheSystem(id);
	}
}
