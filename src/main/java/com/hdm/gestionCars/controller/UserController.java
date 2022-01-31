package com.hdm.gestionCars.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdm.gestionCars.model.User;
import com.hdm.gestionCars.model.UserPrincipal;
import com.hdm.gestionCars.security.JWTokenProvider;
import com.hdm.gestionCars.service.ServiceEntreprise;
import com.hdm.gestionCars.service.UserServiceImpl;

@RestController
@RequestMapping(path = { "/api" })
public class UserController {

	@Autowired
	private UserServiceImpl serviceUser;
	@Autowired
	private JWTokenProvider jwtTokenProvider;
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private ServiceEntreprise entrepriseService;

	@PostMapping(value = "/singup")
	public User signUp(@RequestBody User user) {
		User signUpUser = serviceUser.signUpUser(user);
		return signUpUser;
	}

	@PostMapping(value = "/singin")
	public ResponseEntity<User> login(@RequestBody User user) {
		authenticate(user.getUsername(), user.getPassword());
		User loggedUser = serviceUser.getUserByUsername(user.getUsername());
		UserPrincipal principal = new UserPrincipal(loggedUser);
		HttpHeaders jwtHeader = getJwtHeader(principal);
		return new ResponseEntity<>(loggedUser, jwtHeader, OK);
	}

	@PostMapping(value = "/new-user")
	public User addNewUser(@RequestBody User user) {
		User signUpUser = serviceUser.addUpUser(user);
		return signUpUser;
	}

	@GetMapping(value = "/list-users")
	public List<User> listusers() {
		List<User> listUsers = serviceUser.getListUsers();
		return listUsers;
	}

	@GetMapping(value = "/one-user/{id}")
	public User getOneUser(@PathVariable Long id) {
		User oneUser = serviceUser.getOneUser(id);
		return oneUser;
	}

	@GetMapping(value = "/users/activate/{id}")
	public User activateUser(@PathVariable Long id) {
		User activateUser = serviceUser.activateUser(id);
		return activateUser;
	}

	@PutMapping(value = "/user-target/{id}")
	public User update(@PathVariable Long id, @RequestBody User user) {
		User updateUser = serviceUser.updateUser(id, user);
		return updateUser;
	}

	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable Long id) {
//		User oneUser = serviceUser.getOneUser(id);
//		entrepriseService.deleteEntreprise(oneUser.getEntreprise().getEntrepriseId());
		serviceUser.eraseUserFromTheSystem(id);
	}

	private HttpHeaders getJwtHeader(UserPrincipal principal) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Jwt-Token", jwtTokenProvider.generateJWToken(principal));
		return headers;
	}

	private void authenticate(String username, String password) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	}
}
