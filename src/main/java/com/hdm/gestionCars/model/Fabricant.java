package com.hdm.gestionCars.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fabricant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8012619173552562831L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fabricantID;

	private String nameFr;
	private String nameAlm;
	private String nameEn;



	
	

	public Fabricant() {
	}

	public Fabricant(Long fabricantID, String nameFr, String nameAlm, String nameEn) {
		this.fabricantID = fabricantID;
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;

	}

	public Fabricant(String nameFr, String nameAlm, String nameEn) {
		super();
		this.nameFr = nameFr;
		this.nameAlm = nameAlm;
		this.nameEn = nameEn;
	}

	public Long getFabricantID() {
		return fabricantID;
	}

	public void setFabricantID(Long fabricantID) {
		this.fabricantID = fabricantID;
	}

	public String getNameFr() {
		return nameFr;
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	public String getNameAlm() {
		return nameAlm;
	}

	public void setNameAlm(String nameAlm) {
		this.nameAlm = nameAlm;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}



	@Override
	public String toString() {
		return "Fabricant [fabricantID=" + fabricantID + ", nameFr=" + nameFr + ", nameAlm=" + nameAlm + ", nameEn="
				+ nameEn ;
	}

}
