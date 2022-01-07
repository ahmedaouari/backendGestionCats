package com.hdm.gestionCars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryEntreprise;
import com.hdm.gestionCars.DAO.RepositoryUser;
import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.model.User;

@Service
public class ServiceUser {

	@Autowired
	private RepositoryUser repositoryUser;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RepositoryEntreprise entreprise;

	public User signUpUser(User user) {
		User user_ = new User();

		user_.setFirstname(user.getFirstname());
		user_.setLastname(user.getLastname());
		user_.setPhone(user.getPhone());
		user_.setEmail(user.getEmail());
		user_.setUsername(user.getUsername());
		user_.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user_.setActive(false);
		user_.setFonction(user.getFonction());

		Entreprise findByEntrepriseId = entreprise.findByEntrepriseId(1L);
		if (findByEntrepriseId != null) {
			user_.setEntreprise(findByEntrepriseId);
		}
		return repositoryUser.save(user_);
	}

	public User addUpUser(User user) {
		User user_ = new User();

		user_.setFirstname(user.getFirstname());
		user_.setLastname(user.getLastname());
		user_.setPhone(user.getPhone());
		user_.setEmail(user.getEmail());
		user_.setUsername(user.getUsername());
		user_.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user_.setActive(user.isActive());
		user_.setEnabled(user.isEnabled());
		user_.setFonction(user.getFonction());

		Entreprise findByEntrepriseId = entreprise.findByEntrepriseId(1L);
		if (findByEntrepriseId != null) {
			user_.setEntreprise(findByEntrepriseId);
		}
		return repositoryUser.save(user_);
	}

	public List<User> getListUsers() {
		return repositoryUser.findAll();
	}

	public User activateUser(Long userId) {
		User user = repositoryUser.findByUserId(userId);
		if (user != null) {
			user.setActive(true);
			repositoryUser.save(user);
		}
		return user;
	}

	public User getOneUser(Long userId) {
		return repositoryUser.findByUserId(userId);
	}

	public User updateUser(Long userId, User user) {
		User save = null;
		User userToBeUpdated = repositoryUser.findByUserId(userId);

		if (userToBeUpdated != null) {
			// update fields here
			userToBeUpdated.setEmail(user.getEmail());
			save = repositoryUser.save(userToBeUpdated);
		}
		return save;
	}

	public String eraseUserFromTheSystem(Long userId) {
		repositoryUser.deleteById(userId);
		return "user with the given id -> " + userId + "deleted successfully";
	}

}
