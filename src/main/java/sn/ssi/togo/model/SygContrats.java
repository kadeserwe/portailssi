package sn.ssi.togo.model;

import java.math.BigDecimal;
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
	@Table(name = "pmb_contrats")
	public class SygContrats  implements java.io.Serializable {
		
  		private Long conID;
		private SygPlisouvertures plis;
		private SygAutoriteContractante autorite;
		private SygDossiers dossier;
		private BigDecimal montant,montantverse;
		private Date conDateSignature,conDateApprobation,conDateNotification,conDateRecepProvisoire,conDateRecepDefinitive,conDateOrdreDemarrage
		,condateAttributionprovisoire,condateAttributiondefinitive,condatepaiement,datedemandeimmatriculation,dateimmatriculation;
		private String conCommentSignature,conRefSignature,conCommentApprobation,conRefApprobation,conCommentNotification,conRefNotification,
		conFichierRecepProvisoire,conCommentRecepProvisoire,conFichierRecepDefinitive,conCommentRecepDefinitive,conFichierOrdreDemarrage,
		conCommentOrdreDemarrage,conrefAttributionprovisoire,concommentaireAttributionprovisoire,conrefAttributiondefinitive,concommentaireAttributiondefinitive,
		constatus,nummatriculation,concommentairesdmdmat,concommentairesmatriculation,concsituation;
		private int immatriculation,delai;
		private SygLots lot;
		private SygService service;
		private SygFournisseur fournisseur;
		private SygModepassation modepassation;
		private SygTypesmarches typemarche;
		private String nationnalite,fichierimmatricule,fichierjustificatif;
    
	
    	public SygContrats() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "conid",  length = 255)
        public Long getConID() {
			return this.conID;
		}
		public void setConID(Long conID) {
			this.conID = conID;
		}

	

	
		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "pli_id")
    	public SygPlisouvertures getPlis() {
			return plis;
		}
    	public void setPlis(SygPlisouvertures plis) {
			this.plis = plis;
		}




    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
		public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	@Column(name = "montant")
		public BigDecimal getMontant() {
			return montant;
		}
		public void setMontant(BigDecimal montant) {
			this.montant = montant;
		}



		@Temporal(TemporalType.DATE)
		@Column(name = "condatesignature", length = 7)
		public Date getConDateSignature() {
			return conDateSignature;
		}
		public void setConDateSignature(Date conDateSignature) {
			this.conDateSignature = conDateSignature;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "condateapprobation", length = 7)
		public Date getConDateApprobation() {
			return conDateApprobation;
		}
    	public void setConDateApprobation(Date conDateApprobation) {
			this.conDateApprobation = conDateApprobation;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "condatenotification", length = 7)
		public Date getConDateNotification() {
			return conDateNotification;
		}
    	public void setConDateNotification(Date conDateNotification) {
			this.conDateNotification = conDateNotification;
		}


    	@Column(name = "concommentsignature", length = 255)
		public String getConCommentSignature() {
			return conCommentSignature;
		}
    	public void setConCommentSignature(String conCommentSignature) {
			this.conCommentSignature = conCommentSignature;
		}


    	@Column(name = "conrefsignature", length = 255)
		public String getConRefSignature() {
			return conRefSignature;
		}
    	public void setConRefSignature(String conRefSignature) {
			this.conRefSignature = conRefSignature;
		}


    	@Column(name = "concommentapprobation", length = 255)
		public String getConCommentApprobation() {
			return conCommentApprobation;
		}
 		public void setConCommentApprobation(String conCommentApprobation) {
			this.conCommentApprobation = conCommentApprobation;
		}


 		@Column(name = "conrefapprobation", length = 255)
		public String getConRefApprobation() {
			return conRefApprobation;
		}
    	public void setConRefApprobation(String conRefApprobation) {
			this.conRefApprobation = conRefApprobation;
		}


    	@Column(name = "concommentnotification", length = 255)
		public String getConCommentNotification() {
			return conCommentNotification;
		}
    	public void setConCommentNotification(String conCommentNotification) {
			this.conCommentNotification = conCommentNotification;
		}


    	@Column(name = "conrefnotification", length = 255)
		public String getConRefNotification() {
			return conRefNotification;
		}
    	public void setConRefNotification(String conRefNotification) {
			this.conRefNotification = conRefNotification;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "condaterecepprovisoire", length = 7)
		public Date getConDateRecepProvisoire() {
			return conDateRecepProvisoire;
		}
    	public void setConDateRecepProvisoire(Date conDateRecepProvisoire) {
			this.conDateRecepProvisoire = conDateRecepProvisoire;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "condaterecepdefinitive", length = 7)
		public Date getConDateRecepDefinitive() {
			return conDateRecepDefinitive;
		}
    	public void setConDateRecepDefinitive(Date conDateRecepDefinitive) {
			this.conDateRecepDefinitive = conDateRecepDefinitive;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "condateordredemarrage", length = 7)
		public Date getConDateOrdreDemarrage() {
			return conDateOrdreDemarrage;
		}
    	public void setConDateOrdreDemarrage(Date conDateOrdreDemarrage) {
			this.conDateOrdreDemarrage = conDateOrdreDemarrage;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "condateattributionprovisoire", length = 7)
		public Date getCondateAttributionprovisoire() {
			return condateAttributionprovisoire;
		}
		public void setCondateAttributionprovisoire(Date condateAttributionprovisoire) {
			this.condateAttributionprovisoire = condateAttributionprovisoire;
		}

		
		@Column(name = "confichierrecepprovisoire", length = 255)
    	public String getConFichierRecepProvisoire() {
			return conFichierRecepProvisoire;
		}
    	public void setConFichierRecepProvisoire(String conFichierRecepProvisoire) {
			this.conFichierRecepProvisoire = conFichierRecepProvisoire;
		}


    	@Column(name = "concommentrecepprovisoire", length = 255)
		public String getConCommentRecepProvisoire() {
			return conCommentRecepProvisoire;
		}
    	public void setConCommentRecepProvisoire(String conCommentRecepProvisoire) {
			this.conCommentRecepProvisoire = conCommentRecepProvisoire;
		}


    	@Column(name = "confichierrecepdefinitive", length = 255)
		public String getConFichierRecepDefinitive() {
			return conFichierRecepDefinitive;
		}
    	public void setConFichierRecepDefinitive(String conFichierRecepDefinitive) {
			this.conFichierRecepDefinitive = conFichierRecepDefinitive;
		}


    	@Column(name = "concommentrecepdefinitive", length = 255)
		public String getConCommentRecepDefinitive() {
			return conCommentRecepDefinitive;
		}
    	public void setConCommentRecepDefinitive(String conCommentRecepDefinitive) {
			this.conCommentRecepDefinitive = conCommentRecepDefinitive;
		}


    	@Column(name = "confichierordredemarrage", length = 255)
		public String getConFichierOrdreDemarrage() {
			return conFichierOrdreDemarrage;
		}
    	public void setConFichierOrdreDemarrage(String conFichierOrdreDemarrage) {
			this.conFichierOrdreDemarrage = conFichierOrdreDemarrage;
		}


    	@Column(name = "concommentordredemarrage", length = 255)
		public String getConCommentOrdreDemarrage() {
			return conCommentOrdreDemarrage;
		}
    	public void setConCommentOrdreDemarrage(String conCommentOrdreDemarrage) {
			this.conCommentOrdreDemarrage = conCommentOrdreDemarrage;
		}


    	@Column(name = "conrefattributionprovisoire", length = 255)
		public String getConrefAttributionprovisoire() {
			return conrefAttributionprovisoire;
		}
    	public void setConrefAttributionprovisoire(String conrefAttributionprovisoire) {
			this.conrefAttributionprovisoire = conrefAttributionprovisoire;
		}


    	@Column(name = "concommentaireattributionprovisoire", length = 255)
		public String getConcommentaireAttributionprovisoire() {
			return concommentaireAttributionprovisoire;
		}
    	public void setConcommentaireAttributionprovisoire(
				String concommentaireAttributionprovisoire) {
			this.concommentaireAttributionprovisoire = concommentaireAttributionprovisoire;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "condateattributiondefinitive", length = 7)
		public Date getCondateAttributiondefinitive() {
			return condateAttributiondefinitive;
		}
    	public void setCondateAttributiondefinitive(Date condateAttributiondefinitive) {
			this.condateAttributiondefinitive = condateAttributiondefinitive;
		}


    	@Column(name = "conrefattributiondefinitive", length = 255)
		public String getConrefAttributiondefinitive() {
			return conrefAttributiondefinitive;
		}
    	public void setConrefAttributiondefinitive(String conrefAttributiondefinitive) {
			this.conrefAttributiondefinitive = conrefAttributiondefinitive;
		}


    	@Column(name = "concommentaireattributiondefinitive", length = 255)
		public String getConcommentaireAttributiondefinitive() {
			return concommentaireAttributiondefinitive;
		}
		public void setConcommentaireAttributiondefinitive(
				String concommentaireAttributiondefinitive) {
			this.concommentaireAttributiondefinitive = concommentaireAttributiondefinitive;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "condatepaiement", length = 7)
		public Date getCondatepaiement() {
			return condatepaiement;
		}
    	public void setCondatepaiement(Date condatepaiement) {
			this.condatepaiement = condatepaiement;
		}


    	@Column(name = "constatus", length = 10)
		public String getConstatus() {
			return constatus;
		}
    	public void setConstatus(String constatus) {
			this.constatus = constatus;
		}


    	@Column(name = "montantverse")
		public BigDecimal getMontantverse() {
			return montantverse;
		}
    	public void setMontantverse(BigDecimal montantverse) {
			this.montantverse = montantverse;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "datedemandeimmatriculation", length = 7)
		public Date getDatedemandeimmatriculation() {
			return datedemandeimmatriculation;
		}
    	public void setDatedemandeimmatriculation(Date datedemandeimmatriculation) {
			this.datedemandeimmatriculation = datedemandeimmatriculation;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "dateimmatriculation", length = 7)
		public Date getDateimmatriculation() {
			return dateimmatriculation;
		}
    	public void setDateimmatriculation(Date dateimmatriculation) {
			this.dateimmatriculation = dateimmatriculation;
		}


    	
		@Column(name = "nummatriculation", length = 50)
		public String getNummatriculation() {
			return nummatriculation;
		}
    	public void setNummatriculation(String nummatriculation) {
			this.nummatriculation = nummatriculation;
		}


    	
		@Column(name = "concommentairesdmdmat", length = 255)
		public String getConcommentairesdmdmat() {
			return concommentairesdmdmat;
		}
    	public void setConcommentairesdmdmat(String concommentairesdmdmat) {
			this.concommentairesdmdmat = concommentairesdmdmat;
		}


    	
		@Column(name = "concommentairesmatriculation", length =255)
		public String getConcommentairesmatriculation() {
			return concommentairesmatriculation;
		}
    	public void setConcommentairesmatriculation(String concommentairesmatriculation) {
			this.concommentairesmatriculation = concommentairesmatriculation;
		}


    	@Column(name = "immatriculation", length =1)
		public int getImmatriculation() {
			return immatriculation;
		}
    	public void setImmatriculation(int immatriculation) {
			this.immatriculation = immatriculation;
		}


    	@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "lot")
		public SygLots getLot() {
			return lot;
		}
    	public void setLot(SygLots lot) {
			this.lot = lot;
		}


    	@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "service_id")
    	public SygService getService() {
			return service;
		}
    	public void setService(SygService service) {
			this.service = service;
		}


    	@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "fournisseurs_id")
		public SygFournisseur getFournisseur() {
			return fournisseur;
		}
		public void setFournisseur(SygFournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}


		@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "modepassation_id")
		public SygModepassation getModepassation() {
			return modepassation;
		}
		public void setModepassation(SygModepassation modepassation) {
			this.modepassation = modepassation;
		}


		@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "typemarche_id")
		public SygTypesmarches getTypemarche() {
			return typemarche;
		}
    	public void setTypemarche(SygTypesmarches typemarche) {
			this.typemarche = typemarche;
		}


    	@Column(name = "concsituation", length =50)
		public String getConcsituation() {
			return concsituation;
		}
    	public void setConcsituation(String concsituation) {
			this.concsituation = concsituation;
		}


    	@Column(name = "nationnalite", length =100)
		public String getNationnalite() {
			return nationnalite;
		}
		public void setNationnalite(String nationnalite) {
			this.nationnalite = nationnalite;
		}


		@Column(name = "delai", length =20)
		public int getDelai() {
			return delai;
		}
    	public void setDelai(int delai) {
			this.delai = delai;
		}


    	@Column(name = "fichierimmatricule", length =100)
		public String getFichierimmatricule() {
			return fichierimmatricule;
		}
    	public void setFichierimmatricule(String fichierimmatricule) {
			this.fichierimmatricule = fichierimmatricule;
		}


    	@Column(name = "fichierjustificatif", length =100)
		public String getFichierjustificatif() {
			return fichierjustificatif;
		}
    	public void setFichierjustificatif(String fichierjustificatif) {
			this.fichierjustificatif = fichierjustificatif;
		}
    	
    	    	
    	
	}

