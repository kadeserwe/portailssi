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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_prestataire")
	public class SygPrestataire  implements java.io.Serializable {
		
  		private Long idprestataire;
		private String identifiant;
		private String raisonsociale;
		private String adresse;
		private String commentaire;
		private SygPays pays;
		private String mail;
		private String nom;
		private String prenom;
		private String telephone,telephoneentreprise;
		private String mails;
		private String natureprestataire;
		
		public SygPrestataire() {
		}
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idprestataire")
        public Long getIdprestataire() {
			return this.idprestataire;
		}
		public void setIdprestataire(Long id) {
			this.idprestataire = id;
		}
		@Column(name = "identifiant", length=50)
    	public String getIdentifiant() {
			return identifiant;
		}
		public void setIdentifiant(String identifiant) {
			this.identifiant = identifiant;
		}
		@Column(name = "raisonsociale")
		public String getRaisonsociale() {
			return raisonsociale;
		}
		public void setRaisonsociale(String raisonsociale) {
			this.raisonsociale = raisonsociale;
		}
		@Column(name = "mail")
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		@Column(name = "adresse")
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		@Column(name = "commentaire")
		public String getCommentaire() {
			return commentaire;
		}
		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		
		}
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "idpays")
	    public SygPays getPays() {
			return pays;
		}
		public void setPays(SygPays pays) {
			this.pays = pays;
		}
		@Column(name = "nom")
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		
		}
		@Column(name = "prenom")
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		@Column(name = "telephone")
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		@Column(name = "mails")
		public String getMails() {
			return mails;
		}
		public void setMails(String mails) {
			this.mails = mails;
		}
		@Column(name = "natureprestataire")
		public String getNatureprestataire() {
			return natureprestataire;
		}
		public void setNatureprestataire(String natureprestataire) {
			this.natureprestataire = natureprestataire;
		}
		
		@Column(name = "telentreprise")
		public String getTelephoneentreprise() {
			return telephoneentreprise;
		}
		public void setTelephoneentreprise(String telephoneentreprise) {
			this.telephoneentreprise = telephoneentreprise;
		}
		
		
	}
