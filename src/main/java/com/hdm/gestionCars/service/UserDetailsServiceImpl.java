package com.hdm.gestionCars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hdm.gestionCars.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private ServiceUser serviceUser;

	@Autowired
	public UserDetailsServiceImpl(ServiceUser serviceUser) {
		this.serviceUser = serviceUser;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = serviceUser.getUserByUsername(username);
		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("NO USER FOUND BASED ON THE GIVEN USERNAME CREDENTIALS: " + username);
		}
	}

}
