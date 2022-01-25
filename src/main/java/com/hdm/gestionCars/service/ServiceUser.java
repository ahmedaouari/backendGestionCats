package com.hdm.gestionCars.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.DAO.AuthorityRepository;
import com.hdm.gestionCars.DAO.RepositoryEntreprise;
import com.hdm.gestionCars.DAO.RepositoryUser;
import com.hdm.gestionCars.model.Entreprise;
import com.hdm.gestionCars.model.User;
import com.hdm.gestionCars.model.components.Authority;

@Service
public class ServiceUser {

	@Autowired
	private RepositoryUser repositoryUser;

	@Autowired
	private RepositoryEntreprise entreprise;
	
	@Autowired
	private AuthorityRepository authorityRepository;

	public User signUpUser(User user) {
		User user_ = new User();

		user_.setFirstname(user.getFirstname());
		user_.setLastname(user.getLastname());
		user_.setPhone(user.getPhone());
		user_.setEmail(user.getEmail());
		user_.setUsername(user.getUsername());
		user_.setPassword(user.getPassword());
		user_.setActive(false);
		user_.setFonction(user.getFonction());

		Entreprise entreprise = new Entreprise(user.getEntreprise().getEntrepriseName(),
				user.getEntreprise().getAddresse(), user.getEntreprise().getCodePostal(),
				user.getEntreprise().getVille(), user.getEntreprise().getPays(), user.getEntreprise().getTva(),
				user.getEntreprise().getTel(), user.getEntreprise().getEmail(), user.getEntreprise().getLoi(),
				user.getEntreprise().getGroupeClients(), user.getEntreprise().getRegistrecommerce(),
				user.getEntreprise().getEnregistrementEntreprise(), user.getEntreprise().getCopiePieceDidentiter());

		user_.setEntreprise(entreprise);
		return repositoryUser.save(user_);
	}

	public User addUpUser(User user) {
		User user_ = new User();
		user_.setFirstname(user.getFirstname());
		user_.setLastname(user.getLastname());
		user_.setPhone(user.getPhone());
		user_.setEmail(user.getEmail());
		user_.setUsername(user.getUsername());
//		user_.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user_.setPassword(user.getPassword());
		user_.setActive(true);
		user_.setFonction(user.getFonction());

		Entreprise findByEntrepriseId = entreprise.findByEntrepriseId(user.getEntreprise().getEntrepriseId());

		if (findByEntrepriseId != null) {
			user_.setEntreprise(findByEntrepriseId);
		}
		return repositoryUser.saveAndFlush(user_);
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

	public User getUserByUsername(String username) {
		User user_ = repositoryUser.findByUsername(username);

		if (user_ != null) {
			User user = new User(user_.getUserId(), user_.getUsername(), user_.getPassword(), user_.isActive());

			Stream<Stream<String>> streams = user_.getRoles().stream().map(role -> {
				Set<Authority> authorities = authorityRepository.findByRole(role.getRole());
				return authorities.stream().map(authority -> authority.getAuthority());
			});
			Set<String> collect = streams.flatMap(authorityStream -> authorityStream).collect(Collectors.toSet());

			user.getRoles().stream().forEach(role_ -> collect.add(role_.getRole()));
			user.setAuthorities(collect.stream().map(authority_ -> new SimpleGrantedAuthority(authority_))
					.collect(Collectors.toSet()));
			return user;
		} else {
			return null;
		}
	}

}
