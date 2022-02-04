package com.hdm.gestionCars.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String username;
	private String password;
	private String fonction;
	private boolean active;
	private String role;
	private String[] authorities;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "entreprise_key", nullable = false)
	private Entreprise entreprise;

	public User() {
		super();
	}

	public User(Long userId, String username, String password, boolean active) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public User(Long userId, String firstname, String lastname, String phone, String email, String username,
			String password, String fonction, boolean active, Entreprise entreprise) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
		this.fonction = fonction;
		this.active = active;
		this.entreprise = entreprise;
	}

	public User(String firstname, String lastname, String phone, String email, String username, String password,
			String fonction, boolean active, Entreprise entreprise) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
		this.fonction = fonction;
		this.active = active;
		this.entreprise = entreprise;
	}

	public User(String username, String password, boolean active) {
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String[] authorities) {
		this.authorities = authorities;
	}

}
