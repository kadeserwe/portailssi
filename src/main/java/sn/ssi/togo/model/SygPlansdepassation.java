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
	@Table(name = "pmb_plansdepassation")
	public class SygPlansdepassation  implements java.io.Serializable {
		
  		private Long IDinfoplan;
		private String Nomresp,PrenomResp,Numplan,commentaireValidation,commentaireMiseValidation,motif,fichierMiseValidation,fichier_validation,
		etatValidPlan,BorderauPlan,budgetanomalie,budcontrole,commentaires,referenceMiseValidation,status,commentairePublication,referenceValidation,
		fichierMiseValidationdeux;
		
		
	
		private int annee,lastVersionValid,NumeroDernierRealisation,version;
		private Date Datepublication,Datecreation,dateValidation,dateMiseEnValidation,dateRejet,DateAuPlusTard,datedebut,datefin;
		private SygAutoriteContractante autorite;
		private SygPlansdepassation plan;
		
    	public SygPlansdepassation() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idinfoplan",  length = 255)
        public Long getIDinfoplan() {
			return this.IDinfoplan;
		}
		public void setIDinfoplan(Long IDinfoplan) {
			this.IDinfoplan = IDinfoplan;
		}

	
		@Column(name = "annee",  length = 5)
		public int getAnnee() {
			return annee;
		}
    	public void setAnnee(int annee) {
			this.annee = annee;
		}



		@Column(name = "nomresp",  length = 20)
		public String getNomresp() {
			return this.Nomresp;
		}

		public void setNomresp(String Nomresp) {
			this.Nomresp = Nomresp;
		}


		@Column(name = "prenomresp",  length = 20)
		public String getPrenomResp() {
			return PrenomResp;
		}
    	public void setPrenomResp(String prenomResp) {
			PrenomResp = prenomResp;
		}


    	@Column(name = "numplan",  length = 20)
		public String getNumplan() {
			return Numplan;
		}
    	public void setNumplan(String numplan) {
			Numplan = numplan;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "datepublication", length = 7)
		public Date getDatepublication() {
			return Datepublication;
		}
    	public void setDatepublication(Date datepublication) {
			Datepublication = datepublication;
		}

		
    	@Temporal(TemporalType.DATE)
    	@Column(name = "datecreation", length = 7)
    	public Date getDatecreation() {
			return Datecreation;
		}
    	public void setDatecreation(Date datecreation) {
			Datecreation = datecreation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datevalidation", length = 7)
		public Date getDateValidation() {
			return dateValidation;
		}
    	public void setDateValidation(Date dateValidation) {
			this.dateValidation = dateValidation;
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
    	@Column(name = "daterejet", length = 7)
		public Date getDateRejet() {
			return dateRejet;
		}
    	public void setDateRejet(Date dateRejet) {
			this.dateRejet = dateRejet;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateauplustard", length = 7)
		public Date getDateAuPlusTard() {
			return DateAuPlusTard;
		}
    	public void setDateAuPlusTard(Date dateAuPlusTard) {
			DateAuPlusTard = dateAuPlusTard;
		}



		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


    	@Column(name = "lastversionvalid",  length = 1)
		public int getLastVersionValid() {
			return lastVersionValid;
		}
    	public void setLastVersionValid(int lastVersionValid) {
			this.lastVersionValid = lastVersionValid;
		}


    	@Column(name = "numerodernierrealisation",  length = 11)
		public int getNumeroDernierRealisation() {
			return NumeroDernierRealisation;
		}
    	public void setNumeroDernierRealisation(int numeroDernierRealisation) {
			NumeroDernierRealisation = numeroDernierRealisation;
		}

    	@Column(name = "commentairevalidation")
		public String getCommentaireValidation() {
			return commentaireValidation;
		}
    	public void setCommentaireValidation(String commentaireValidation) {
			this.commentaireValidation = commentaireValidation;
		}


    	@Column(name = "commentairemisevalidation")
		public String getCommentaireMiseValidation() {
			return commentaireMiseValidation;
		}
    	public void setCommentaireMiseValidation(String commentaireMiseValidation) {
			this.commentaireMiseValidation = commentaireMiseValidation;
		}


    	@Column(name = "motif")
		public String getMotif() {
			return motif;
		}
    	public void setMotif(String motif) {
			this.motif = motif;
		}


    	@Column(name = "fichiermisevalidation",length=255)
		public String getFichierMiseValidation() {
			return fichierMiseValidation;
		}
    	public void setFichierMiseValidation(String fichierMiseValidation) {
			this.fichierMiseValidation = fichierMiseValidation;
		}


    	@Column(name = "fichier_validation")
		public String getFichier_validation() {
			return fichier_validation;
		}
    	public void setFichier_validation(String fichier_validation) {
			this.fichier_validation = fichier_validation;
		}


    	@Column(name = "etatvalidplan",length=3)
		public String getEtatValidPlan() {
			return etatValidPlan;
		}
        public void setEtatValidPlan(String etatValidPlan) {
			this.etatValidPlan = etatValidPlan;
		}


        @Column(name = "borderauplan",length=20)
		public String getBorderauPlan() {
			return BorderauPlan;
		}
    	public void setBorderauPlan(String borderauPlan) {
			BorderauPlan = borderauPlan;
		}


    	 @Column(name = "budgetanomalie",length=3)
		public String getBudgetanomalie() {
			return budgetanomalie;
		}
    	public void setBudgetanomalie(String budgetanomalie) {
			this.budgetanomalie = budgetanomalie;
		}


    	 @Column(name = "budcontrole",length=3)
		public String getBudcontrole() {
			return budcontrole;
		}
    	public void setBudcontrole(String budcontrole) {
			this.budcontrole = budcontrole;
		}
    	
    	
    	
    	@Column(name = "commentaires",length=255)
    	public String getCommentaires() {
			return commentaires;
		}
    	public void setCommentaires(String commentaires) {
			this.commentaires = commentaires;
		}


    	@Column(name = "referencemisevalidation",length=255)
		public String getReferenceMiseValidation() {
			return referenceMiseValidation;
		}
    	public void setReferenceMiseValidation(String referenceMiseValidation) {
			this.referenceMiseValidation = referenceMiseValidation;
		}
    	
    	
    	@Column(name = "status",length=255)
    	public String getStatus() {
			return status;
		}
    	public void setStatus(String status) {
			this.status = status;
		}
    	
    	@Column(name = "commentairepublication",length=255)
    	public String getCommentairePublication() {
			return commentairePublication;
		}
    	public void setCommentairePublication(String commentairePublication) {
			this.commentairePublication = commentairePublication;
		}


    	@Column(name = "version",length=11)
		public int getVersion() {
			return version;
		}
    	public void setVersion(int version) {
			this.version = version;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "infoplanid")
		public SygPlansdepassation getPlan() {
			return plan;
		}
    	public void setPlan(SygPlansdepassation plan) {
			this.plan = plan;
		}
    	
    	@Column(name = "referencevalidation",length=255)
    	public String getReferenceValidation() {
			return referenceValidation;
		}
    	public void setReferenceValidation(String referenceValidation) {
			this.referenceValidation = referenceValidation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datedebut", length = 7)
		public Date getDatedebut() {
			return datedebut;
		}
    	public void setDatedebut(Date datedebut) {
			this.datedebut = datedebut;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datefin", length = 7)
		public Date getDatefin() {
			return datefin;
		}
		public void setDatefin(Date datefin) {
			this.datefin = datefin;
		}


		@Column(name = "fichiermisevalidationdeux",length=255)
		public String getFichierMiseValidationdeux() {
			return fichierMiseValidationdeux;
		}
    	public void setFichierMiseValidationdeux(String fichierMiseValidationdeux) {
			this.fichierMiseValidationdeux = fichierMiseValidationdeux;
		}
		
		
    	
    	
	}

