package com.hdm.gestionCars.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.RepositoryEntreprise;
import com.hdm.gestionCars.DAO.RepositoryUser;
import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.model.User;
import com.hdm.gestionCars.model.UserPrincipal;
import com.hdm.gestionCars.model.components.Role;
import com.hdm.gestionCars.request.UserRequest;

@Service
@Transactional
@Qualifier(value = "UserDetailsService")
public class UserServiceImpl implements UserDetailsService {
	private RepositoryUser user_Repository;
	private RepositoryEntreprise entreprise;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RepositoryEntreprise entrepriseRepo;

	@Autowired
	public UserServiceImpl(RepositoryUser user_Repository, RepositoryEntreprise entreprise,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.user_Repository = user_Repository;
		this.entreprise = entreprise;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = user_Repository.findUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("no user found based on the given username : " + username);
		} else {
			user_Repository.save(user);
			UserPrincipal principal = new UserPrincipal(user);
			return principal;
		}
	}

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
		user_.setRole(Role.ROLE_USER.name());
		user_.setAuthorities(Role.ROLE_USER.getAuthorities());
		Entreprise entreprise = new Entreprise(user.getEntreprise().getEntrepriseName(),
				user.getEntreprise().getAddresse(), user.getEntreprise().getCodePostal(),
				user.getEntreprise().getVille(), user.getEntreprise().getPays(), user.getEntreprise().getTva(),
				user.getEntreprise().getTel(), user.getEntreprise().getEmail(), user.getEntreprise().getLoi(),
				user.getEntreprise().getGroupeClients(), user.getEntreprise().getRegistrecommerce(),
				user.getEntreprise().getEnregistrementEntreprise(), user.getEntreprise().getCopiePieceDidentiter());

		// Entreprise save = entrepriseRepo.save(entreprise);

//		user_.setEntreprise(save);
		user_.setEntreprise(entreprise);
		return user_Repository.saveAndFlush(user_);
	}

	public User addUpUser(User user) {
		User user_ = new User();
		user_.setFirstname(user.getFirstname());
		user_.setLastname(user.getLastname());
		user_.setPhone(user.getPhone());
		user_.setEmail(user.getEmail());
		user_.setUsername(user.getUsername());
		user_.setRole(Role.ROLE_USER.name());
		user_.setAuthorities(Role.ROLE_USER.getAuthorities());
//		user_.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user_.setPassword(user.getPassword());
		user_.setActive(true);
		user_.setFonction(user.getFonction());

		Entreprise findByEntrepriseId = entreprise.findByEntrepriseId(user.getEntreprise().getEntrepriseId());

		if (findByEntrepriseId != null) {
			user_.setEntreprise(findByEntrepriseId);
		}
		return user_Repository.saveAndFlush(user_);
	}

	public List<User> getListUsers() {
		return user_Repository.findAll();
	}

	public User activateUser(UserRequest request) {
		User user = user_Repository.findByUserId(request.getUserId());
		if (user != null) {
			if (user.isActive()) {
				user.setActive(false);
			} else {
				user.setActive(true);
			}
			user_Repository.save(user);
		}
		return user;
	}

	public User getOneUser(Long userId) {
		return user_Repository.findByUserId(userId);
	}

	public User updateUser(Long userId, User user) {
		User save = null;
		User userToBeUpdated = user_Repository.findByUserId(userId);

		if (userToBeUpdated != null) {
			// update fields here
			userToBeUpdated.setEmail(user.getEmail());
			save = user_Repository.save(userToBeUpdated);
		}
		return save;
	}

	public String eraseUserFromTheSystem(Long userId) {
		user_Repository.deleteById(userId);
		return "user with the given id -> " + userId + "deleted successfully";
	}

	public User getUserByUsername(String username) {
		return user_Repository.findUserByUsername(username);
	}

}
