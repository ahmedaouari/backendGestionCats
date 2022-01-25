package com.hdm.gestionCars.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hdm.gestionCars.model.User;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager manager;

	public JwtAuthenticationFilter(AuthenticationManager manager) {
		this.manager = manager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		User user = null;
		try {
			user = new ObjectMapper().readValue(request.getInputStream(), User.class);
			return manager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), new ArrayList<>()));
		} catch (BadCredentialsException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		User userPrincipal = (User) authResult.getPrincipal();

		String token = JWT.create().withSubject(userPrincipal.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 1800000))
				.sign(Algorithm.HMAC512("mysecret".getBytes()));

		response.addHeader("Authorization", "Bearer " + token);

	}

}
