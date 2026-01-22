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
@Table(name = "pmb_pliouverture")
public class SygPlisouvertures  implements java.io.Serializable{
	private Long id,ajustement;
	private SygDossiers dossier;
	private SygAutoriteContractante autorite;
	private BigDecimal montantoffert,scorefinancier,prixevalue,scoretechniquepondere,scorefinancierpondere,scorefinal,montantdefinitif,montanttva,
	montantdouane; 
	private Date dateDepot,heuredepot;
	private String raisonsociale,adresseMail,commentaire,rang,ninea,natCode,monCode,pvoffrefinanciere,negociation,pays;

	private int rabais,scoretechnique,seuilatteint,classementechnique,classementgeneral,candidatrestreint_ID,etatPreselection,
	etatExamenPreliminaire,critereQualification,attributaireProvisoire,offreTechnique,offreFinanciere,lettreSoumission,valide,numero,garantie,piecerequise;
	private SygRetraitregistredao retrait;
	private SygFournisseur fournisseur;
	private String observationsoffres,observationscandidats,modereception,notifie,signatureoffre,exhaustivite,garantiesoumission,conformite;
	private BigDecimal notepreselectionne;


	public SygPlisouvertures() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpliouverture",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}


	@Column(name = "raisonsociale")
	public String getRaisonsociale() {
		return raisonsociale;
	}
	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}



	@Column(name = "montantoffert")
	public BigDecimal getMontantoffert() {
		return montantoffert;
	}
	public void setMontantoffert(BigDecimal montantoffert) {
		this.montantoffert = montantoffert;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "datedepot", length = 7)
	public Date getDateDepot() {
		return dateDepot;
	}
	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}


	@Column(name = "numero", length = 20)
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Column(name = "adressemail", length = 100)
	public String getAdresseMail() {
		return adresseMail;
	}
    public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}


    @Column(name = "commentaire")
	public String getCommentaire() {
		return commentaire;
	}
    public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


    @Column(name = "rabais", length = 15)
	public int getRabais() {
		return rabais;
	}
	public void setRabais(int rabais) {
		this.rabais = rabais;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "retraitregistredao_id")
	public SygRetraitregistredao getRetrait() {
		return retrait;
	}
	public void setRetrait(SygRetraitregistredao retrait) {
		this.retrait = retrait;
	}


	@Column(name = "ajustement", length = 20)
	public Long getAjustement() {
		return ajustement;
	}
	public void setAjustement(Long ajustement) {
		this.ajustement = ajustement;
	}


	@Column(name = "prixevalue")
	public BigDecimal getPrixevalue() {
		return prixevalue;
	}
	public void setPrixevalue(BigDecimal prixevalue) {
		this.prixevalue = prixevalue;
	}


	@Column(name = "classementechnique", length = 11)
	public int getClassementechnique() {
		return classementechnique;
	}
	public void setClassementechnique(int classementechnique) {
		this.classementechnique = classementechnique;
	}


	@Column(name = "classementgeneral", length = 11)
	public int getClassementgeneral() {
		return classementgeneral;
	}
	public void setClassementgeneral(int classementgeneral) {
		this.classementgeneral = classementgeneral;
	}


	@Column(name = "scorefinancier")
	public BigDecimal getScorefinancier() {
		return scorefinancier;
	}
    public void setScorefinancier(BigDecimal scorefinancier) {
		this.scorefinancier = scorefinancier;
	}


    @Column(name = "scorefinancierpondere")
	public BigDecimal getScorefinancierpondere() {
		return scorefinancierpondere;
	}
 	public void setScorefinancierpondere(BigDecimal scorefinancierpondere) {
		this.scorefinancierpondere = scorefinancierpondere;
	}


 	@Column(name = "scorefinal")
	public BigDecimal getScorefinal() {
		return scorefinal;
	}
 	public void setScorefinal(BigDecimal scorefinal) {
		this.scorefinal = scorefinal;
	}


 	@Column(name = "rang", length = 10)
	public String getRang() {
		return rang;
	}
    public void setRang(String rang) {
		this.rang = rang;
	}


    @Column(name = "scoretechniquepondere")
	public BigDecimal getScoretechniquepondere() {
		return scoretechniquepondere;
	}
    public void setScoretechniquepondere(BigDecimal scoretechniquepondere) {
		this.scoretechniquepondere = scoretechniquepondere;
	}


    @Column(name = "scoretechnique", length = 100)
	public int getScoretechnique() {
		return scoretechnique;
	}
 	public void setScoretechnique(int scoretechnique) {
		this.scoretechnique = scoretechnique;
	}


 	@Column(name = "seuilatteint", length = 1)
	public int getSeuilatteint() {
		return seuilatteint;
	}
    public void setSeuilatteint(int seuilatteint) {
		this.seuilatteint = seuilatteint;
	}


    @Column(name = "ninea", length = 50)
	public String getNinea() {
		return ninea;
	}
    public void setNinea(String ninea) {
		this.ninea = ninea;
	}


    @ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "fournisseurs_id")
	public SygFournisseur getFournisseur() {
		return fournisseur;
	}
    public void setFournisseur(SygFournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


    @Column(name = "candidatrestreint_id", length = 50)
	public int getCandidatrestreint_ID() {
		return candidatrestreint_ID;
	}
	public void setCandidatrestreint_ID(int candidatrestreint_ID) {
		this.candidatrestreint_ID = candidatrestreint_ID;
	}


	@Column(name = "etatpreselection", length = 1)
	public int getEtatPreselection() {
		return etatPreselection;
	}
	public void setEtatPreselection(int etatPreselection) {
		this.etatPreselection = etatPreselection;
	}


	@Column(name = "etatexamenpreliminaire", length = 1)
	public int getEtatExamenPreliminaire() {
		return etatExamenPreliminaire;
	}
	public void setEtatExamenPreliminaire(int etatExamenPreliminaire) {
		this.etatExamenPreliminaire = etatExamenPreliminaire;
	}


	@Column(name = "criterequalification", length = 11)
	public int getCritereQualification() {
		return critereQualification;
	}
	public void setCritereQualification(int critereQualification) {
		this.critereQualification = critereQualification;
	}


	@Column(name = "attributaireprovisoire", length = 1)
	public int getAttributaireProvisoire() {
		return attributaireProvisoire;
	}
	public void setAttributaireProvisoire(int attributaireProvisoire) {
		this.attributaireProvisoire = attributaireProvisoire;
	}


	@Column(name = "offretechnique", length = 11)
	public int getOffreTechnique() {
		return offreTechnique;
	}
    public void setOffreTechnique(int offreTechnique) {
		this.offreTechnique = offreTechnique;
	}


    @Column(name = "offrefinanciere", length = 11)
	public int getOffreFinanciere() {
		return offreFinanciere;
	}
	public void setOffreFinanciere(int offreFinanciere) {
		this.offreFinanciere = offreFinanciere;
	}


	@Column(name = "lettresoumission", length = 11)
	public int getLettreSoumission() {
		return lettreSoumission;
	}
	public void setLettreSoumission(int lettreSoumission) {
		this.lettreSoumission = lettreSoumission;
	}


	@Column(name = "valide", length = 1)
	public int getValide() {
		return valide;
	}
    public void setValide(int valide) {
		this.valide = valide;
	}


    @Column(name = "montantdefinitif")
	public BigDecimal getMontantdefinitif() {
		return montantdefinitif;
	}
	public void setMontantdefinitif(BigDecimal montantdefinitif) {
		this.montantdefinitif = montantdefinitif;
	}


	@Column(name = "natcode", length = 10)
	public String getNatCode() {
		return natCode;
	}
	public void setNatCode(String natCode) {
		this.natCode = natCode;
	}


	@Column(name = "moncode", length = 10)
	public String getMonCode() {
		return monCode;
	}
	public void setMonCode(String monCode) {
		this.monCode = monCode;
	}


	@Column(name = "pvoffrefinanciere")
	public String getPvoffrefinanciere() {
		return pvoffrefinanciere;
	}
	public void setPvoffrefinanciere(String pvoffrefinanciere) {
		this.pvoffrefinanciere = pvoffrefinanciere;
	}

	
	@Column(name = "negociation", length = 3)
	public String getNegociation() {
		return negociation;
	}
	public void setNegociation(String negociation) {
		this.negociation = negociation;
	}
	
	@Column(name = "pays", length = 255)
	public String getPays() {
		return pays;
	}
 	public void setPays(String pays) {
		this.pays = pays;
	}


 	@Temporal(TemporalType.TIME)
	@Column(name = "heuredepot", length = 7)
	public Date getHeuredepot() {
		return heuredepot;
	}
 	public void setHeuredepot(Date heuredepot) {
		this.heuredepot = heuredepot;
	}


 	@Column(name = "observationsoffres", length = 255)
	public String getObservationsoffres() {
		return observationsoffres;
	}
    public void setObservationsoffres(String observationsoffres) {
		this.observationsoffres = observationsoffres;
	}


    @Column(name = "observationscandidats", length = 255)
	public String getObservationscandidats() {
		return observationscandidats;
	}
    public void setObservationscandidats(String observationscandidats) {
		this.observationscandidats = observationscandidats;
	}


    @Column(name = "modereception", length = 255)
	public String getModereception() {
		return modereception;
	}
    public void setModereception(String modereception) {
		this.modereception = modereception;
	}



	public BigDecimal getNotepreselectionne() {
		return notepreselectionne;
	}
	public void setNotepreselectionne(BigDecimal notepreselectionne) {
		this.notepreselectionne = notepreselectionne;
	}


	@Column(name = "garantie")
	public int getGarantie() {
		return garantie;
	}
	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}


	@Column(name = "piecerequise")
	public int getPiecerequise() {
		return piecerequise;
	}
	public void setPiecerequise(int piecerequise) {
		this.piecerequise = piecerequise;
	}


	@Column(name = "notifie")
	public String getNotifie() {
		return notifie;
	}
	public void setNotifie(String notifie) {
		this.notifie = notifie;
	}



	@Column(name = "signatureoffre")
	public String getSignatureoffre() {
		return signatureoffre;
	}
	public void setSignatureoffre(String signatureoffre) {
		this.signatureoffre = signatureoffre;
	}


	@Column(name = "exhaustivite")
	public String getExhaustivite() {
		return exhaustivite;
	}
	public void setExhaustivite(String exhaustivite) {
		this.exhaustivite = exhaustivite;
	}


	@Column(name = "garantiesoumission")
	public String getGarantiesoumission() {
		return garantiesoumission;
	}
	public void setGarantiesoumission(String garantiesoumission) {
		this.garantiesoumission = garantiesoumission;
	}


	@Column(name = "conformite")
	public String getConformite() {
		return conformite;
	}
	public void setConformite(String conformite) {
		this.conformite = conformite;
	}


	@Column(name = "montanttva",length=10)
	public BigDecimal getMontanttva() {
		return montanttva;
	}
	public void setMontanttva(BigDecimal montanttva) {
		this.montanttva = montanttva;
	}


	@Column(name = "montantdouane",length=10)
	public BigDecimal getMontantdouane() {
		return montantdouane;
	}
	public void setMontantdouane(BigDecimal montantdouane) {
		this.montantdouane = montantdouane;
	}
 	
 	
    
	
}
