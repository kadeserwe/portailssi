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
	@Table(name = "pmb_dossiers")
	public class SygDossiers  implements java.io.Serializable {
		
  		private Long dosID;
		private String dosLieuDepotDossier, dosReference,dosAdresseRetrait,dosConditionAcquistion,dosAllotissement,dosLotDivisible,
		dosCommentaireMiseValidation,dosCommentaireValidation,dosFichierValidation,dosCommentairePublicationProvisoire,dosCommentairesPublicationDefinitive,
		dosCommentairePublication,dosCommentSignature,dosRefSignature,dosCommentApprobation,dosRefApprobation,dosCommentNotification,dosRefNotification,
		dosFichierRecepProvisoire,dosCommentRecepProvisoire,dosFichierRecepDefinitive,dosCommentRecepDefinitive,dosFichierOrdreDemarrage,dosCommentOrdreDemarrage,
		dosRefAttributionProvisoire,dosRefAttributionDefinitive,dosCommentaireAttributionProvisoire,dosCommentaireAttributionDefinitive,dosDescriptif,
		dosNomREsp,dosPrenomResp,dosFonctionResp,dosTelResp,dosMailResp,dosLieuOuvertureDesPlis,dosFichierEvaluation,commentaireDelaiTechniquecouverture,
		texte_html,dosBordereau,unitedelaicomplementpieces,dosLettreInvitationDrp,dosBonDeCommandeDrp,dosFichierBonDeCommandeDrp,dosCommentaireMiseValidationPrequalif,
		dosCommentaireValidationPrequalif,dosFichierValidationPrequalif,dosBordereauPrequalif,dosFichierMiseValidationPrequalif,dosFichier,dosDownloadFichier,
		dosTextAvisAttributionprovisoire,dosTextAvisAttributiondefinitive,dosCommentaireEnvoiDp,dosObjetTextAvisAttributionprovisoire,dosObjetTextAvisAttributiondefinitif,
		dosCommentaireLettreInvitation,dosBudgetAnomalie,dosfichierSignature,dosCommentaireAttestationcredit,dosAchevement,commentaireDelaiTechnique,dosIncidents,doscommentairesdemandepublication,
		dosfichierdemandepublication,doslieuacquisitiondao,dosmatricule,doscommentdemandeapprobation;
		private Date dosDateDebutRetrait,dosDateLimiteDepot,dosHeurelimitedepot,dosDateCreation,dosDateMiseValidation,dosDateValidation,dosDateRejet,
		dosDatePublicationProvisoire,dosDatePublicationDefinitive,dosDatePublication,dosDateSignature,dosDateApprobation,dosDateNotification,
		dosDateRecepProvisoire,dosDateRecepDefinitive,dosDateOrdreDemarrage,dosDateAttributionProvisoire,dosDateAttributionDefinitive,
		dosDateOuvertueDesplis,dosHeureOuvertureDesPlis,dateRemiseDossierTechnique,dateLimiteDossierTechnique,dosDateBonDeCommandeDrp,
		dosDateMiseValidationPrequalif,dosDateRejetPrequalif,dosDateValidationPrequalif,dosDateMiseValidationSignature,dosDateValidationSignature,dosDateRejetSignature,
		dosDateEnvoiDp,dosdateValidAttestationcredit,dosdateValidAttestationcreditA,dosdatenonobjectionptf,dosdateinvitation,dosDateMiseValidationattribution,dosdatedemandepublication,
		dosdatedemandeapprobation,dosdateretourapprobation;
		private int dosNombreLots,dosEtatValidation,etatPrequalif,valeurdelaicomplementpieces,dosNatureMarche,dosEtatValidationPrequalif,dosSoumission,
		dosNoteEliminatoireAmi,dosponderationtechnique,dosponderationfinanciere;
		
		
		private SygAutoriteContractante autorite;
		private SygAppelsOffres appel;
		private BigDecimal ponderationtechnique,ponderationfinanciere,dosmontantdao,dosmontantgarantie,dosmontant;
		private SygRealisations realisation;
		private SygNatureprix natureprix;
		private SygMonnaieoffre devise;
		private Integer telechargerdao=0;
		
		


		public SygDossiers() {
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "dosid",  length = 255)
		public Long getDosID() {
			return this.dosID;
		}
		public void setDosID(Long dosID) {
			this.dosID = dosID;
		}

		@Column(name = "doslieudepotdossier",  length = 255)
		public String getDosLieuDepotDossier() {
			return this.dosLieuDepotDossier;
		}

		public void setDosLieuDepotDossier(String dosLieuDepotDossier) {
			this.dosLieuDepotDossier = dosLieuDepotDossier;
		}

		@Column(name = "dosreference",  length = 100)
		public String getDosReference() {
			return dosReference;
		}
		public void setDosReference(String dosReference) {
			this.dosReference = dosReference;
		}

		@Column(name = "dosadresseretrait")
		public String getDosAdresseRetrait() {
			return dosAdresseRetrait;
		}
    	public void setDosAdresseRetrait(String dosAdresseRetrait) {
			this.dosAdresseRetrait = dosAdresseRetrait;
		}


    	@Column(name = "dosconditionacquistion")
		public String getDosConditionAcquistion() {
			return dosConditionAcquistion;
		}
    	public void setDosConditionAcquistion(String dosConditionAcquistion) {
			this.dosConditionAcquistion = dosConditionAcquistion;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatedebutretrait", length = 7)
		public Date getDosDateDebutRetrait() {
			return dosDateDebutRetrait;
		}
    	public void setDosDateDebutRetrait(Date dosDateDebutRetrait) {
			this.dosDateDebutRetrait = dosDateDebutRetrait;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatelimitedepot", length = 7)
		public Date getDosDateLimiteDepot() {
			return dosDateLimiteDepot;
		}
    	public void setDosDateLimiteDepot(Date dosDateLimiteDepot) {
			this.dosDateLimiteDepot = dosDateLimiteDepot;
		}

    	@Temporal(TemporalType.TIME)
    	@Column(name = "dosheurelimitedepot", length = 7)
		public Date getDosHeurelimitedepot() {
			return dosHeurelimitedepot;
		}
    	public void setDosHeurelimitedepot(Date dosHeurelimitedepot) {
			this.dosHeurelimitedepot = dosHeurelimitedepot;
		}


    	@Column(name = "dosallotissement", length = 100)
		public String getDosAllotissement() {
			return dosAllotissement;
		}
    	public void setDosAllotissement(String dosAllotissement) {
			this.dosAllotissement = dosAllotissement;
		}

		
    	@Column(name = "doslotdivisible", length = 3)
		public String getDosLotDivisible() {
			return dosLotDivisible;
		}
    	public void setDosLotDivisible(String dosLotDivisible) {
			this.dosLotDivisible = dosLotDivisible;
		}

    	
    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatecreation", length = 7)
		public Date getDosDateCreation() {
			return dosDateCreation;
		}
		public void setDosDateCreation(Date dosDateCreation) {
			this.dosDateCreation = dosDateCreation;
		}


		@Column(name = "dosnombrelots")
		public int getDosNombreLots() {
			return dosNombreLots;
		}
    	public void setDosNombreLots(int dosNombreLots) {
			this.dosNombreLots = dosNombreLots;
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
    	@JoinColumn(name = "appelsoffres_id")
		public SygAppelsOffres getAppel() {
			return appel;
		}
    	public void setAppel(SygAppelsOffres appel) {
			this.appel = appel;
		}


    	@Column(name = "doscommentairemisevalidation")
		public String getDosCommentaireMiseValidation() {
			return dosCommentaireMiseValidation;
		}
    	public void setDosCommentaireMiseValidation(String dosCommentaireMiseValidation) {
			this.dosCommentaireMiseValidation = dosCommentaireMiseValidation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatemisevalidation", length = 7)
		public Date getDosDateMiseValidation() {
			return dosDateMiseValidation;
		}
		public void setDosDateMiseValidation(Date dosDateMiseValidation) {
			this.dosDateMiseValidation = dosDateMiseValidation;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatevalidation", length = 7)
		public Date getDosDateValidation() {
			return dosDateValidation;
		}
    	public void setDosDateValidation(Date dosDateValidation) {
			this.dosDateValidation = dosDateValidation;
		}

    	@Column(name = "doscommentairevalidation")
		public String getDosCommentaireValidation() {
			return dosCommentaireValidation;
		}
    	public void setDosCommentaireValidation(String dosCommentaireValidation) {
			this.dosCommentaireValidation = dosCommentaireValidation;
		}


    	
    	@Column(name = "dosfichiervalidation")
		public String getDosFichierValidation() {
			return dosFichierValidation;
		}
    	public void setDosFichierValidation(String dosFichierValidation) {
			this.dosFichierValidation = dosFichierValidation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdaterejet", length = 7)
		public Date getDosDateRejet() {
			return dosDateRejet;
		}
    	public void setDosDateRejet(Date dosDateRejet) {
			this.dosDateRejet = dosDateRejet;
		}


    	@Column(name = "doscommentairepublicationprovisoire")
		public String getDosCommentairePublicationProvisoire() {
			return dosCommentairePublicationProvisoire;
		}


		public void setDosCommentairePublicationProvisoire(
				String dosCommentairePublicationProvisoire) {
			this.dosCommentairePublicationProvisoire = dosCommentairePublicationProvisoire;
		}


		@Column(name = "doscommentairespublicationdefinitive")
		public String getDosCommentairesPublicationDefinitive() {
			return dosCommentairesPublicationDefinitive;
		}

		public void setDosCommentairesPublicationDefinitive(
				String dosCommentairesPublicationDefinitive) {
			this.dosCommentairesPublicationDefinitive = dosCommentairesPublicationDefinitive;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatepublicationprovisoire", length = 7)
		public Date getDosDatePublicationProvisoire() {
			return dosDatePublicationProvisoire;
		}
    	public void setDosDatePublicationProvisoire(Date dosDatePublicationProvisoire) {
			this.dosDatePublicationProvisoire = dosDatePublicationProvisoire;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatepublicationdefinitive", length = 7)
		public Date getDosDatePublicationDefinitive() {
			return dosDatePublicationDefinitive;
		}
    	public void setDosDatePublicationDefinitive(Date dosDatePublicationDefinitive) {
			this.dosDatePublicationDefinitive = dosDatePublicationDefinitive;
		}

    	@Column(name = "doscommentairepublication")
		public String getDosCommentairePublication() {
			return dosCommentairePublication;
		}
    	public void setDosCommentairePublication(String dosCommentairePublication) {
			this.dosCommentairePublication = dosCommentairePublication;
		}

    	@Column(name = "doscommentsignature")
		public String getDosCommentSignature() {
			return dosCommentSignature;
		}
     	public void setDosCommentSignature(String dosCommentSignature) {
			this.dosCommentSignature = dosCommentSignature;
		}

     	@Column(name = "dosrefsignature")
		public String getDosRefSignature() {
			return dosRefSignature;
		}
    	public void setDosRefSignature(String dosRefSignature) {
			this.dosRefSignature = dosRefSignature;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatepublication", length = 7)
		public Date getDosDatePublication() {
			return dosDatePublication;
		}
    	public void setDosDatePublication(Date dosDatePublication) {
			this.dosDatePublication = dosDatePublication;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatesignature", length = 7)
		public Date getDosDateSignature() {
			return dosDateSignature;
		}
    	public void setDosDateSignature(Date dosDateSignature) {
			this.dosDateSignature = dosDateSignature;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdateapprobation", length = 7)
		public Date getDosDateApprobation() {
			return dosDateApprobation;
		}

    	public void setDosDateApprobation(Date dosDateApprobation) {
			this.dosDateApprobation = dosDateApprobation;
		}

    	@Column(name = "doscommentapprobation")
		public String getDosCommentApprobation() {
			return dosCommentApprobation;
		}
    	public void setDosCommentApprobation(String dosCommentApprobation) {
			this.dosCommentApprobation = dosCommentApprobation;
		}

    	@Column(name = "dosrefapprobation")
		public String getDosRefApprobation() {
			return dosRefApprobation;
		}
    	public void setDosRefApprobation(String dosRefApprobation) {
			this.dosRefApprobation = dosRefApprobation;
		}

    	@Column(name = "doscommentnotification")
		public String getDosCommentNotification() {
			return dosCommentNotification;
		}
    	public void setDosCommentNotification(String dosCommentNotification) {
			this.dosCommentNotification = dosCommentNotification;
		}

    	@Column(name = "dosrefnotification")
		public String getDosRefNotification() {
			return dosRefNotification;
		}
    	public void setDosRefNotification(String dosRefNotification) {
			this.dosRefNotification = dosRefNotification;
		}

    	@Column(name = "dosfichierrecepprovisoire")
		public String getDosFichierRecepProvisoire() {
			return dosFichierRecepProvisoire;
		}
    	public void setDosFichierRecepProvisoire(String dosFichierRecepProvisoire) {
			this.dosFichierRecepProvisoire = dosFichierRecepProvisoire;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdatenotification", length = 7)
		public Date getDosDateNotification() {
			return dosDateNotification;
		}
    	public void setDosDateNotification(Date dosDateNotification) {
			this.dosDateNotification = dosDateNotification;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdaterecepprovisoire", length = 7)
		public Date getDosDateRecepProvisoire() {
			return dosDateRecepProvisoire;
		}
    	public void setDosDateRecepProvisoire(Date dosDateRecepProvisoire) {
			this.dosDateRecepProvisoire = dosDateRecepProvisoire;
		}

    	@Column(name = "doscommentrecepprovisoire")
		public String getDosCommentRecepProvisoire() {
			return dosCommentRecepProvisoire;
		}
    	public void setDosCommentRecepProvisoire(String dosCommentRecepProvisoire) {
			this.dosCommentRecepProvisoire = dosCommentRecepProvisoire;
		}

    	@Column(name = "dosfichierrecepdefinitive")
		public String getDosFichierRecepDefinitive() {
			return dosFichierRecepDefinitive;
		}
 		public void setDosFichierRecepDefinitive(String dosFichierRecepDefinitive) {
			this.dosFichierRecepDefinitive = dosFichierRecepDefinitive;
		}

 		@Column(name = "doscommentrecepdefinitive")
		public String getDosCommentRecepDefinitive() {
			return dosCommentRecepDefinitive;
		}
    	public void setDosCommentRecepDefinitive(String dosCommentRecepDefinitive) {
			this.dosCommentRecepDefinitive = dosCommentRecepDefinitive;
		}

    	@Column(name = "dosfichierordredemarrage")
		public String getDosFichierOrdreDemarrage() {
			return dosFichierOrdreDemarrage;
		}
    	public void setDosFichierOrdreDemarrage(String dosFichierOrdreDemarrage) {
			this.dosFichierOrdreDemarrage = dosFichierOrdreDemarrage;
		}

    	@Column(name = "doscommentordredemarrage")
		public String getDosCommentOrdreDemarrage() {
			return dosCommentOrdreDemarrage;
		}
    	public void setDosCommentOrdreDemarrage(String dosCommentOrdreDemarrage) {
			this.dosCommentOrdreDemarrage = dosCommentOrdreDemarrage;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdaterecepdefinitive", length = 7)
		public Date getDosDateRecepDefinitive() {
			return dosDateRecepDefinitive;
		}
    	public void setDosDateRecepDefinitive(Date dosDateRecepDefinitive) {
			this.dosDateRecepDefinitive = dosDateRecepDefinitive;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdateordredemarrage", length = 7)
		public Date getDosDateOrdreDemarrage() {
			return dosDateOrdreDemarrage;
		}
    	public void setDosDateOrdreDemarrage(Date dosDateOrdreDemarrage) {
			this.dosDateOrdreDemarrage = dosDateOrdreDemarrage;
		}

    	@Column(name = "dosrefattributionprovisoire")
		public String getDosRefAttributionProvisoire() {
			return dosRefAttributionProvisoire;
		}
    	public void setDosRefAttributionProvisoire(String dosRefAttributionProvisoire) {
			this.dosRefAttributionProvisoire = dosRefAttributionProvisoire;
		}

    	@Column(name = "dosrefattributiondefinitive")
		public String getDosRefAttributionDefinitive() {
			return dosRefAttributionDefinitive;
		}
    	public void setDosRefAttributionDefinitive(String dosRefAttributionDefinitive) {
			this.dosRefAttributionDefinitive = dosRefAttributionDefinitive;
		}

    	@Column(name = "doscommentaireattributionprovisoire")
		public String getDosCommentaireAttributionProvisoire() {
			return dosCommentaireAttributionProvisoire;
		}
		public void setDosCommentaireAttributionProvisoire(
				String dosCommentaireAttributionProvisoire) {
			this.dosCommentaireAttributionProvisoire = dosCommentaireAttributionProvisoire;
		}

		@Column(name = "doscommentaireattributiondefinitive")
		public String getDosCommentaireAttributionDefinitive() {
			return dosCommentaireAttributionDefinitive;
		}
    	public void setDosCommentaireAttributionDefinitive(
				String dosCommentaireAttributionDefinitive) {
			this.dosCommentaireAttributionDefinitive = dosCommentaireAttributionDefinitive;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdateattributionprovisoire", length = 7)
		public Date getDosDateAttributionProvisoire() {
			return dosDateAttributionProvisoire;
		}
    	public void setDosDateAttributionProvisoire(Date dosDateAttributionProvisoire) {
			this.dosDateAttributionProvisoire = dosDateAttributionProvisoire;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdateattributiondefinitive", length = 7)
		public Date getDosDateAttributionDefinitive() {
			return dosDateAttributionDefinitive;
		}
		public void setDosDateAttributionDefinitive(Date dosDateAttributionDefinitive) {
			this.dosDateAttributionDefinitive = dosDateAttributionDefinitive;
		}

		@Column(name = "ponderationtechnique")
		public BigDecimal getPonderationtechnique() {
			return ponderationtechnique;
		}
    	public void setPonderationtechnique(BigDecimal ponderationtechnique) {
			this.ponderationtechnique = ponderationtechnique;
		}

    	@Column(name = "ponderationfinanciere")
		public BigDecimal getPonderationfinanciere() {
			return ponderationfinanciere;
		}
    	public void setPonderationfinanciere(BigDecimal ponderationfinanciere) {
			this.ponderationfinanciere = ponderationfinanciere;
		}

    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "plan_id")
    	public SygRealisations getRealisation() {
			return realisation;
		}
    	public void setRealisation(SygRealisations realisation) {
			this.realisation = realisation;
		}

    	@Column(name = "dosdescriptif")
		public String getDosDescriptif() {
			return dosDescriptif;
		}
    	public void setDosDescriptif(String dosDescriptif) {
			this.dosDescriptif = dosDescriptif;
		}

    	@Column(name = "dosnomresp")
		public String getDosNomREsp() {
			return dosNomREsp;
		}
    	public void setDosNomREsp(String dosNomREsp) {
			this.dosNomREsp = dosNomREsp;
		}

    	@Column(name = "dosprenomresp")
		public String getDosPrenomResp() {
			return dosPrenomResp;
		}
		public void setDosPrenomResp(String dosPrenomResp) {
			this.dosPrenomResp = dosPrenomResp;
		}

		@Column(name = "dosfonctionresp")
		public String getDosFonctionResp() {
			return dosFonctionResp;
		}
    	public void setDosFonctionResp(String dosFonctionResp) {
			this.dosFonctionResp = dosFonctionResp;
		}

    	@Column(name = "dostelresp")
		public String getDosTelResp() {
			return dosTelResp;
		}
     	public void setDosTelResp(String dosTelResp) {
			this.dosTelResp = dosTelResp;
		}

     	@Column(name = "dosmailresp")
		public String getDosMailResp() {
			return dosMailResp;
		}
    	public void setDosMailResp(String dosMailResp) {
			this.dosMailResp = dosMailResp;
		}

    	@Column(name = "doslieuouverturedesplis")
		public String getDosLieuOuvertureDesPlis() {
			return dosLieuOuvertureDesPlis;
		}
    	public void setDosLieuOuvertureDesPlis(String dosLieuOuvertureDesPlis) {
			this.dosLieuOuvertureDesPlis = dosLieuOuvertureDesPlis;
		}

    	@Temporal(TemporalType.DATE)
    	@Column(name = "dosdateouvertuedesplis", length = 7)
		public Date getDosDateOuvertueDesplis() {
			return dosDateOuvertueDesplis;
		}
    	public void setDosDateOuvertueDesplis(Date dosDateOuvertueDesplis) {
			this.dosDateOuvertueDesplis = dosDateOuvertueDesplis;
		}

    	@Temporal(TemporalType.TIME  )
    	@Column(name = "dosheureouverturedesplis", length = 7)
		public Date getDosHeureOuvertureDesPlis() {
			return dosHeureOuvertureDesPlis;
		}
    	public void setDosHeureOuvertureDesPlis(Date dosHeureOuvertureDesPlis) {
			this.dosHeureOuvertureDesPlis = dosHeureOuvertureDesPlis;
		}

    	@Column(name = "dosfichierevaluation")
		public String getDosFichierEvaluation() {
			return dosFichierEvaluation;
		}
    	public void setDosFichierEvaluation(String dosFichierEvaluation) {
			this.dosFichierEvaluation = dosFichierEvaluation;
		}

    	@Column(name = "commentairedelaitechniquecouverture")
		public String getCommentaireDelaiTechniquecouverture() {
			return commentaireDelaiTechniquecouverture;
		}
		public void setCommentaireDelaiTechniquecouverture(
				String commentaireDelaiTechniquecouverture) {
			this.commentaireDelaiTechniquecouverture = commentaireDelaiTechniquecouverture;
		}

		@Column(name = "texte_html")
		public String getTexte_html() {
			return texte_html;
		}
    	public void setTexte_html(String texte_html) {
			this.texte_html = texte_html;
		}

    	@Column(name = "dosbordereau")
		public String getDosBordereau() {
			return dosBordereau;
		}
		public void setDosBordereau(String dosBordereau) {
			this.dosBordereau = dosBordereau;
		}

		@Temporal(TemporalType.DATE  )
    	@Column(name = "dateremisedossiertechnique", length = 7)
		public Date getDateRemiseDossierTechnique() {
			return dateRemiseDossierTechnique;
		}
    	public void setDateRemiseDossierTechnique(Date dateRemiseDossierTechnique) {
			this.dateRemiseDossierTechnique = dateRemiseDossierTechnique;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "datelimitedossiertechnique", length = 7)
		public Date getDateLimiteDossierTechnique() {
			return dateLimiteDossierTechnique;
		}
    	public void setDateLimiteDossierTechnique(Date dateLimiteDossierTechnique) {
			this.dateLimiteDossierTechnique = dateLimiteDossierTechnique;
		}

    	@Column(name = "dosetatvalidation")
		public int getDosEtatValidation() {
			return dosEtatValidation;
		}
		public void setDosEtatValidation(int dosEtatValidation) {
			this.dosEtatValidation = dosEtatValidation;
		}

		@Column(name = "etatprequalif")
		public int getEtatPrequalif() {
			return etatPrequalif;
		}
    	public void setEtatPrequalif(int etatPrequalif) {
			this.etatPrequalif = etatPrequalif;
		}

    	@Column(name = "valeurdelaicomplementpieces")
		public int getValeurdelaicomplementpieces() {
			return valeurdelaicomplementpieces;
		}
        public void setValeurdelaicomplementpieces(int valeurdelaicomplementpieces) {
			this.valeurdelaicomplementpieces = valeurdelaicomplementpieces;
		}
    	
        @Column(name = "unitedelaicomplementpieces")
        public String getUnitedelaicomplementpieces() {
			return unitedelaicomplementpieces;
		}
    	public void setUnitedelaicomplementpieces(String unitedelaicomplementpieces) {
			this.unitedelaicomplementpieces = unitedelaicomplementpieces;
		}

    	@Column(name = "doslettreinvitationdrp")
		public String getDosLettreInvitationDrp() {
			return dosLettreInvitationDrp;
		}
    	public void setDosLettreInvitationDrp(String dosLettreInvitationDrp) {
			this.dosLettreInvitationDrp = dosLettreInvitationDrp;
		}

    	@Column(name = "dosbondecommandedrp")
		public String getDosBonDeCommandeDrp() {
			return dosBonDeCommandeDrp;
		}
    	public void setDosBonDeCommandeDrp(String dosBonDeCommandeDrp) {
			this.dosBonDeCommandeDrp = dosBonDeCommandeDrp;
		}

    	@Column(name = "dosfichierbondecommandedrp")
		public String getDosFichierBonDeCommandeDrp() {
			return dosFichierBonDeCommandeDrp;
		}
    	public void setDosFichierBonDeCommandeDrp(String dosFichierBonDeCommandeDrp) {
			this.dosFichierBonDeCommandeDrp = dosFichierBonDeCommandeDrp;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatebondecommandedrp", length = 7)
		public Date getDosDateBonDeCommandeDrp() {
			return dosDateBonDeCommandeDrp;
		}
     	public void setDosDateBonDeCommandeDrp(Date dosDateBonDeCommandeDrp) {
			this.dosDateBonDeCommandeDrp = dosDateBonDeCommandeDrp;
		}

     	@Column(name = "dosnaturemarche")
		public int getDosNatureMarche() {
			return dosNatureMarche;
		}
    	public void setDosNatureMarche(int dosNatureMarche) {
			this.dosNatureMarche = dosNatureMarche;
		}

    	@Column(name = "doscommentairemisevalidationprequalif")
		public String getDosCommentaireMiseValidationPrequalif() {
			return dosCommentaireMiseValidationPrequalif;
		}
    	public void setDosCommentaireMiseValidationPrequalif(
				String dosCommentaireMiseValidationPrequalif) {
			this.dosCommentaireMiseValidationPrequalif = dosCommentaireMiseValidationPrequalif;
		}

    	@Column(name = "doscommentairevalidationprequalif")
		public String getDosCommentaireValidationPrequalif() {
			return dosCommentaireValidationPrequalif;
		}
    	public void setDosCommentaireValidationPrequalif(
				String dosCommentaireValidationPrequalif) {
			this.dosCommentaireValidationPrequalif = dosCommentaireValidationPrequalif;
		}

    	@Column(name = "dosbordereauprequalif")
		public String getDosBordereauPrequalif() {
			return dosBordereauPrequalif;
		}
    	public void setDosBordereauPrequalif(String dosBordereauPrequalif) {
			this.dosBordereauPrequalif = dosBordereauPrequalif;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatemisevalidationprequalif", length = 7)
		public Date getDosDateMiseValidationPrequalif() {
			return dosDateMiseValidationPrequalif;
		}
    	public void setDosDateMiseValidationPrequalif(
				Date dosDateMiseValidationPrequalif) {
			this.dosDateMiseValidationPrequalif = dosDateMiseValidationPrequalif;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdaterejetprequalif", length = 7)
		public Date getDosDateRejetPrequalif() {
			return dosDateRejetPrequalif;
		}
    	public void setDosDateRejetPrequalif(Date dosDateRejetPrequalif) {
			this.dosDateRejetPrequalif = dosDateRejetPrequalif;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatevalidationprequalif", length = 7)
		public Date getDosDateValidationPrequalif() {
			return dosDateValidationPrequalif;
		}
		public void setDosDateValidationPrequalif(Date dosDateValidationPrequalif) {
			this.dosDateValidationPrequalif = dosDateValidationPrequalif;
		}

		@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatemisevalidationsignature", length = 7)
		public Date getDosDateMiseValidationSignature() {
			return dosDateMiseValidationSignature;
		}
    	public void setDosDateMiseValidationSignature(
				Date dosDateMiseValidationSignature) {
			this.dosDateMiseValidationSignature = dosDateMiseValidationSignature;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdaterejetsignature", length = 7)
		public Date getDosDateRejetSignature() {
			return dosDateRejetSignature;
		}
    	public void setDosDateRejetSignature(Date dosDateRejetSignature) {
			this.dosDateRejetSignature = dosDateRejetSignature;
		}

    	@Column(name = "dosfichiervalidationprequalif")
		public String getDosFichierValidationPrequalif() {
			return dosFichierValidationPrequalif;
		}
    	public void setDosFichierValidationPrequalif(
				String dosFichierValidationPrequalif) {
			this.dosFichierValidationPrequalif = dosFichierValidationPrequalif;
		}

    	@Column(name = "dosfichiermisevalidationprequalif")
		public String getDosFichierMiseValidationPrequalif() {
			return dosFichierMiseValidationPrequalif;
		}
    	public void setDosFichierMiseValidationPrequalif(
				String dosFichierMiseValidationPrequalif) {
			this.dosFichierMiseValidationPrequalif = dosFichierMiseValidationPrequalif;
		}

    	@Column(name = "dosfichier")
		public String getDosFichier() {
			return dosFichier;
		}
 		public void setDosFichier(String dosFichier) {
			this.dosFichier = dosFichier;
		}

 		@Column(name = "dosdownloadfichier")
		public String getDosDownloadFichier() {
			return dosDownloadFichier;
		}
    	public void setDosDownloadFichier(String dosDownloadFichier) {
			this.dosDownloadFichier = dosDownloadFichier;
		}

    	@Column(name = "dostextavisattributionprovisoire")
		public String getDosTextAvisAttributionprovisoire() {
			return dosTextAvisAttributionprovisoire;
		}
    	public void setDosTextAvisAttributionprovisoire(
				String dosTextAvisAttributionprovisoire) {
			this.dosTextAvisAttributionprovisoire = dosTextAvisAttributionprovisoire;
		}

    	@Column(name = "dostextavisattributiondefinitive")
		public String getDosTextAvisAttributiondefinitive() {
			return dosTextAvisAttributiondefinitive;
		}
    	public void setDosTextAvisAttributiondefinitive(
				String dosTextAvisAttributiondefinitive) {
			this.dosTextAvisAttributiondefinitive = dosTextAvisAttributiondefinitive;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatevalidationsignature", length = 7)
		public Date getDosDateValidationSignature() {
			return dosDateValidationSignature;
		}
    	public void setDosDateValidationSignature(Date dosDateValidationSignature) {
			this.dosDateValidationSignature = dosDateValidationSignature;
		}

    	@Column(name = "dosetatvalidationprequalif")
		public int getDosEtatValidationPrequalif() {
			return dosEtatValidationPrequalif;
		}
    	public void setDosEtatValidationPrequalif(int dosEtatValidationPrequalif) {
			this.dosEtatValidationPrequalif = dosEtatValidationPrequalif;
		}

    	@Column(name = "doscommentaireenvoidp")
		public String getDosCommentaireEnvoiDp() {
			return dosCommentaireEnvoiDp;
		}
    	public void setDosCommentaireEnvoiDp(String dosCommentaireEnvoiDp) {
			this.dosCommentaireEnvoiDp = dosCommentaireEnvoiDp;
		}

    	@Column(name = "dosobjettextavisattributionprovisoire")
		public String getDosObjetTextAvisAttributionprovisoire() {
			return dosObjetTextAvisAttributionprovisoire;
		}
    	public void setDosObjetTextAvisAttributionprovisoire(
				String dosObjetTextAvisAttributionprovisoire) {
			this.dosObjetTextAvisAttributionprovisoire = dosObjetTextAvisAttributionprovisoire;
		}

    	@Column(name = "dosobjettextavisattributiondefinitif")
		public String getDosObjetTextAvisAttributiondefinitif() {
			return dosObjetTextAvisAttributiondefinitif;
		}
     	public void setDosObjetTextAvisAttributiondefinitif(
				String dosObjetTextAvisAttributiondefinitif) {
			this.dosObjetTextAvisAttributiondefinitif = dosObjetTextAvisAttributiondefinitif;
		}

     	@Column(name = "doscommentairelettreinvitation")
		public String getDosCommentaireLettreInvitation() {
			return dosCommentaireLettreInvitation;
		}
        public void setDosCommentaireLettreInvitation(
				String dosCommentaireLettreInvitation) {
			this.dosCommentaireLettreInvitation = dosCommentaireLettreInvitation;
		}

        @Column(name = "dosbudgetanomalie")
		public String getDosBudgetAnomalie() {
			return dosBudgetAnomalie;
		}
    	public void setDosBudgetAnomalie(String dosBudgetAnomalie) {
			this.dosBudgetAnomalie = dosBudgetAnomalie;
		}

    	@Column(name = "dosfichiersignature")
		public String getDosfichierSignature() {
			return dosfichierSignature;
		}
    	public void setDosfichierSignature(String dosfichierSignature) {
			this.dosfichierSignature = dosfichierSignature;
		}

    	@Column(name = "doscommentaireattestationcredit")
		public String getDosCommentaireAttestationcredit() {
			return dosCommentaireAttestationcredit;
		}
    	public void setDosCommentaireAttestationcredit(
				String dosCommentaireAttestationcredit) {
			this.dosCommentaireAttestationcredit = dosCommentaireAttestationcredit;
		}

    	@Column(name = "dosachevement")
		public String getDosAchevement() {
			return dosAchevement;
		}
    	public void setDosAchevement(String dosAchevement) {
			this.dosAchevement = dosAchevement;
		}

    	@Column(name = "dossoumission")
		public int getDosSoumission() {
			return dosSoumission;
		}
    	public void setDosSoumission(int dosSoumission) {
			this.dosSoumission = dosSoumission;
		}

    	@Column(name = "dosnoteeliminatoireami")
		public int getDosNoteEliminatoireAmi() {
			return dosNoteEliminatoireAmi;
		}
    	public void setDosNoteEliminatoireAmi(int dosNoteEliminatoireAmi) {
			this.dosNoteEliminatoireAmi = dosNoteEliminatoireAmi;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdateenvoidp", length = 7)
		public Date getDosDateEnvoiDp() {
			return dosDateEnvoiDp;
		}
    	public void setDosDateEnvoiDp(Date dosDateEnvoiDp) {
			this.dosDateEnvoiDp = dosDateEnvoiDp;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatevalidattestationcredit", length = 7)
		public Date getDosdateValidAttestationcredit() {
			return dosdateValidAttestationcredit;
		}
    	public void setDosdateValidAttestationcredit(Date dosdateValidAttestationcredit) {
			this.dosdateValidAttestationcredit = dosdateValidAttestationcredit;
		}

    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatevalidattestationcredita", length = 7)
		public Date getDosdateValidAttestationcreditA() {
			return dosdateValidAttestationcreditA;
		}
    	public void setDosdateValidAttestationcreditA(
				Date dosdateValidAttestationcreditA) {
			this.dosdateValidAttestationcreditA = dosdateValidAttestationcreditA;
		}
    	
    	
    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "nat_natcode")
    	public SygNatureprix getNatureprix() {
			return natureprix;
		}
    	public void setNatureprix(SygNatureprix natureprix) {
			this.natureprix = natureprix;
		}


    	
    	@Column(name = "commentairedelaitechnique")
		public String getCommentaireDelaiTechnique() {
			return commentaireDelaiTechnique;
		}
    	public void setCommentaireDelaiTechnique(String commentaireDelaiTechnique) {
			this.commentaireDelaiTechnique = commentaireDelaiTechnique;
		}
    	
    	
    	@Column(name = "dosmontantdao")
    	public BigDecimal getDosmontantdao() {
			return dosmontantdao;
		}
    	public void setDosmontantdao(BigDecimal dosmontantdao) {
			this.dosmontantdao = dosmontantdao;
		}
    	
    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatenonobjectionptf", length = 7)
		public Date getDosdatenonobjectionptf() {
			return dosdatenonobjectionptf;
		}
     	public void setDosdatenonobjectionptf(Date dosdatenonobjectionptf) {
			this.dosdatenonobjectionptf = dosdatenonobjectionptf;
		}

     	@Column(name = "dosincidents")
		public String getDosIncidents() {
			return dosIncidents;
		}
    	public void setDosIncidents(String dosIncidents) {
			this.dosIncidents = dosIncidents;
		}

    	@Column(name = "dosponderationtechnique")
		public int getDosponderationtechnique() {
			return dosponderationtechnique;
		}
    	public void setDosponderationtechnique(int dosponderationtechnique) {
			this.dosponderationtechnique = dosponderationtechnique;
		}

    	@Column(name = "dosponderationfinanciere")
		public int getDosponderationfinanciere() {
			return dosponderationfinanciere;
		}
    	public void setDosponderationfinanciere(int dosponderationfinanciere) {
			this.dosponderationfinanciere = dosponderationfinanciere;
		}


    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdateinvitation", length = 7)
		public Date getDosdateinvitation() {
			return dosdateinvitation;
		}
     	public void setDosdateinvitation(Date dosdateinvitation) {
			this.dosdateinvitation = dosdateinvitation;
		}


     	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatemisevalidationattribution", length = 7)
		public Date getDosDateMiseValidationattribution() {
			return dosDateMiseValidationattribution;
		}
		public void setDosDateMiseValidationattribution(
				Date dosDateMiseValidationattribution) {
			this.dosDateMiseValidationattribution = dosDateMiseValidationattribution;
		}


		@Column(name = "dosmontantgarantie")
		public BigDecimal getDosmontantgarantie() {
			return dosmontantgarantie;
		}
    	public void setDosmontantgarantie(BigDecimal dosmontantgarantie) {
			this.dosmontantgarantie = dosmontantgarantie;
		}


    	@Column(name = "dosmontant")
		public BigDecimal getDosmontant() {
			return dosmontant;
		}
    	public void setDosmontant(BigDecimal dosmontant) {
			this.dosmontant = dosmontant;
		}


    	@Column(name = "doscommentairesdemandepublication")
		public String getDoscommentairesdemandepublication() {
			return doscommentairesdemandepublication;
		}
		public void setDoscommentairesdemandepublication(
				String doscommentairesdemandepublication) {
			this.doscommentairesdemandepublication = doscommentairesdemandepublication;
		}


		@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatedemandepublication", length = 7)
		public Date getDosdatedemandepublication() {
			return dosdatedemandepublication;
		}
    	public void setDosdatedemandepublication(Date dosdatedemandepublication) {
			this.dosdatedemandepublication = dosdatedemandepublication;
		}


    	@Column(name = "dosfichierdemandepublication", length =255)
		public String getDosfichierdemandepublication() {
			return dosfichierdemandepublication;
		}
    	public void setDosfichierdemandepublication(String dosfichierdemandepublication) {
			this.dosfichierdemandepublication = dosfichierdemandepublication;
		}


    	
    	@Column(name = "doslieuacquisitiondao", length =100)
		public String getDoslieuacquisitiondao() {
			return doslieuacquisitiondao;
		}
    	public void setDoslieuacquisitiondao(String doslieuacquisitiondao) {
			this.doslieuacquisitiondao = doslieuacquisitiondao;
		}


    	@Column(name = "dosmatricule", length =20)
		public String getDosmatricule() {
			return dosmatricule;
		}
    	public void setDosmatricule(String dosmatricule) {
			this.dosmatricule = dosmatricule;
		}
     	
     	
    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "monid")
    	public SygMonnaieoffre getDevise() {
			return devise;
		}
		public void setDevise(SygMonnaieoffre devise) {
			this.devise = devise;
		}


		@Column(name = "doscommentdemandeapprobation", length =20)
		public String getDoscommentdemandeapprobation() {
			return doscommentdemandeapprobation;
		}
    	public void setDoscommentdemandeapprobation(String doscommentdemandeapprobation) {
			this.doscommentdemandeapprobation = doscommentdemandeapprobation;
		}


    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdatedemandeapprobation", length = 7)
		public Date getDosdatedemandeapprobation() {
			return dosdatedemandeapprobation;
		}
    	public void setDosdatedemandeapprobation(Date dosdatedemandeapprobation) {
			this.dosdatedemandeapprobation = dosdatedemandeapprobation;
		}


    	@Temporal(TemporalType.DATE  )
    	@Column(name = "dosdateretourapprobation", length = 7)
		public Date getDosdateretourapprobation() {
			return dosdateretourapprobation;
		}
    	public void setDosdateretourapprobation(Date dosdateretourapprobation) {
			this.dosdateretourapprobation = dosdateretourapprobation;
		}
		
    	@Column(name = "telechargerdao", length = 1)
		public Integer getTelechargerdao() {
			return telechargerdao;
		}
    	public void setTelechargerdao(Integer telechargerdao) {
			this.telechargerdao = telechargerdao;
		}

	}

