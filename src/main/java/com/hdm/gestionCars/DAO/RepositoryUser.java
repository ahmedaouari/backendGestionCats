package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.User;

@Repository
public interface RepositoryUser extends JpaRepository<User, Long> {

	User findByUserId(Long userId);

	User findByUsername(String username);

	User findUserByUsername(String username);

}
