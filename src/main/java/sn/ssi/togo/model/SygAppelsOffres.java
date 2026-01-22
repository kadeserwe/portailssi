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
	@Table(name = "pmb_appelsoffres")
	public class SygAppelsOffres  implements java.io.Serializable {
		
  		private Long apoid;
		private String apoprojet,apoobjet,aporeference,aponumeropretcredit,apocommentairemiseautorisation,apocommentaireautorisation,
		apofichiermiseautorisation,numeromarche,motifstopprocedure,apofichierpv,apofichiervalidation;	
		
		
		private SygRealisations realisation;
		private Date apodatecreation,apodateautorisation,apodaterejet,apodatemiseautorisation,datestopprocedure,dateaffectationdossier,apoDatepvouverturepli,apodateversement;
	

		private BigDecimal apomontantestime,apomontantversement;
		private SygAutoriteContractante autorite;
		private SygModepassation modepassation;
		private SygTypesmarches typemarche;
	//	private SygSecteursactivites categorie;
		private SygCategori categorie;
		private int aporesponsabledcmp,etatseuil,apoetatvalidation;
		private SygModeselection modeselection;
		private String apoStatut;
		private int apoNbreDAO;//Nombre DAO
		

		


		public SygAppelsOffres() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "apoid",  length = 255)
        public Long getApoid() {
			return this.apoid;
		}
		public void setApoid(Long apoid) {
			this.apoid = apoid;
		}


		@Column(name = "apoprojet")
		public String getApoprojet() {
			return apoprojet;
		}
    	public void setApoprojet(String apoprojet) {
			this.apoprojet = apoprojet;
		}

    	
    	@Column(name = "apoobjet")
    	public String getApoobjet() {
			return apoobjet;
		}
    	public void setApoobjet(String apoobjet) {
			this.apoobjet = apoobjet;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "plan_id")
		public SygRealisations getRealisation() {
			return realisation;
		}
    	public void setRealisation(SygRealisations realisation) {
			this.realisation = realisation;
		}
    	
    	
    	@Temporal(TemporalType.DATE)
    	@Column(name = "apodatecreation", length = 7)
    	public Date getApodatecreation() {
			return apodatecreation;
		}
    	public void setApodatecreation(Date apodatecreation) {
			this.apodatecreation = apodatecreation;
		}


    	
    	@Column(name = "aporeference",length=50)
		public String getAporeference() {
			return aporeference;
		}
		public void setAporeference(String aporeference) {
			this.aporeference = aporeference;
		}

	
		
		@Column(name = "apomontantestime")
		public BigDecimal getApomontantestime() {
			return apomontantestime;
		}
    	public void setApomontantestime(BigDecimal apomontantestime) {
			this.apomontantestime = apomontantestime;
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
    	@JoinColumn(name = "modepassation_id")
		public SygModepassation getModepassation() {
			return modepassation;
		}
     	public void setModepassation(SygModepassation modepassation) {
			this.modepassation = modepassation;
		}


     	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typemarche_id")
    	public SygTypesmarches getTypemarche() {
			return typemarche;
		}
		public void setTypemarche(SygTypesmarches typemarche) {
			this.typemarche = typemarche;
		}


		@Column(name = "aponumeropretcredit",length=40)
		public String getAponumeropretcredit() {
			return aponumeropretcredit;
		}
    	public void setAponumeropretcredit(String aponumeropretcredit) {
			this.aponumeropretcredit = aponumeropretcredit;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "categorie_id")
		public SygCategori getCategorie() {
			return categorie;
		}
    	public void setCategorie(SygCategori categorie) {
			this.categorie = categorie;
		}


    	
    	@Column(name = "responsabledcmp",length=10)
		public int getAporesponsabledcmp() {
			return aporesponsabledcmp;
		}

    	public void setAporesponsabledcmp(int aporesponsabledcmp) {
			this.aporesponsabledcmp = aporesponsabledcmp;
		}
		
    	@Temporal(TemporalType.DATE)
    	@Column(name = "apodateauto", length = 7)
    	public Date getApodateautorisation() {
			return apodateautorisation;
		}
    	public void setApodateautorisation(Date apodateautorisation) {
			this.apodateautorisation = apodateautorisation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "apodaterejet", length = 7)
		public Date getApodaterejet() {
			return apodaterejet;
		}
    	public void setApodaterejet(Date apodaterejet) {
			this.apodaterejet = apodaterejet;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "apodatemiseauto", length = 7)
		public Date getApodatemiseautorisation() {
			return apodatemiseautorisation;
		}
    	public void setApodatemiseautorisation(Date apodatemiseautorisation) {
			this.apodatemiseautorisation = apodatemiseautorisation;
		}


    	@Column(name = "apocommentairemiseauto")
		public String getApocommentairemiseautorisation() {
			return apocommentairemiseautorisation;
		}
    	public void setApocommentairemiseautorisation( String apocommentairemiseautorisation) {
			this.apocommentairemiseautorisation = apocommentairemiseautorisation;
		}


		@Column(name = "apocommentaireauto")
		public String getApocommentaireautorisation() {
			return apocommentaireautorisation;
		}
    	public void setApocommentaireautorisation(String apocommentaireautorisation) {
			this.apocommentaireautorisation = apocommentaireautorisation;
		}


		@Column(name = "apofichiermiseauto", length = 255)
		public String getApofichiermiseautorisation() {
			return apofichiermiseautorisation;
		}
    	public void setApofichiermiseautorisation(String apofichiermiseautorisation) {
			this.apofichiermiseautorisation = apofichiermiseautorisation;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "modeselection")
		public SygModeselection getModeselection() {
			return modeselection;
		}
    	public void setModeselection(SygModeselection modeselection) {
			this.modeselection = modeselection;
		}
    	
    	
    	@Column(name = "numeromarche", length = 100)
    	public String getNumeromarche() {
			return numeromarche;
		}

		public void setNumeromarche(String numeromarche) {
			this.numeromarche = numeromarche;
		}


		@Column(name = "motifstopprocedure")
		public String getMotifstopprocedure() {
			return motifstopprocedure;
		}
    	public void setMotifstopprocedure(String motifstopprocedure) {
			this.motifstopprocedure = motifstopprocedure;
		}


    	@Column(name = "apofichierpv", length = 100)
		public String getApofichierpv() {
			return apofichierpv;
		}
    	public void setApofichierpv(String apofichierpv) {
			this.apofichierpv = apofichierpv;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "datestopprocedure", length = 7)
		public Date getDatestopprocedure() {
			return datestopprocedure;
		}
    	public void setDatestopprocedure(Date datestopprocedure) {
			this.datestopprocedure = datestopprocedure;
		}


    	@Column(name = "etatseuil", length = 1)
		public int getEtatseuil() {
			return etatseuil;
		}
    	public void setEtatseuil(int etatseuil) {
			this.etatseuil = etatseuil;
		}


    	@Column(name = "apoetatvalidation", length = 1)
		public int getApoetatvalidation() {
			return apoetatvalidation;
		}
    	public void setApoetatvalidation(int apoetatvalidation) {
			this.apoetatvalidation = apoetatvalidation;
		}
    	
    	
    	@Column(name = "apofichiervalidation")
    	public String getApofichiervalidation() {
			return apofichiervalidation;
		}
		public void setApofichiervalidation(String apofichiervalidation) {
			this.apofichiervalidation = apofichiervalidation;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "dateaffectationdossier", length = 7)
		public Date getDateaffectationdossier() {
			return dateaffectationdossier;
		}

    	public void setDateaffectationdossier(Date dateaffectationdossier) {
			this.dateaffectationdossier = dateaffectationdossier;
		}



    	@Temporal(TemporalType.DATE)
    	@Column(name = "apodatepvouverturepli", length = 7)
		public Date getApoDatepvouverturepli() {
			return apoDatepvouverturepli;
		}
    	public void setApoDatepvouverturepli(Date apoDatepvouverturepli) {
			this.apoDatepvouverturepli = apoDatepvouverturepli;
		}


    	@Temporal(TemporalType.DATE)
		@Column(name = "apodateversement", length = 7)
		public Date getApodateversement() {
			return apodateversement;
		}



		public void setApodateversement(Date apodateversement) {
			this.apodateversement = apodateversement;
		}


		@Column(name = "apostatut", length = 10)
		public String getApoStatut() {
			return apoStatut;
		}



		public void setApoStatut(String apoStatut) {
			this.apoStatut = apoStatut;
		}


		@Column(name = "apomontantversement")
		public BigDecimal getApomontantversement() {
			return apomontantversement;
		}



		public void setApomontantversement(BigDecimal apomontantversement) {
			this.apomontantversement = apomontantversement;
		}


		@Column(name = "aponbredao")
		public int getApoNbreDAO() {
			return apoNbreDAO;
		}



		public void setApoNbreDAO(int apoNbreDAO) {
			this.apoNbreDAO = apoNbreDAO;
		}
	
		
    	
	}

