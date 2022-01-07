package com.hdm.gestionCars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryUser;
import com.hdm.gestionCars.model.User;

@Service
public class ServiceUser {

	@Autowired
	private RepositoryUser repositoryUser;
	

	public User signUpUser(User user) {
		User user_ = new User();
		
		return repositoryUser.save(user_);
	}

	public List<User> getListUsers() {
		return repositoryUser.findAll();
	}

	public User getOneUser(Long userId) {
		return repositoryUser.findByUserId(userId);
	}

	public User updateUser(Long userId, User user) {
		User save = null;
		User userToBeUpdated = repositoryUser.findByUserId(userId);

		if (userToBeUpdated != null) {
			// update feilds here
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
