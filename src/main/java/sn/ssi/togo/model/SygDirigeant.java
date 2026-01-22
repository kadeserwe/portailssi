package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_dirigeant")
public class SygDirigeant  implements java.io.Serializable{
	private Long iddirigeant;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String fonction;
	private String reference;
	private String piecedidentite;
	
	private SygFournisseur Fournisseur;
	
	public SygDirigeant() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iddirigeant",  length = 10)
	public Long getIddirigeant() {
		return iddirigeant;
	}

	public void setIddirigeant(Long iddirigeant) {
		this.iddirigeant = iddirigeant;
	}
	@Column(name = "nom",  length = 255)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(name = "prenom",  length = 255)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Column(name = "adresse",  length = 255)
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Column(name = "mail",  length = 255)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(name = "fonction",  length = 255)
	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@Column(name = "reference",  length = 255)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	@Column(name = "piecedidentite",  length = 255)
	public String getPiecedidentite() {
		return piecedidentite;
	}

	public void setPiecedidentite(String piecedidentite) {
		this.piecedidentite = piecedidentite;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fournisseur")
	public SygFournisseur getFournisseur() {
		return Fournisseur;
	}

	public void setFournisseur(SygFournisseur fournisseur) {
		Fournisseur = fournisseur;
	}



}
