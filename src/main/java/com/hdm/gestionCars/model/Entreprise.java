package com.hdm.gestionCars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long entrepriseId;

	private String entrepriseName;
	private String addresse;
	private String codePostal;
	private String ville;
	private String pays;
	private String tva;
	private String tel;
	private String email;
	private String loi;
	private String groupeClients;

	// documents format strings
	private String registrecommerce;
	private String enregistrementEntreprise;
	private String copiePieceDidentiter;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entreprise(Long entrepriseId, String entrepriseName, String addresse, String codePostal, String ville,
			String pays, String tva, String tel, String email, String loi, String groupeClients,
			String registrecommerce, String enregistrementEntreprise, String copiePieceDidentiter) {
		super();
		this.entrepriseId = entrepriseId;
		this.entrepriseName = entrepriseName;
		this.addresse = addresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.tva = tva;
		this.tel = tel;
		this.email = email;
		this.loi = loi;
		this.groupeClients = groupeClients;
		this.registrecommerce = registrecommerce;
		this.enregistrementEntreprise = enregistrementEntreprise;
		this.copiePieceDidentiter = copiePieceDidentiter;
	}

	public Entreprise(String entrepriseName, String addresse, String codePostal, String ville, String pays, String tva,
			String tel, String email, String loi, String groupeClients, String registrecommerce,
			String enregistrementEntreprise, String copiePieceDidentiter) {
		super();
		this.entrepriseName = entrepriseName;
		this.addresse = addresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.tva = tva;
		this.tel = tel;
		this.email = email;
		this.loi = loi;
		this.groupeClients = groupeClients;
		this.registrecommerce = registrecommerce;
		this.enregistrementEntreprise = enregistrementEntreprise;
		this.copiePieceDidentiter = copiePieceDidentiter;
	}

	public Long getEntrepriseId() {
		return entrepriseId;
	}

	public void setEntrepriseId(Long entrepriseId) {
		this.entrepriseId = entrepriseId;
	}

	public String getEntrepriseName() {
		return entrepriseName;
	}

	public void setEntrepriseName(String entrepriseName) {
		this.entrepriseName = entrepriseName;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getTva() {
		return tva;
	}

	public void setTva(String tva) {
		this.tva = tva;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoi() {
		return loi;
	}

	public void setLoi(String loi) {
		this.loi = loi;
	}

	public String getGroupeClients() {
		return groupeClients;
	}

	public void setGroupeClients(String groupeClients) {
		this.groupeClients = groupeClients;
	}

	public String getRegistrecommerce() {
		return registrecommerce;
	}

	public void setRegistrecommerce(String registrecommerce) {
		this.registrecommerce = registrecommerce;
	}

	public String getEnregistrementEntreprise() {
		return enregistrementEntreprise;
	}

	public void setEnregistrementEntreprise(String enregistrementEntreprise) {
		this.enregistrementEntreprise = enregistrementEntreprise;
	}

	public String getCopiePieceDidentiter() {
		return copiePieceDidentiter;
	}

	public void setCopiePieceDidentiter(String copiePieceDidentiter) {
		this.copiePieceDidentiter = copiePieceDidentiter;
	}

}
