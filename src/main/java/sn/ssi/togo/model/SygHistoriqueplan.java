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
	@Table(name = "pmb_historiqueplan")
	public class SygHistoriqueplan  implements java.io.Serializable {
		
  		private Long id;
		private SygPlansdepassation plan;
		private Date DateRejet,dateMiseEnValidation;
		private String CommentaireRejet,commentaireMiseValidation,fichierMiseValidation,FichierRejet,etat,fichierMiseValidationdeux,validerpar_prenom,
		validerpar_nom;
		
		private Utilisateur user;
    


		public SygHistoriqueplan() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

	
		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "plan_id")
    	public SygPlansdepassation getPlan() {
			return plan;
		}
    	public void setPlan(SygPlansdepassation plan) {
			this.plan = plan;
		}



    


		@Temporal(TemporalType.DATE)
    	@Column(name = "datemiseenvalidation", length = 7)
		public Date getDateMiseEnValidation() {
			return dateMiseEnValidation;
		}
    	public void setDateMiseEnValidation(Date dateMiseEnValidation) {
			this.dateMiseEnValidation = dateMiseEnValidation;
		}


    	

    	@Temporal(TemporalType.DATE)
    	@Column(name = "histoac_datecreationdossier", length = 7)
		public void setDateRejet(Date DateRejet) {
			this.DateRejet = DateRejet;
		}
 		public Date getDateRejet() {
			return DateRejet;
		}


 		@Column(name = "commentairerejet")
		public String getCommentaireRejet() {
			return CommentaireRejet;
		}
    	public void setCommentaireRejet(String commentaireRejet) {
			CommentaireRejet = commentaireRejet;
		}


    	@Column(name = "commentairemisevalidation")
		public String getCommentaireMiseValidation() {
			return commentaireMiseValidation;
		}
    	public void setCommentaireMiseValidation(String commentaireMiseValidation) {
			this.commentaireMiseValidation = commentaireMiseValidation;
		}


    	@Column(name = "fichiermisevalidation")
		public String getFichierMiseValidation() {
			return fichierMiseValidation;
		}
		public void setFichierMiseValidation(String fichierMiseValidation) {
			this.fichierMiseValidation = fichierMiseValidation;
		}


		@Column(name = "fichierrejet")
		public String getFichierRejet() {
			return FichierRejet;
		}
    	public void setFichierRejet(String fichierRejet) {
			FichierRejet = fichierRejet;
		}


    	@Column(name = "etat")
		public String getEtat() {
			return etat;
		}
    	public void setEtat(String etat) {
			this.etat = etat;
		}


    	@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "usr")
		public Utilisateur getUser() {
			return user;
		}
    	public void setUser(Utilisateur user) {
			this.user = user;
		}

    	@Column(name = "fichiermisevalidationdeux")
    	public String getFichierMiseValidationdeux() {
			return fichierMiseValidationdeux;
		}
    	public void setFichierMiseValidationdeux(String fichierMiseValidationdeux) {
			this.fichierMiseValidationdeux = fichierMiseValidationdeux;
		}
    	
    	@Column(name = "validerpar_nom")
    	public String getValiderpar_nom() {
			return validerpar_nom;
		}
    	public void setValiderpar_nom(String validerpar_nom) {
			this.validerpar_nom = validerpar_nom;
		}


    	@Column(name = "validerpar_prenom")
		public String getValiderpar_prenom() {
			return validerpar_prenom;
		}
    	public void setValiderpar_prenom(String validerpar_prenom) {
			this.validerpar_prenom = validerpar_prenom;
		}

    	
	}

