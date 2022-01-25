package com.hdm.gestionCars.DAO;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.components.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

	public Set<Authority> findByRole(String role);

}
