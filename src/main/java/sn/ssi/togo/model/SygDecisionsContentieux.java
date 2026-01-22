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
	@Table(name = "pmb_decisioncontentieux")
	public class SygDecisionsContentieux  implements java.io.Serializable {
		
  		private Long id;
		private String decDecision; // Decision sur le fond
		private String decNumero;//numero Decision sur le fond
		private Date decDate; //date Decision sur le fond
		private String decFichier;//fichier  Decision sur le fond
		private String decCommentaire;// Commentaire Decision sur le fond 
		private String decStatut,recevable;
		private SygContentieux contentieux;
		
		// menu Saisi decision
		private SygTypeDecision typedcision;
		private SygAutoriteContractante autoritecontractante;
		private SygTypesmarches typemarche;
		private SygModepassation modepassation;
		private Date decDateRecour;//Date d'entr�e du recours 
		private String decAuteurrecour;
		private String decObjet;
		
	
		public SygDecisionsContentieux() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "decid",  length = 10)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "decdecision", length = 50)
		public String getDecDecision() {
			return decDecision;
		}

		public void setDecDecision(String decDecision) {
			this.decDecision = decDecision;
		}

		@Column(name = "decnumero" , length = 50)
		public String getDecNumero() {
			return decNumero;
		}



		public void setDecNumero(String decNumero) {
			this.decNumero = decNumero;
		}


		

		@Temporal(TemporalType.DATE)
		@Column(name = "decdate", length = 7)
		public Date getDecDate() {
			return decDate;
		}

		public void setDecDate(Date decDate) {
			this.decDate = decDate;
		}


		@Column(name = "decfichier")
		public String getDecFichier() {
			return decFichier;
		}

		public void setDecFichier(String decFichier) {
			this.decFichier = decFichier;
		}


		@Column(name = "deccommentaire", length = 255)
		public String getDecCommentaire() {
			return decCommentaire;
		}

		public void setDecCommentaire(String decCommentaire) {
			this.decCommentaire = decCommentaire;
		}
		
		@Column(name = "decstatut", length = 10)
		public String getDecStatut() {
			return decStatut;
		}



		public void setDecStatut(String decStatut) {
			this.decStatut = decStatut;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "contentieuxid")
		
		public SygContentieux getContentieux() {
			return contentieux;
		}



		public void setContentieux(SygContentieux contentieux) {
			this.contentieux = contentieux;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "decisionid")
		public SygTypeDecision getTypedcision() {
			return typedcision;
		}



		public void setTypedcision(SygTypeDecision typedcision) {
			this.typedcision = typedcision;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "aut_autid")
		public SygAutoriteContractante getAutoritecontractante() {
			return autoritecontractante;
		}

		public void setAutoritecontractante(SygAutoriteContractante autoritecontractante) {
			this.autoritecontractante = autoritecontractante;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "typemarche")
		public SygTypesmarches getTypemarche() {
			return typemarche;
		}



		public void setTypemarche(SygTypesmarches typemarche) {
			this.typemarche = typemarche;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "modepassation")
		public SygModepassation getModepassation() {
			return modepassation;
		}



		public void setModepassation(SygModepassation modepassation) {
			this.modepassation = modepassation;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "decdaterecour", length = 7)
		public Date getDecDateRecour() {
			return decDateRecour;
		}



		public void setDecDateRecour(Date decDateRecour) {
			this.decDateRecour = decDateRecour;
		}


		@Column(name = "decauteurrecour", length = 255)
		public String getDecAuteurrecour() {
			return decAuteurrecour;
		}



		public void setDecAuteurrecour(String decAuteurrecour) {
			this.decAuteurrecour = decAuteurrecour;
		}


		@Column(name = "decobjet", length = 255)
		public String getDecObjet() {
			return decObjet;
		}



		public void setDecObjet(String decObjet) {
			this.decObjet = decObjet;
		}


		@Column(name = "recevable", length = 5)
		public String getRecevable() {
			return recevable;
		}
		public void setRecevable(String recevable) {
			this.recevable = recevable;
		}



		



		
		

		



		


		
	}

