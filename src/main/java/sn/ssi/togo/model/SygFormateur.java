package sn.ssi.togo.model;

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
@Table(name = "syg_formateur")
public class SygFormateur implements java.io.Serializable {

	private Integer id;
	private String nom, prenom, lieuNaiss,address, email,commentaire,sexe,cv;
	private Long nin,tel;
	private Date dateNaiss;
	private SygSpecialite specialite;
	private SygTypeFormateur type;
	
	//pr raison social
	private String societe;
	private Long telsociete;
	private String mailsociete;
	private String adsociete;

	public SygFormateur() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 10)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nom", length = 50)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 100)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "lieunaiss", length = 200)
	public String getLieuNaiss() {
		return lieuNaiss;
	}

	public void setLieuNaiss(String lieuNaiss) {
		this.lieuNaiss = lieuNaiss;
	}

	@Column(name = "commentaire")
	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Column(name = "nin")
	public Long getNin() {
		return nin;
	}

	public void setNin(Long nin) {
		this.nin = nin;
	}

	@Column(name = "datenaiss")
	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	@Column(name = "sexe")
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telephone")
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "specialite", nullable = false)
	public SygSpecialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(SygSpecialite specialite) {
		this.specialite = specialite;
	}

	@Column(name = "curi")
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeform")
	public SygTypeFormateur getType() {
		return type;
	}

	public void setType(SygTypeFormateur type) {
		this.type = type;
	}

	@Column(name = "nom_societe")
	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}
	
	@Column(name = "address_societe")
	public String getAdsociete() {
		return adsociete;
	}

	public void setAdsociete(String adsociete) {
		this.adsociete = adsociete;
	}

	@Column(name = "mail_societe")
	public String getMailsociete() {
		return mailsociete;
	}

	public void setMailsociete(String mailsociete) {
		this.mailsociete = mailsociete;
	}

	@Column(name = "tel_societe")
	public Long getTelsociete() {
		return telsociete;
	}

	public void setTelsociete(Long telsociete) {
		this.telsociete = telsociete;
	}

	
	
}
