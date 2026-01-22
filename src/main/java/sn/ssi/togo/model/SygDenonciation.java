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

//import sn.ssi.sygmap.be.workflow.entity.SysState;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_denonciation")
	public class SygDenonciation  implements java.io.Serializable {
		
  		private Long ID;
		private String objet;
		private String denonciation;
		private String fichier;
		private Date datedenonciation;
		private Integer traiter;
		
		private Integer publier;
		private Integer poubelle;
		private Date datecourrier;
		private Date dateappel;
		private Date datereception;
		private String reference;
		private Integer numerovert;
		private String nomappellant;
		private String adresse;
		private String origine;
		
		
		//private SysState state;
		private Date dateStatut;
		private String traitement;
		
		private String recvDecision;// decision Recevabilite 
		private Long recvNumero;//numero Recevabilite
		private Date recvDate; //date Recevabilite 
		private String recvFichier;//fichier  Recevabilite 
		private String recvCommentaire;// Commentaire Recevabilite 
		
		private SygAutoriteContractante autoritecontractante;
		private SygAppelsOffres appeloffre;
		
    	public SygDenonciation() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
        public Long getID() {
			return this.ID;
		}
		public void setID(Long ID) {
			this.ID = ID;
		}
		@Column(name = "objet")
		public String getObjet() {
			return objet;
		}

		public void setObjet(String objet) {
			this.objet = objet;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datedenonciation",  length = 10 )
		public Date getDatedenonciation() {
			return datedenonciation;
		}
    	public void setDatedenonciation(Date datedenonciation) {
			this.datedenonciation= datedenonciation;
		}
    	@Column(name = "traiter")
		public Integer getTraiter() {
			return traiter;
		}
		public void setTraiter(Integer traiter) {
			this.traiter = traiter;
		}
		@Column(name = "publier")
		public Integer getPublier() {
			return publier;
		}
		public void setPublier(Integer publier) {
			this.publier = publier;
		}
		@Column(name = "poubelle")
		public Integer getPoubelle() {
			return poubelle;
		}

		public void setPoubelle(Integer poubelle) {
			this.poubelle = poubelle;
		}
		@Column(name = "denonciation")
		public String getDenonciation() {
			return denonciation;
		}
		public void setDenonciation(String denonciation) {
			this.denonciation = denonciation;
		}
		@Column(name = "fichier")
		public String getFichier() {
			return fichier;
		}
		public void setFichier(String fichier) {
			this.fichier = fichier;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datecourrier",  length = 10 )
		public Date getDatecourrier() {
			return datecourrier;
		}
		public void setDatecourrier(Date datecourrier) {
			this.datecourrier = datecourrier;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="dateappel",  length = 10 )
		public Date getDateappel() {
			return dateappel;
		}
		public void setDateappel(Date dateappel) {
			this.dateappel = dateappel;
		}
		@Temporal(TemporalType.DATE)
		@Column(name ="datereception",  length = 10 )
		public Date getDatereception() {
			return datereception;
		}
		public void setDatereception(Date datereception) {
			this.datereception = datereception;
		}
		@Column(name = "reference")
		public String getReference() {
			return reference;
		}
		public void setReference(String reference) {
			this.reference = reference;
		}
		@Column(name = "numerovert")
		public Integer getNumerovert() {
			return numerovert;
		}
		public void setNumerovert(Integer numerovert) {
			this.numerovert = numerovert;
		}
		@Column(name = "nomappellant")
		public String getNomappellant() {
			return nomappellant;
		}
		public void setNomappellant(String nomappellant) {
			this.nomappellant = nomappellant;
		}
		@Column(name = "adresse")
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		@Column(name = "origine")
		public String getOrigine() {
			return origine;
		}

		public void setOrigine(String origine) {
			this.origine = origine;
		}	
//		@ManyToOne(fetch = FetchType.EAGER)
//		@JoinColumn(name = "statcode")
//		public SysState getState() {
//			return state;
//		}
//		public void setState(SysState state) {
//			this.state = state;
//		}
		@Temporal(TemporalType.DATE)
		@Column(name = "dlocdatestatut", length = 7)
		public Date getDateStatut() {
			return dateStatut;
		}
		public void setDateStatut(Date dateStatut) {
			this.dateStatut = dateStatut;
		}
		@Column(name = "dloctraitement", length = 8)
		public String getTraitement() {
			return traitement;
		}
		public void setTraitement(String traitement) {
			this.traitement = traitement;
		}
		@Column(name = "recvdecision", length = 50)
		public String getRecvDecision() {
			return recvDecision;
		}
		public void setRecvDecision(String recvDecision) {
			this.recvDecision = recvDecision;
		}		
		@Column(name = "recvnumero")
		public Long getRecvNumero() {
			return recvNumero;
		}
		public void setRecvNumero(Long recvNumero) {
			this.recvNumero = recvNumero;
		}
		@Temporal(TemporalType.DATE)
		@Column(name = "recvdate", length = 7)
		public Date getRecvDate() {
			return recvDate;
		}
		public void setRecvDate(Date recvDate) {
			this.recvDate = recvDate;
		}
		@Column(name = "recvfichier")
		public String getRecvFichier() {
			return recvFichier;
		}
		public void setRecvFichier(String recvFichier) {
			this.recvFichier = recvFichier;
		}
		@Column(name = "recvcommentaire", length = 255)
		public String getRecvCommentaire() {
			return recvCommentaire;
		}
		public void setRecvCommentaire(String recvCommentaire) {
			this.recvCommentaire = recvCommentaire;
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
		@JoinColumn(name = "appeloffreid")
		public SygAppelsOffres getAppeloffre() {
			return appeloffre;
		}
		public void setAppeloffre(SygAppelsOffres appeloffre) {
			this.appeloffre = appeloffre;
		}


	}
