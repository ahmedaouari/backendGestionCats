package com.hdm.gestionCars.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//import org.springframework.util.Assert;

@Configuration
public class AuthEntryPoint extends BasicAuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//		response.sendError(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase());

		PrintWriter writer = response.getWriter();
		writer.println("Basic Authentication Required. Please Supply Appropriate Credentials");
	}

	@Override
	public void afterPropertiesSet() {
//		Assert.hasText(this.realmName, "realmName must be specified");
		setRealmName("GestionCars");
		super.afterPropertiesSet();
	}

}