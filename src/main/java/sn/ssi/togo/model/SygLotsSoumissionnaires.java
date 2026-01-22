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
	@Table(name = "pmb_plilot")
	public class SygLotsSoumissionnaires  implements java.io.Serializable {
		
  		private Long id;
		private SygPlisouvertures plis;
		private SygLots lot;
		private SygDossiers dossier;
		private String plilraisonsociale,plilnumero,pliladresseMail,plilcommentaire,lotsoumis,lotrecu,plilibelle;
		private BigDecimal plilmontantoffert,plilmontantdefinitif,plimontantgarantie,plimontanttva,plimontantdouane,plimontantttc;
		
		private int plilrabais;
		private BigDecimal plilscoretechnique,plilscorefinancier,plilsrixevalue,plilscoretechniquepondere,plilscorefinancierpondere,
		plilscorefinal;
		private Date plildateDepot;
		private int plilclassementgeneral,plilclassementechnique,plilEtatPreselection,plilEtatExamenPreliminaire,plilcritereQualification,
		plilattributaireProvisoire,plilValide,plillettreSoumission,pliloffreTechnique,pliloffreFinanciere,plinumero;
		private SygMonnaieoffre monnaie;
		private SygNatureprix natureprix;
		private SygPays pays;
		
		
    	public SygLotsSoumissionnaires() {
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

	

		@Column(name = "plilraisonsociale")
		public String getPlilraisonsociale() {
			return this.plilraisonsociale;
		}

		public void setPlilraisonsociale(String plilraisonsociale) {
			this.plilraisonsociale = plilraisonsociale;
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
    	@JoinColumn(name = "lot_id")
     	public SygLots getLot() {
			return lot;
		}
    	public void setLot(SygLots lot) {
			this.lot = lot;
		}


    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	
    	@Temporal(TemporalType.DATE)
    	@Column(name = "plildatedepot", length = 7)
    	public Date getPlildateDepot() {
    		return plildateDepot;
    	}
    	public void setPlildateDepot(Date plildateDepot) {
    		this.plildateDepot = plildateDepot;
    	}


    	@Column(name = "plilrabais")
		public int getPlilrabais() {
			return plilrabais;
		}
 	

		public void setPlilrabais(int plilrabais) {
			this.plilrabais = plilrabais;
		}


 		@Column(name = "plilscoretechnique")
		public BigDecimal getPlilscoretechnique() {
			return plilscoretechnique;
		}
    	public void setPlilscoretechnique(BigDecimal plilscoretechnique) {
			this.plilscoretechnique = plilscoretechnique;
		}


    	@Column(name = "plilscorefinancier")
		public BigDecimal getPlilscorefinancier() {
			return plilscorefinancier;
		}
    	public void setPlilscorefinancier(BigDecimal plilscorefinancier) {
			this.plilscorefinancier = plilscorefinancier;
		}


    	@Column(name = "plilscoretechniquepondere")
		public BigDecimal getPlilscoretechniquepondere() {
			return plilscoretechniquepondere;
		}
    	public void setPlilscoretechniquepondere(BigDecimal plilscoretechniquepondere) {
			this.plilscoretechniquepondere = plilscoretechniquepondere;
		}


    	@Column(name = "plilscorefinancierpondere")
		public BigDecimal getPlilscorefinancierpondere() {
			return plilscorefinancierpondere;
		}
    	public void setPlilscorefinancierpondere(BigDecimal plilscorefinancierpondere) {
			this.plilscorefinancierpondere = plilscorefinancierpondere;
		}


    	@Column(name = "plilscorefinal")
		public BigDecimal getPlilscorefinal() {
			return plilscorefinal;
		}
    	public void setPlilscorefinal(BigDecimal plilscorefinal) {
			this.plilscorefinal = plilscorefinal;
		}


    	@Column(name = "plilnumeros")
		public String getPlilnumero() {
			return plilnumero;
		}
		public void setPlilnumero(String plilnumero) {
			this.plilnumero = plilnumero;
		}


		@Column(name = "pliladressemail")
		public String getPliladresseMail() {
			return pliladresseMail;
		}
    	public void setPliladresseMail(String pliladresseMail) {
			this.pliladresseMail = pliladresseMail;
		}


    	@Column(name = "plilcommentaire")
		public String getPlilcommentaire() {
			return plilcommentaire;
		}
    	public void setPlilcommentaire(String plilcommentaire) {
			this.plilcommentaire = plilcommentaire;
		}


    	@Column(name = "plilmontantoffert")
		public BigDecimal getPlilmontantoffert() {
			return plilmontantoffert;
		}
    	public void setPlilmontantoffert(BigDecimal plilmontantoffert) {
			this.plilmontantoffert = plilmontantoffert;
		}


    	@Column(name = "plilsrixevalue")
		public BigDecimal getPlilsrixevalue() {
			return plilsrixevalue;
		}
    	public void setPlilsrixevalue(BigDecimal plilsrixevalue) {
			this.plilsrixevalue = plilsrixevalue;
		}


    	@Column(name = "plilclassementgeneral")
		public int getPlilclassementgeneral() {
			return plilclassementgeneral;
		}
		public void setPlilclassementgeneral(int plilclassementgeneral) {
			this.plilclassementgeneral = plilclassementgeneral;
		}


		@Column(name = "plilclassementechnique")
		public int getPlilclassementechnique() {
			return plilclassementechnique;
		}
    	public void setPlilclassementechnique(int plilclassementechnique) {
			this.plilclassementechnique = plilclassementechnique;
		}


    	@Column(name = "lotsoumis",length=3)
		public String getLotsoumis() {
			return lotsoumis;
		}
    	public void setLotsoumis(String lotsoumis) {
			this.lotsoumis = lotsoumis;
		}


    	@Column(name = "lotrecu",length=3)
		public String getLotrecu() {
			return lotrecu;
		}
    	public void setLotrecu(String lotrecu) {
			this.lotrecu = lotrecu;
		}


    	@Column(name = "pliletatpreselection")
		public int getPlilEtatPreselection() {
			return plilEtatPreselection;
		}
		public void setPlilEtatPreselection(int plilEtatPreselection) {
			this.plilEtatPreselection = plilEtatPreselection;
		}


		@Column(name = "pliletatexamenpreliminaire")
		public int getPlilEtatExamenPreliminaire() {
			return plilEtatExamenPreliminaire;
		}
    	public void setPlilEtatExamenPreliminaire(int plilEtatExamenPreliminaire) {
			this.plilEtatExamenPreliminaire = plilEtatExamenPreliminaire;
		}


    	@Column(name = "plilcriterequalification")
		public int getPlilcritereQualification() {
			return plilcritereQualification;
		}
		public void setPlilcritereQualification(int plilcritereQualification) {
			this.plilcritereQualification = plilcritereQualification;
		}


		@Column(name = "plilattributaireprovisoire")
		public int getPlilattributaireProvisoire() {
			return plilattributaireProvisoire;
		}
		public void setPlilattributaireProvisoire(int plilattributaireProvisoire) {
			this.plilattributaireProvisoire = plilattributaireProvisoire;
		}


		@Column(name = "plilvalide")
		public int getPlilValide() {
			return plilValide;
		}
    	public void setPlilValide(int plilValide) {
			this.plilValide = plilValide;
		}


    	@Column(name = "plilibelle",length=255)
		public String getPlilibelle() {
			return plilibelle;
		}
    	public void setPlilibelle(String plilibelle) {
			this.plilibelle = plilibelle;
		}
    	
    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "plilmoncode")
		public SygMonnaieoffre getMonnaie() {
			return monnaie;
		}
    	public void setMonnaie(SygMonnaieoffre monnaie) {
			this.monnaie = monnaie;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "plilnatcode")
		public SygNatureprix getNatureprix() {
			return natureprix;
		}
    	public void setNatureprix(SygNatureprix natureprix) {
			this.natureprix = natureprix;
		}
    	
    	
    	@Column(name = "plilmontantdefinitif")
    	public BigDecimal getPlilmontantdefinitif() {
			return plilmontantdefinitif;
		}
    	public void setPlilmontantdefinitif(BigDecimal plilmontantdefinitif) {
			this.plilmontantdefinitif = plilmontantdefinitif;
		}


    	@Column(name = "plillettresoumission",length=1)
		public int getPlillettreSoumission() {
			return plillettreSoumission;
		}
    	public void setPlillettreSoumission(int plillettreSoumission) {
			this.plillettreSoumission = plillettreSoumission;
		}


    	@Column(name = "pliloffretechnique",length=1)
		public int getPliloffreTechnique() {
			return pliloffreTechnique;
		}
    	public void setPliloffreTechnique(int pliloffreTechnique) {
			this.pliloffreTechnique = pliloffreTechnique;
		}


    	@Column(name = "pliloffrefinanciere",length=1)
		public int getPliloffreFinanciere() {
			return pliloffreFinanciere;
		}
    	public void setPliloffreFinanciere(int pliloffreFinanciere) {
			this.pliloffreFinanciere = pliloffreFinanciere;
		}


    	@Column(name = "plilnumero")
		public int getPlinumero() {
			return plinumero;
		}
    	public void setPlinumero(int plinumero) {
			this.plinumero = plinumero;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "plilpays")
		public SygPays getPays() {
			return pays;
		}
    	public void setPays(SygPays pays) {
			this.pays = pays;
		}



    	@Column(name = "plimontantgarantie")
    	public BigDecimal getPlimontantgarantie() {
			return plimontantgarantie;
		}
    	public void setPlimontantgarantie(BigDecimal plimontantgarantie) {
			this.plimontantgarantie = plimontantgarantie;
		}


    	@Column(name = "plimontanttva")
		public BigDecimal getPlimontanttva() {
			return plimontanttva;
		}
    	public void setPlimontanttva(BigDecimal plimontanttva) {
			this.plimontanttva = plimontanttva;
		}


    	@Column(name = "plimontantdouane")
		public BigDecimal getPlimontantdouane() {
			return plimontantdouane;
		}
		public void setPlimontantdouane(BigDecimal plimontantdouane) {
			this.plimontantdouane = plimontantdouane;
		}


		@Column(name = "plimontantttc")
		public BigDecimal getPlimontantttc() {
			return plimontantttc;
		}
    	public void setPlimontantttc(BigDecimal plimontantttc) {
			this.plimontantttc = plimontantttc;
		}
    	
    	
    	
    	
	}

