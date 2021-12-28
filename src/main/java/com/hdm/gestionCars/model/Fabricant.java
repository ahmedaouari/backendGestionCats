package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fabricant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fabricantID;

    private String nameFr;
    private String nameAlm;
    private String nameEn;

    @OneToOne(mappedBy = "fabricant")
    private Car car;






}
