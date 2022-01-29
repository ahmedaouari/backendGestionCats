package com.hdm.gestionCars.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hdm.gestionCars.service.UserDetailsServiceImpl;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

	private UserDetailsServiceImpl userDetailsServiceImpl;

	public JwtAuthorizationFilter(AuthenticationManager authenticationManager,
			UserDetailsServiceImpl userDetailsServiceImpl) {
		super(authenticationManager);
		this.userDetailsServiceImpl = userDetailsServiceImpl;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String authenticationHeader = request.getHeader("Authorization");

		if (authenticationHeader == null || authenticationHeader.trim().length() == 0
				|| !authenticationHeader.startsWith("Bearer ")) {
			chain.doFilter(request, response);
		}

		UsernamePasswordAuthenticationToken authenticationToken = getAuthorization(authenticationHeader);
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		chain.doFilter(request, response);

	}

	private UsernamePasswordAuthenticationToken getAuthorization(String authenticationHeader) {
		if (authenticationHeader != null) {
			String usernameFromTheToken = JWT.require(Algorithm.HMAC512("mysecret")).build()
					.verify(authenticationHeader.replace("Bearer ", "")).getSubject();

			if (usernameFromTheToken != null) {
				return new UsernamePasswordAuthenticationToken(usernameFromTheToken, null,
						userDetailsServiceImpl.loadUserByUsername(usernameFromTheToken).getAuthorities());
			}
		}
		return null;
	}

}
