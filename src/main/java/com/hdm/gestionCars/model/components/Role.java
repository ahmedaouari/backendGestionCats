package com.hdm.gestionCars.model.components;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hdm.gestionCars.model.User;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	private String role;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_key")
	@JsonBackReference
	private User user;

	public Role() {
		super();
	}

	public Role(Integer roleId, String role, User userRequest) {
		super();
		this.roleId = roleId;
		this.role = role;
		this.user = userRequest;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUserRequest() {
		return user;
	}

	public void setUserRequest(User user) {
		this.user = user;
	}

}
