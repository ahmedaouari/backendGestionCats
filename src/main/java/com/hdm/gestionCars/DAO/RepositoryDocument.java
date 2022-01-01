package com.hdm.gestionCars.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdm.gestionCars.model.Document;

@Repository
public interface RepositoryDocument extends JpaRepository<Document, Long> {

}
