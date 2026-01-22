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
	@Table(name = "pmb_avisgeneral")
	public class SygAvisGeneral  implements java.io.Serializable {
		
  		private Long id;  
		//private SygRealisations realisation;
		private SygAutoriteContractante autorite;
		private String numero,fichier_Avis,annee,description;
//		private String NomService,NomAgentResponsable,PrenomResponsable,Adressecomplete,NumeroTelephone,NumeroTelecopieur,
//	     commentaireValidation,commentaireMiseEnvalidation,motif,fichier_validation,etatValidAvis,BorderauAvis,texteAvisGeneral;
//		private Date Datepublication,dateValidation,dateCreation,dateMiseEnvalidation,dateRejet,DateAuPlusTard;
//		private int Etatmarches,version,lastVersionValid;
		private int Etat,version,lastVersionValid;
		

		private Date Datepublication;
		
    	public SygAvisGeneral() {
    		super();
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

	

		@Column(name = "numero",  length = 50)
		public String getNumero() {
			return this.numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}


       
//		
//    	@ManyToOne(fetch = FetchType.EAGER)
//    	@JoinColumn(name = "infoplan_id")
//    	public SygRealisations getRealisation() {
//			return realisation;
//		}
//    	public void setRealisation(SygRealisations realisation) {
//			this.realisation = realisation;
//		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


//    	@Column(name = "commentaires")
//		public String getCommentaires() {
//			return Commentaires;
//		}
//    	public void setCommentaires(String Commentaires) {
//			this.Commentaires = Commentaires;
//		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datepublication", length = 7)
		public Date getDatepublication() {
			return Datepublication;
		}
    	public void setDatepublication(Date datepublication) {
			Datepublication = datepublication;
		}


//    	@Column(name = "nomservice")
//		public String getNomService() {
//			return NomService;
//		}
// 		public void setNomService(String nomService) {
//			NomService = nomService;
//		}


// 		@Column(name = "nomagentresponsable")
//		public String getNomAgentResponsable() {
//			return NomAgentResponsable;
//		}
//    	public void setNomAgentResponsable(String nomAgentResponsable) {
//			NomAgentResponsable = nomAgentResponsable;
//		}


//    	@Column(name = "prenomresponsable")
//		public String getPrenomResponsable() {
//			return PrenomResponsable;
//		}
//    	public void setPrenomResponsable(String prenomResponsable) {
//			PrenomResponsable = prenomResponsable;
//		}

//
//    	@Column(name = "numerotelephone")
//		public String getNumeroTelephone() {
//			return NumeroTelephone;
//		}
//    	public void setNumeroTelephone(String numeroTelephone) {
//			NumeroTelephone = numeroTelephone;
//		}

//
//    	@Column(name = "numerotelecopieur")
//		public String getNumeroTelecopieur() {
//			return NumeroTelecopieur;
//		}
//    	public void setNumeroTelecopieur(String numeroTelecopieur) {
//			NumeroTelecopieur = numeroTelecopieur;
//		}


//    	@Column(name = "adressecomplete")
//		public String getAdressecomplete() {
//			return Adressecomplete;
//		}
//    	public void setAdressecomplete(String adressecomplete) {
//			Adressecomplete = adressecomplete;
//		}


    	@Column(name = "fichier_avis")
		public String getFichier_Avis() {
			return fichier_Avis;
		}
    	public void setFichier_Avis(String fichier_Avis) {
			this.fichier_Avis = fichier_Avis;
		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "datevalidation", length = 7)
//		public Date getDateValidation() {
//			return dateValidation;
//		}
//    	public void setDateValidation(Date dateValidation) {
//			this.dateValidation = dateValidation;
//		}


//    	@Column(name = "etatmarches")
//		public int getEtatmarches() {
//			return Etatmarches;
//		}
//    	public void setEtatmarches(int etatmarches) {
//			Etatmarches = etatmarches;
//		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "datecreation", length = 7)
//		public Date getDateCreation() {
//			return dateCreation;
//		}
//    	public void setDateCreation(Date dateCreation) {
//			this.dateCreation = dateCreation;
//		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "datemiseenvalidation", length = 7)
//		public Date getDateMiseEnvalidation() {
//			return dateMiseEnvalidation;
//		}
//    	public void setDateMiseEnvalidation(Date dateMiseEnvalidation) {
//			this.dateMiseEnvalidation = dateMiseEnvalidation;
//		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "daterejet", length = 7)
//		public Date getDateRejet() {
//			return dateRejet;
//		}
//    	public void setDateRejet(Date dateRejet) {
//			this.dateRejet = dateRejet;
//		}


//    	@Temporal(TemporalType.DATE)
//    	@Column(name = "dateauplustard", length = 7)
//		public Date getDateAuPlusTard() {
//			return DateAuPlusTard;
//		}
//    	public void setDateAuPlusTard(Date dateAuPlusTard) {
//			DateAuPlusTard = dateAuPlusTard;
//		}


//    	@Column(name = "commentairevalidation")
//		public String getCommentaireValidation() {
//			return commentaireValidation;
//		}
//    	public void setCommentaireValidation(String commentaireValidation) {
//			this.commentaireValidation = commentaireValidation;
//		}


//    	@Column(name = "commentairemiseenvalidation")
//		public String getCommentaireMiseEnvalidation() {
//			return commentaireMiseEnvalidation;
//		}
//    	public void setCommentaireMiseEnvalidation(String commentaireMiseEnvalidation) {
//			this.commentaireMiseEnvalidation = commentaireMiseEnvalidation;
//		}


//    	@Column(name = "etatvalidavis")
//		public String getEtatValidAvis() {
//			return etatValidAvis;
//		}
//    	public void setEtatValidAvis(String etatValidAvis) {
//			this.etatValidAvis = etatValidAvis;
//		}


    	@Column(name = "annee")
		public String getAnnee() {
			return annee;
		}
    	public void setAnnee(String annee) {
			this.annee = annee;
		}


    	@Column(name = "etat")
		public int getEtat() {
			return Etat;
		}

		public void setEtat(int etat) {
			Etat = etat;
		}



//
//    	@Column(name = "borderauavis")
//		public String getBorderauAvis() {
//			return BorderauAvis;
//		}
//    	public void setBorderauAvis(String borderauAvis) {
//			BorderauAvis = borderauAvis;
//		}


//    	@Column(name = "motif")
//		public String getMotif() {
//			return motif;
//		}
//    	public void setMotif(String motif) {
//			this.motif = motif;
//		}


//    	@Column(name = "fichier_validation")
//		public String getFichier_validation() {
//			return fichier_validation;
//		}
//    	public void setFichier_validation(String fichier_validation) {
//			this.fichier_validation = fichier_validation;
//		}

//
//    	@Column(name = "texteavisgeneral")
//		public String getTexteAvisGeneral() {
//			return texteAvisGeneral;
//		}
//		public void setTexteAvisGeneral(String texteAvisGeneral) {
//			this.texteAvisGeneral = texteAvisGeneral;
//		}

//
//		@Column(name = "version")
//		public int getVersion() {
//			return version;
//		}
//		public void setVersion(int version) {
//			this.version = version;
//		}

//
//		@Column(name = "lastversionvalid")
//		public int getLastVersionValid() {
//			return lastVersionValid;
//		}
//    	public void setLastVersionValid(int lastVersionValid) {
//			this.lastVersionValid = lastVersionValid;
//		}
        
    	
		@Column(name = "version",length=11)
		public int getVersion() {
			return version;
		}
    	public void setVersion(int version) {
			this.version = version;
		}
    	
    	@Column(name = "lastversionvalid",  length = 1)
		public int getLastVersionValid() {
			return lastVersionValid;
		}
    	public void setLastVersionValid(int lastVersionValid) {
			this.lastVersionValid = lastVersionValid;
		}


    	@Column(name = "description",  length = 255)
		public String getDescription() {
			return description;
		}
    	public void setDescription(String description) {
			this.description = description;
		}
    	
    	
    	
	}

