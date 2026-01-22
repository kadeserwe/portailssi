package sn.ssi.togo.model;

import java.io.Serializable;
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
	@Table(name = "pmb_realisationduplan")
	public class SygRealisations  implements Serializable {
		
  		private Long idrealisation,realisationid,miseajourid;
		private String libelle,reference,naturemodepassation,sourcefinancement,etat;
		private Date datelancement,dateattribution,datedemarrage,dateachevement,datepreparationdaodcrbc,datereceptionavisccmpdncmpappel,
		datenonobjectionptfappel,dateinvitationsoumission,dateouvertureplis,datefinevaluation,datereceptionavisccmpdncmp,datenonobjectionptf,
		dateprevisionnellesignaturecontrat,datepreparationtdrami,dateavisccmpdncmpami,datelancementmanifestation,dateouverturemanifestation,
		datepreparationdp,dateavisccmpdncmpdp,dateouverturedp,dateavisccmpdncmpdppt,datenonobjectionptfpt,dateouverture,datefinevaluationpf,
		dateavisccmpdncmp,datenegociation,dateavisptfservcontrole,dateprevsigncontrat;
    	private SygModepassation modepassation;
		private SygService servicemaitreoeuvre;
		private SygTypesmarches typemarche;
		private SygPlansdepassation plan;
		private BigDecimal montant;
		private int appel,examendncmp,examenccmp,supprime,utilisable,relance,examenptf;
		private Double delaiexecution;
		
		private Date datepreparationtdramireel,dateavisccmpdncmpamireel,datelancementmanifestationreel,dateouverturemanifestationreel,
		datepreparationdpreel,dateavisccmpdncmpdpreel,datenonobjectionptfreel,dateinvitationsoumissionreel,dateouverturedpreel,
		datefinevaluationreel,dateavisccmpdncmpdpptreel,datenonobjectionptfptreel,dDateouverturereel,datefinevaluationpfreel,
		dateavisccmpdncmpreel,datenegociationreel,dateavisptfservcontrolereel,datesignaturecontratreel,dateouverturereel,
		datepreparationdaodcrbcreel,datereceptionavisccmpdncmpappelreel,datenonobjectionptfappelreel,dateouvertureplisreel,
		datereceptionavisccmpdncmpreel;
		private String juspreparationtdrami,jusavisccmpdncmpami,juslancementmanifestation,jusouverturemanifestation,
		juspreparationdp,jusavisccmpdncmpd,jusnonobjectionptf,jusinvitationsoumission,jusouverturedp,
		jusfinevaluation,jusavisccmpdncmpdppt,jusnonobjectionptfpt,jusouverture,jusfinevaluationpf,
		jusavisccmpdncmp,jusnegociation,jusavisptfservcontrole,jussignaturecontrat,
		juspreparationdaodcrbc,jusreceptionavisccmpdncmpappel,jusnonobjectionptfappel,jusouvertureplis,
		jusreceptionavisccmpdncmp,jusavisccmpdncmpdp,jusavisptfservicecontrole;
			
     
	




	


		public SygRealisations() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id_plan",  length = 255)
        public Long getIdrealisation() {
			return this.idrealisation;
		}
		public void setIdrealisation(Long idrealisation) {
			this.idrealisation = idrealisation;
		}

		
	    @Column(name = "lib_plan",  length = 255)
		public String getLibelle() {
			return libelle;
		}
    	public void setLibelle(String libelle) {
			this.libelle = libelle;
		}
    	
    	 @Column(name = "reference",  length = 50)
 		public String getReference() {
 			return reference;
 		}
     	public void setReference(String reference) {
 			this.reference = reference;
 		}


      	@Temporal(TemporalType.DATE)
    	@Column(name = "datelancement", length = 7)
		public Date getDatelancement() {
			return datelancement;
		}
		public void setDatelancement(Date datelancement) {
			this.datelancement = datelancement;
		}
    	
		
		
		@Temporal(TemporalType.DATE)
    	@Column(name = "dateattribution", length = 7)
		public Date getDateattribution() {
			return dateattribution;
		}
		public void setDateattribution(Date dateattribution) {
			this.dateattribution = dateattribution;
		}
		
		@Temporal(TemporalType.DATE)
    	@Column(name = "datedemarrage", length = 7)
		public Date getDatedemarrage() {
			return datedemarrage;
		}
		public void setDatedemarrage(Date datedemarrage) {
			this.datedemarrage = datedemarrage;
		}
		
		@Temporal(TemporalType.DATE)
    	@Column(name = "dateachevement", length = 7)
		public Date getDateachevement() {
			return dateachevement;
		}
		public void setDateachevement(Date dateachevement) {
			this.dateachevement = dateachevement;
		}
		
		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "modepassation_id")
		public SygModepassation getModepassation() {
			return modepassation;
		}
     	public void setModepassation(SygModepassation modepassation) {
			this.modepassation = modepassation;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "servicemaitreoeuvre")
		public SygService getServicemaitreoeuvre() {
			return servicemaitreoeuvre;
		}
    	public void setServicemaitreoeuvre(SygService servicemaitreoeuvre) {
			this.servicemaitreoeuvre = servicemaitreoeuvre;
		}
     	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typemarche")
    	public SygTypesmarches getTypemarche() {
			return typemarche;
		}
		public void setTypemarche(SygTypesmarches typemarche) {
			this.typemarche = typemarche;
		}


		@Column(name = "naturemodepassation", length = 50)
		public String getNaturemodepassation() {
			return naturemodepassation;
		}
    	public void setNaturemodepassation(String naturemodepassation) {
			this.naturemodepassation = naturemodepassation;
		}
     	
		
    	@Column(name = "montantestime")
    	public BigDecimal getMontant() {
			return montant;
		}
    	public void setMontant(BigDecimal montant) {
			this.montant = montant;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "infoplan_id")
		public SygPlansdepassation getPlan() {
			return plan;
		}
		public void setPlan(SygPlansdepassation plan) {
			this.plan = plan;
		}


		@Column(name = "appel",length=1)
		public int getAppel() {
			return appel;
		}
    	public void setAppel(int appel) {
			this.appel = appel;
		}
    	
		
    	@Column(name = "examendncmp",length=1)
		public int getExamendncmp() {
			return examendncmp;
		}
    	public void setExamendncmp(int examendncmp) {
			this.examendncmp = examendncmp;
		}


    	@Column(name = "sourcefinancement",length=255)
		public String getSourcefinancement() {
			return sourcefinancement;
		}
    	public void setSourcefinancement(String sourcefinancement) {
			this.sourcefinancement = sourcefinancement;
		}


    	@Column(name = "examenccmp",length=1)
		public int getExamenccmp() {
			return examenccmp;
		}
		public void setExamenccmp(int examenccmp) {
			this.examenccmp = examenccmp;
		}


		@Column(name = "delaiexecution",length=50)
		public Double getDelaiexecution() {
			return delaiexecution;
		}
    	public void setDelaiexecution(Double delaiexecution) {
			this.delaiexecution = delaiexecution;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datenonobjectionptfappel", length = 7)
		public Date getDatenonobjectionptfappel() {
			return datenonobjectionptfappel;
		}
    	public void setDatenonobjectionptfappel(Date datenonobjectionptfappel) {
			this.datenonobjectionptfappel = datenonobjectionptfappel;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateinvitationsoumission", length = 7)
		public Date getDateinvitationsoumission() {
			return dateinvitationsoumission;
		}
    	public void setDateinvitationsoumission(Date dateinvitationsoumission) {
			this.dateinvitationsoumission = dateinvitationsoumission;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datefinevaluation", length = 7)
		public Date getDatefinevaluation() {
			return datefinevaluation;
		}
    	public void setDatefinevaluation(Date datefinevaluation) {
			this.datefinevaluation = datefinevaluation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datenonobjectionptf", length = 7)
		public Date getDatenonobjectionptf() {
			return datenonobjectionptf;
		}
    	public void setDatenonobjectionptf(Date datenonobjectionptf) {
			this.datenonobjectionptf = datenonobjectionptf;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datepreparationdaodcrbc", length = 7)
		public Date getDatepreparationdaodcrbc() {
			return datepreparationdaodcrbc;
		}
 		public void setDatepreparationdaodcrbc(Date datepreparationdaodcrbc) {
			this.datepreparationdaodcrbc = datepreparationdaodcrbc;
		}


 		@Temporal(TemporalType.DATE)
    	@Column(name = "datereceptionavisccmpdncmpappel", length = 7)
		public Date getDatereceptionavisccmpdncmpappel() {
			return datereceptionavisccmpdncmpappel;
		}
    	public void setDatereceptionavisccmpdncmpappel( Date datereceptionavisccmpdncmpappel) {
			this.datereceptionavisccmpdncmpappel = datereceptionavisccmpdncmpappel;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateouvertureplis", length = 7)
		public Date getDateouvertureplis() {
			return dateouvertureplis;
		}
    	public void setDateouvertureplis(Date dateouvertureplis) {
			this.dateouvertureplis = dateouvertureplis;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datereceptionavisccmpdncmp", length = 7)
		public Date getDatereceptionavisccmpdncmp() {
			return datereceptionavisccmpdncmp;
		}
    	public void setDatereceptionavisccmpdncmp(Date datereceptionavisccmpdncmp) {
			this.datereceptionavisccmpdncmp = datereceptionavisccmpdncmp;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateprevisionnellesignaturecontrat", length = 7)
		public Date getDateprevisionnellesignaturecontrat() {
			return dateprevisionnellesignaturecontrat;
		}
    	public void setDateprevisionnellesignaturecontrat(
				Date dateprevisionnellesignaturecontrat) {
			this.dateprevisionnellesignaturecontrat = dateprevisionnellesignaturecontrat;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateavisccmpdncmpami", length = 7)
		public Date getDateavisccmpdncmpami() {
			return dateavisccmpdncmpami;
		}
    	public void setDateavisccmpdncmpami(Date dateavisccmpdncmpami) {
			this.dateavisccmpdncmpami = dateavisccmpdncmpami;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateavisccmpdncmpdp", length = 7)
		public Date getDateavisccmpdncmpdp() {
			return dateavisccmpdncmpdp;
		}
    	public void setDateavisccmpdncmpdp(Date dateavisccmpdncmpdp) {
			this.dateavisccmpdncmpdp = dateavisccmpdncmpdp;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateavisccmpdncmpdppt", length = 7)
		public Date getDateavisccmpdncmpdppt() {
			return dateavisccmpdncmpdppt;
		}
    	public void setDateavisccmpdncmpdppt(Date dateavisccmpdncmpdppt) {
			this.dateavisccmpdncmpdppt = dateavisccmpdncmpdppt;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateavisccmpdncmp", length = 7)
		public Date getDateavisccmpdncmp() {
			return dateavisccmpdncmp;
		}
        public void setDateavisccmpdncmp(Date dateavisccmpdncmp) {
			this.dateavisccmpdncmp = dateavisccmpdncmp;
		}


        @Temporal(TemporalType.DATE)
    	@Column(name = "dateavisptfservcontrole", length = 7)
		public Date getDateavisptfservcontrole() {
			return dateavisptfservcontrole;
		}
    	public void setDateavisptfservcontrole(Date dateavisptfservcontrole) {
			this.dateavisptfservcontrole = dateavisptfservcontrole;
		}


    	@Temporal(TemporalType.DATE)
     	@Column(name = "datelancementmanifestation", length = 7)
		public Date getDatelancementmanifestation() {
			return datelancementmanifestation;
		}
    	public void setDatelancementmanifestation(Date datelancementmanifestation) {
			this.datelancementmanifestation = datelancementmanifestation;
		}


        @Temporal(TemporalType.DATE)
     	@Column(name = "datenonobjectionptfpt", length = 7)
		public Date getDatenonobjectionptfpt() {
			return datenonobjectionptfpt;
		}
    	public void setDatenonobjectionptfpt(Date datenonobjectionptfpt) {
			this.datenonobjectionptfpt = datenonobjectionptfpt;
		}


    	 @Temporal(TemporalType.DATE)
     	@Column(name = "dateouverture", length = 7)
		public Date getDateouverture() {
			return dateouverture;
		}
    	public void setDateouverture(Date dateouverture) {
			this.dateouverture = dateouverture;
		}


    	 @Temporal(TemporalType.DATE)
     	@Column(name = "datefinevaluationpf", length = 7)
		public Date getDatefinevaluationpf() {
			return datefinevaluationpf;
		}
    	public void setDatefinevaluationpf(Date datefinevaluationpf) {
			this.datefinevaluationpf = datefinevaluationpf;
		}


    	 @Temporal(TemporalType.DATE)
     	@Column(name = "datenegociation", length = 7)
		public Date getDatenegociation() {
			return datenegociation;
		}
    	public void setDatenegociation(Date datenegociation) {
			this.datenegociation = datenegociation;
		}


        @Temporal(TemporalType.DATE)
      	@Column(name = "datepreparationtdrami", length = 7)
		public Date getDatepreparationtdrami() {
			return datepreparationtdrami;
		}
		public void setDatepreparationtdrami(Date datepreparationtdrami) {
			this.datepreparationtdrami = datepreparationtdrami;
		}

		
		@Temporal(TemporalType.DATE)
	    @Column(name = "dateouverturemanifestation", length = 7)
    	public Date getDateouverturemanifestation() {
			return dateouverturemanifestation;
		}
    	public void setDateouverturemanifestation(Date dateouverturemanifestation) {
			this.dateouverturemanifestation = dateouverturemanifestation;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datepreparationdp", length = 7)
		public Date getDatepreparationdp() {
			return datepreparationdp;
		}
		public void setDatepreparationdp(Date datepreparationdp) {
			this.datepreparationdp = datepreparationdp;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateouverturedp", length = 7)
		public Date getDateouverturedp() {
			return dateouverturedp;
		}
		public void setDateouverturedp(Date dateouverturedp) {
			this.dateouverturedp = dateouverturedp;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateprevsigncontrat", length = 7)
		public Date getDateprevsigncontrat() {
			return dateprevsigncontrat;
		}
    	public void setDateprevsigncontrat(Date dateprevsigncontrat) {
			this.dateprevsigncontrat = dateprevsigncontrat;
		}



    	@Column(name = "etat",length=50)
		public String getEtat() {
			return etat;
		}
    	public void setEtat(String etat) {
			this.etat = etat;
		}


    	@Column(name = "rea_reaid")
		public Long getRealisationid() {
			return realisationid;
		}
    	public void setRealisationid(Long realisationid) {
			this.realisationid = realisationid;
		}


    	@Column(name = "maj_id")
		public Long getMiseajourid() {
			return miseajourid;
		}
    	public void setMiseajourid(Long miseajourid) {
			this.miseajourid = miseajourid;
		}


    	@Column(name = "supprime")
		public int getSupprime() {
			return supprime;
		}
    	public void setSupprime(int supprime) {
			this.supprime = supprime;
		}



    	@Column(name = "utilisable",length=1)
		public int getUtilisable() {
			return utilisable;
		}
    	public void setUtilisable(int utilisable) {
			this.utilisable = utilisable;
		}
    	
    	
    	@Temporal(TemporalType.DATE)
	    @Column(name = "dateavisccmpdncmpamireel", length = 7)
    	public Date getDateavisccmpdncmpamireel() {
			return dateavisccmpdncmpamireel;
		}
		public void setDateavisccmpdncmpamireel(Date dateavisccmpdncmpamireel) {
			this.dateavisccmpdncmpamireel = dateavisccmpdncmpamireel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateavisccmpdncmpdpreel", length = 7)
		public Date getDateavisccmpdncmpdpreel() {
			return dateavisccmpdncmpdpreel;
		}
		public void setDateavisccmpdncmpdpreel(Date dateavisccmpdncmpdpreel) {
			this.dateavisccmpdncmpdpreel = dateavisccmpdncmpdpreel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateavisccmpdncmpdpptreel", length = 7)
		public Date getDateavisccmpdncmpdpptreel() {
			return dateavisccmpdncmpdpptreel;
		}
    	public void setDateavisccmpdncmpdpptreel(Date dateavisccmpdncmpdpptreel) {
			this.dateavisccmpdncmpdpptreel = dateavisccmpdncmpdpptreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "dateavisccmpdncmpreel", length = 7)
		public Date getDateavisccmpdncmpreel() {
			return dateavisccmpdncmpreel;
		}
    	public void setDateavisccmpdncmpreel(Date dateavisccmpdncmpreel) {
			this.dateavisccmpdncmpreel = dateavisccmpdncmpreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datefinevaluationreel", length = 7)
		public Date getDatefinevaluationreel() {
			return datefinevaluationreel;
		}
    	public void setDatefinevaluationreel(Date datefinevaluationreel) {
			this.datefinevaluationreel = datefinevaluationreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datefinevaluationpfreel", length = 7)
		public Date getDatefinevaluationpfreel() {
			return datefinevaluationpfreel;
		}
    	public void setDatefinevaluationpfreel(Date datefinevaluationpfreel) {
			this.datefinevaluationpfreel = datefinevaluationpfreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "dateavisptfservcontrolereel", length = 7)
		public Date getDateavisptfservcontrolereel() {
			return dateavisptfservcontrolereel;
		}
    	public void setDateavisptfservcontrolereel(Date dateavisptfservcontrolereel) {
			this.dateavisptfservcontrolereel = dateavisptfservcontrolereel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datelancementmanifestationreel", length = 7)
		public Date getDatelancementmanifestationreel() {
			return datelancementmanifestationreel;
		}
		public void setDatelancementmanifestationreel( Date datelancementmanifestationreel) {
			this.datelancementmanifestationreel = datelancementmanifestationreel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateinvitationsoumissionreel", length = 7)
		public Date getDateinvitationsoumissionreel() {
			return dateinvitationsoumissionreel;
		}
    	public void setDateinvitationsoumissionreel(Date dateinvitationsoumissionreel) {
			this.dateinvitationsoumissionreel = dateinvitationsoumissionreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datenegociationreel", length = 7)
		public Date getDatenegociationreel() {
			return datenegociationreel;
		}
    	public void setDatenegociationreel(Date datenegociationreel) {
			this.datenegociationreel = datenegociationreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datenonobjectionptfreel", length = 7)
		public Date getDatenonobjectionptfreel() {
			return datenonobjectionptfreel;
		}
    	public void setDatenonobjectionptfreel(Date datenonobjectionptfreel) {
			this.datenonobjectionptfreel = datenonobjectionptfreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "dateouverturedpreel", length = 7)
		public Date getDateouverturedpreel() {
			return dateouverturedpreel;
		}
    	public void setDateouverturedpreel(Date dateouverturedpreel) {
			this.dateouverturedpreel = dateouverturedpreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datenonobjectionptfptreel", length = 7)
		public Date getDatenonobjectionptfptreel() {
			return datenonobjectionptfptreel;
		}
    	public void setDatenonobjectionptfptreel(Date datenonobjectionptfptreel) {
			this.datenonobjectionptfptreel = datenonobjectionptfptreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datepreparationtdramireel", length = 7)
		public Date getDatepreparationtdramireel() {
			return datepreparationtdramireel;
		}
		public void setDatepreparationtdramireel(Date datepreparationtdramireel) {
			this.datepreparationtdramireel = datepreparationtdramireel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "dateouverturemanifestationree", length = 7)
		public Date getDateouverturemanifestationreel() {
			return dateouverturemanifestationreel;
		}
		public void setDateouverturemanifestationreel(Date dateouverturemanifestationreel) {
			this.dateouverturemanifestationreel = dateouverturemanifestationreel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "datepreparationdpreel", length = 7)
		public Date getDatepreparationdpreel() {
			return datepreparationdpreel;
		}
    	public void setDatepreparationdpreel(Date datepreparationdpreel) {
			this.datepreparationdpreel = datepreparationdpreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "ddateouverturereel", length = 7)
		public Date getdDateouverturereel() {
			return dDateouverturereel;
		}
    	public void setdDateouverturereel(Date dDateouverturereel) {
			this.dDateouverturereel = dDateouverturereel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datesignaturecontratreel", length = 7)
		public Date getDatesignaturecontratreel() {
			return datesignaturecontratreel;
		}
    	public void setDatesignaturecontratreel( Date datesignaturecontratreel) {
			this.datesignaturecontratreel= datesignaturecontratreel;
		}
    	
		
    	@Temporal(TemporalType.DATE)
	    @Column(name = "dateouverturereel", length = 7)
    	public Date getDateouverturereel() {
			return dateouverturereel;
		}
		public void setDateouverturereel(Date dateouverturereel) {
			this.dateouverturereel = dateouverturereel;
		}


		@Temporal(TemporalType.DATE)
	    @Column(name = "datepreparationdaodcrbcreel", length = 7)
		public Date getDatepreparationdaodcrbcreel() {
			return datepreparationdaodcrbcreel;
		}
    	public void setDatepreparationdaodcrbcreel(Date datepreparationdaodcrbcreel) {
			this.datepreparationdaodcrbcreel = datepreparationdaodcrbcreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datereceptionavisccmpdncmpappelreel", length = 7)
		public Date getDatereceptionavisccmpdncmpappelreel() {
			return datereceptionavisccmpdncmpappelreel;
		}
    	public void setDatereceptionavisccmpdncmpappelreel( Date datereceptionavisccmpdncmpappelreel) {
			this.datereceptionavisccmpdncmpappelreel = datereceptionavisccmpdncmpappelreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datenonobjectionptfappelreel", length = 7)
		public Date getDatenonobjectionptfappelreel() {
			return datenonobjectionptfappelreel;
		}
 		public void setDatenonobjectionptfappelreel(Date datenonobjectionptfappelreel) {
			this.datenonobjectionptfappelreel = datenonobjectionptfappelreel;
		}


 		@Temporal(TemporalType.DATE)
	    @Column(name = "dateouvertureplisreel", length = 7)
		public Date getDateouvertureplisreel() {
			return dateouvertureplisreel;
		}
    	public void setDateouvertureplisreel(Date dateouvertureplisreel) {
			this.dateouvertureplisreel = dateouvertureplisreel;
		}


    	@Temporal(TemporalType.DATE)
	    @Column(name = "datereceptionavisccmpdncmpreel", length = 7)
		public Date getDatereceptionavisccmpdncmpreel() {
			return datereceptionavisccmpdncmpreel;
		}
    	public void setDatereceptionavisccmpdncmpreel( Date datereceptionavisccmpdncmpreel) {
			this.datereceptionavisccmpdncmpreel = datereceptionavisccmpdncmpreel;
		}


    	@Column(name = "jusavisccmpdncmpami",  length = 255)
		public String getJusavisccmpdncmpami() {
			return jusavisccmpdncmpami;
		}
    	public void setJusavisccmpdncmpami(String jusavisccmpdncmpami) {
			this.jusavisccmpdncmpami = jusavisccmpdncmpami;
		}


    	@Column(name = "jusavisccmpdncmpd",  length = 255)
		public String getJusavisccmpdncmpd() {
			return jusavisccmpdncmpd;
		}
    	public void setJusavisccmpdncmpd(String jusavisccmpdncmpd) {
			this.jusavisccmpdncmpd = jusavisccmpdncmpd;
		}


    	@Column(name = "jusavisccmpdncmpdppt",  length = 255)
		public String getJusavisccmpdncmpdppt() {
			return jusavisccmpdncmpdppt;
		}
    	public void setJusavisccmpdncmpdppt(String jusavisccmpdncmpdppt) {
			this.jusavisccmpdncmpdppt = jusavisccmpdncmpdppt;
		}


    	@Column(name = "jusavisccmpdncmp",  length = 255)
		public String getJusavisccmpdncmp() {
			return jusavisccmpdncmp;
		}
    	public void setJusavisccmpdncmp(String jusavisccmpdncmp) {
			this.jusavisccmpdncmp = jusavisccmpdncmp;
		}


    	@Column(name = "jusinvitationsoumission",  length = 255)
		public String getJusinvitationsoumission() {
			return jusinvitationsoumission;
		}
    	public void setJusinvitationsoumission(String jusinvitationsoumission) {
			this.jusinvitationsoumission = jusinvitationsoumission;
		}


    	@Column(name = "jusfinevaluation",  length = 255)
		public String getJusfinevaluation() {
			return jusfinevaluation;
		}
    	public void setJusfinevaluation(String jusfinevaluation) {
			this.jusfinevaluation = jusfinevaluation;
		}


    	@Column(name = "jusfinevaluationpf",  length = 255)
		public String getJusfinevaluationpf() {
			return jusfinevaluationpf;
		}
    	public void setJusfinevaluationpf(String jusfinevaluationpf) {
			this.jusfinevaluationpf = jusfinevaluationpf;
		}


    	@Column(name = "jusavisptfservcontrole",  length = 255)
		public String getJusavisptfservcontrole() {
			return jusavisptfservcontrole;
		}
    	public void setJusavisptfservcontrole(String jusavisptfservcontrole) {
			this.jusavisptfservcontrole = jusavisptfservcontrole;
		}


    	@Column(name = "juslancementmanifestation",  length = 255)
		public String getJuslancementmanifestation() {
			return juslancementmanifestation;
		}
    	public void setJuslancementmanifestation(String juslancementmanifestation) {
			this.juslancementmanifestation = juslancementmanifestation;
		}


    	@Column(name = "jusnonobjectionptf",  length = 255)
		public String getJusnonobjectionptf() {
			return jusnonobjectionptf;
		}
    	public void setJusnonobjectionptf(String jusnonobjectionptf) {
			this.jusnonobjectionptf = jusnonobjectionptf;
		}


    	@Column(name = "jusnegociation",  length = 255)
		public String getJusnegociation() {
			return jusnegociation;
		}
    	public void setJusnegociation(String jusnegociation) {
			this.jusnegociation = jusnegociation;
		}


    	@Column(name = "jusnonobjectionptfappel",  length = 255)
		public String getJusnonobjectionptfappel() {
			return jusnonobjectionptfappel;
		}
        public void setJusnonobjectionptfappel(String jusnonobjectionptfappel) {
			this.jusnonobjectionptfappel = jusnonobjectionptfappel;
		}


        @Column(name = "jusouverturemanifestation",  length = 255)
		public String getJusouverturemanifestation() {
			return jusouverturemanifestation;
		}
 		public void setJusouverturemanifestation(String jusouverturemanifestation) {
			this.jusouverturemanifestation = jusouverturemanifestation;
		}


 		@Column(name = "jusouverturedp",  length = 255)
		public String getJusouverturedp() {
			return jusouverturedp;
		}
    	public void setJusouverturedp(String jusouverturedp) {
			this.jusouverturedp = jusouverturedp;
		}


    	@Column(name = "jusnonobjectionptfpt",  length = 255)
		public String getJusnonobjectionptfpt() {
			return jusnonobjectionptfpt;
		}
    	public void setJusnonobjectionptfpt(String jusnonobjectionptfpt) {
			this.jusnonobjectionptfpt = jusnonobjectionptfpt;
		}


    	@Column(name = "jusouverture",  length = 255)
		public String getJusouverture() {
			return jusouverture;
		}
    	public void setJusouverture(String jusouverture) {
			this.jusouverture = jusouverture;
		}


    	@Column(name = "juspreparationtdrami",  length = 255)
		public String getJuspreparationtdrami() {
			return juspreparationtdrami;
		}
    	public void setJuspreparationtdrami(String juspreparationtdrami) {
			this.juspreparationtdrami = juspreparationtdrami;
		}


    	@Column(name = "juspreparationdp",  length = 255)
		public String getJuspreparationdp() {
			return juspreparationdp;
		}
    	public void setJuspreparationdp(String juspreparationdp) {
			this.juspreparationdp = juspreparationdp;
		}


    	@Column(name = "juspreparationdaodcrbc",  length = 255)
		public String getJuspreparationdaodcrbc() {
			return juspreparationdaodcrbc;
		}
    	public void setJuspreparationdaodcrbc(String juspreparationdaodcrbc) {
			this.juspreparationdaodcrbc = juspreparationdaodcrbc;
		}


    	@Column(name = "jusouvertureplis",  length = 255)
		public String getJusouvertureplis() {
			return jusouvertureplis;
		}
    	public void setJusouvertureplis(String jusouvertureplis) {
			this.jusouvertureplis = jusouvertureplis;
		}


    	@Column(name = "juspsignaturecontrat",  length = 255)
		public String getJussignaturecontrat() {
			return jussignaturecontrat;
		}
    	public void setJussignaturecontrat( String jussignaturecontrat) {
			this.jussignaturecontrat = jussignaturecontrat;
		}


    	@Column(name = "jusreceptionavisccmpdncmpappel",  length = 255)
		public String getJusreceptionavisccmpdncmpappel() {
			return jusreceptionavisccmpdncmpappel;
		}
    	public void setJusreceptionavisccmpdncmpappel( String jusreceptionavisccmpdncmpappel) {
			this.jusreceptionavisccmpdncmpappel = jusreceptionavisccmpdncmpappel;
		}


    	@Column(name = "jusreceptionavisccmpdncmp",  length = 255)
		public String getJusreceptionavisccmpdncmp() {
			return jusreceptionavisccmpdncmp;
		}
    	public void setJusreceptionavisccmpdncmp(String jusreceptionavisccmpdncmp) {
			this.jusreceptionavisccmpdncmp = jusreceptionavisccmpdncmp;
		}

    	
        
    	@Column(name = "jusavisccmpdncmpdp",  length = 255)
		public String getJusavisccmpdncmpdp() {
			return jusavisccmpdncmpdp;
		}
    	public void setJusavisccmpdncmpdp(String jusavisccmpdncmpdp) {
			this.jusavisccmpdncmpdp = jusavisccmpdncmpdp;
		}

    	
    	@Column(name = "jusavisptfservicecontrole",  length = 255)
    	public String getJusavisptfservicecontrole() {
			return jusavisptfservicecontrole;
		}
    	public void setJusavisptfservicecontrole(String jusavisptfservicecontrole) {
			this.jusavisptfservicecontrole = jusavisptfservicecontrole;
		}


    	@Column(name = "relance",  length = 50)
		public int getRelance() {
			return relance;
		}
    	public void setRelance(int relance) {
			this.relance = relance;
		}

    	@Column(name = "examenptf",  length = 2)
    	public int getExamenptf() {
			return examenptf;
		}
    	public void setExamenptf(int examenptf) {
			this.examenptf = examenptf;
		}

	}

