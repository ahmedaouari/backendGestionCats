package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AutresAmenagementsInt {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nameFr;
	    private String nameAlm;
	    private String nameEn;
	  
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		
		public AutresAmenagementsInt(String nameFr, String nameAlm, String nameEn) {
			super();
			this.nameFr = nameFr;
			this.nameAlm = nameAlm;
			this.nameEn = nameEn;
		}
		public AutresAmenagementsInt() {
			super();
		}
	    
	    
		
}
