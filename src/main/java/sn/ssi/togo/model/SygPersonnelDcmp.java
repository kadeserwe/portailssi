package sn.ssi.togo.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "syg_personnedcmp")
public class SygPersonnelDcmp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String prenom;
	private String nom,email;
	private Date date_engagement;
	private String indice;
	private String cv;
	private String Fichier;
	private Date date_prise_service;
	private Date date_depart_retraite;
	private SygBureauxdcmp bureau;
	private SygSituationMatrimoniale situationmatrimoniale;
	private SygHierarchie hierarchie;
	private SygSpecialitesPersonnel specialite;
	
	
    
	public SygPersonnelDcmp() {
		super();
	}
	



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	
	@Column(name = "prenom", length = 255)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	@Column(name = "nom", length = 100)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	
	@Column(name = "date_engagement", length = 255)
	public Date getDate_engagement() {
		return date_engagement;
	}


	public void setDate_engagement(Date date_engagement) {
		this.date_engagement = date_engagement;
	}


	
	@Column(name = "indice", length = 255)
	public String getIndice() {
		return indice;
	}


	public void setIndice(String indice) {
		this.indice = indice;
	}

	
	@Column(name = "cv", length = 255)
	public String getCv() {
		return cv;
	}


	public void setCv(String cv) {
		this.cv = cv;
	}

	
	@Column(name = "fichier", length = 255)
	public String getFichier() {
		return Fichier;
	}


	public void setFichier(String fichier) {
		Fichier = fichier;
	}


	
	@Column(name = "date_prise_service", length = 255)
	public Date getDate_prise_service() {
		return date_prise_service;
	}


	public void setDate_prise_service(Date date_prise_service) {
		this.date_prise_service = date_prise_service;
	}

	
	@Column(name = "date_depart_retraite", length = 255)
	public Date getDate_depart_retraite() {
		return date_depart_retraite;
	}


	public void setDate_depart_retraite(Date date_depart_retraite) {
		this.date_depart_retraite = date_depart_retraite;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "uniteorg")
	public SygBureauxdcmp getBureau() {
		return bureau;
	}
	public void setBureau(SygBureauxdcmp bureau) {
		this.bureau = bureau;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "situationmatrimoniale")
	public SygSituationMatrimoniale getSituationmatrimoniale() {
		return situationmatrimoniale;
	}
	public void setSituationmatrimoniale(SygSituationMatrimoniale situationmatrimoniale) {
		this.situationmatrimoniale = situationmatrimoniale;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hierarchie")
	public SygHierarchie getHierarchie() {
		return hierarchie;
	}
	public void setHierarchie(SygHierarchie hierarchie) {
		this.hierarchie = hierarchie;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "specialite")
	public SygSpecialitesPersonnel getSpecialite() {
		return specialite;
	}
	public void setSpecialite(SygSpecialitesPersonnel specialite) {
		this.specialite = specialite;
	}



	@Column(name = "email", length = 100)
	public String getEmail() {
		return email;
	}
 	public void setEmail(String email) {
		this.email = email;
	}

	
	

	
}
