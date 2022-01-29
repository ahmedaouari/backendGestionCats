package com.hdm.gestionCars.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.hdm.gestionCars.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	private UserDetailsServiceImpl userServiceImpl;

	@Autowired
	public SecurityConfig(BCryptPasswordEncoder bcryptPasswordEncoder, UserDetailsServiceImpl userServiceImpl) {
		this.bcryptPasswordEncoder = bcryptPasswordEncoder;
		this.userServiceImpl = userServiceImpl;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userServiceImpl).passwordEncoder(bcryptPasswordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests().antMatchers("/public/**")
				.access("hasRole('USER') and hasAuthority('AUTHORITY_USER')").antMatchers("/admin/**")
				.access("hasRole('ADMIN') and hasAuthority('AUTHORITY_ADMIN')").anyRequest().authenticated().and()
				.addFilter(new JwtAuthenticationFilter(authenticationManager()))
				.addFilter(new JwtAuthorizationFilter(authenticationManager(), userServiceImpl)).sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	}
	
	  @Bean
      CorsConfigurationSource corsConfigurationSource() {
          UrlBasedCorsConfigurationSource source = new
                  UrlBasedCorsConfigurationSource();
          source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
          return source;
      }

}
