package com.hdm.gestionCars.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.User;
import com.hdm.gestionCars.model.components.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	User findByUser(User user);
}
