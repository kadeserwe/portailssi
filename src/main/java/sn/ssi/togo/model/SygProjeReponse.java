package sn.ssi.togo.model;
import java.io.Serializable;
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
@Table(name = "syg_projet_reponse")
public class SygProjeReponse implements Serializable {

	private Long  courrierId;
	private Date courrierDateSaisie;
	private Date courrierDateReception;
	private Date courrierDate;
	//private String courrierReference;
	private String courrierObjet;
	private String courrierAutre;
	private String courrierRef;

	private SygAutoriteContractante courrierAutoriteContractante;
	//private SygModeReception courrierModeReception;
	// private SygTypesCourrier courrierType;
	//  private SygNatureCourrier natureCourrier;
	//private SygModeTraitement modetraitement;
	private String amplitaire;
	private boolean vesionFinal = false;
	private boolean signed = false;

	@Column(name = "issignedversion")
	public boolean isSigned() {
		return signed;
	}

	public void setSigned(boolean signed) {
		this.signed = signed;
	}

	private String file;

	@Column(name = "file", length=50)
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}




	@Column(name = "islastversion")
	public boolean isVesionFinal() {
		return vesionFinal;
	}

	public void setVesionFinal(boolean vesionFinal) {
		this.vesionFinal = vesionFinal;
	}

	private SygDossierCourrier dossierCourrier;






	@ManyToOne(fetch = FetchType.LAZY)
	public SygDossierCourrier getDossierCourrier() {
		return dossierCourrier;
	}

	public void setDossierCourrier(SygDossierCourrier dossierCourrier) {
		this.dossierCourrier = dossierCourrier;
	}

	public String getAmplitaire() {
		return amplitaire;
	}

	public void setAmplitaire(String amplitaire) {
		this.amplitaire = amplitaire;
	}

	//    @ManyToOne(fetch = FetchType.LAZY)
	//    public SygModeTraitement getModetraitement() {
	//	return modetraitement;
	//    }
	//
	//    public void setModetraitement(SygModeTraitement modetraitement) {
	//	this.modetraitement = modetraitement;
	//    }

	public String getCourrierRef() {
		return courrierRef;
	}

	public void setCourrierRef(String courrierRef) {
		this.courrierRef = courrierRef;
	}

	//    @ManyToOne(fetch = FetchType.LAZY)
	//    public SygNatureCourrier getNatureCourrier() {
	//	return natureCourrier;
	//    }
	//
	//    public void setNatureCourrier(SygNatureCourrier natureCourrier) {
	//	this.natureCourrier = natureCourrier;
	//    }

	public SygProjeReponse(){

	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getCourrierId() {
		return courrierId;
	}

	public void setCourrierId(Long courrierId) {
		this.courrierId = courrierId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datesaisie", length = 7)
	public Date getCourrierDateSaisie() {
		return courrierDateSaisie;
	}

	public void setCourrierDateSaisie(Date courrierDateSaisie) {
		this.courrierDateSaisie = courrierDateSaisie;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datereception", length = 7)
	public Date getCourrierDateReception() {
		return courrierDateReception;
	}

	public void setCourrierDateReception(Date courrierDateReception) {
		this.courrierDateReception = courrierDateReception;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datecourrier", length = 7)
	public Date getCourrierDate() {
		return courrierDate;
	}

	public void setCourrierDate(Date courrierDate) {
		this.courrierDate = courrierDate;
	}

	//    @Column(name = "reference",  length = 50)
	//    public String getCourrierReference() {
	//	return courrierReference;
	//    }
	//
	//    public void setCourrierReference(String courrierReference) {
	//	this.courrierReference = courrierReference;
	//    }

	@Column(name = "objetcourrier",  length = 200)
	public String getCourrierObjet() {
		return courrierObjet;
	}

	public void setCourrierObjet(String courrierObjet) {
		this.courrierObjet = courrierObjet;
	}

	@Column(name = "courrierautre",  length = 100)	
	public String getCourrierAutre() {
		return courrierAutre;
	}

	public void setCourrierAutre(String courrierAutre) {
		this.courrierAutre = courrierAutre;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "autoritecontractante")
	public SygAutoriteContractante getCourrierAutoriteContractante() {
		return courrierAutoriteContractante;
	}

	public void setCourrierAutoriteContractante(
			SygAutoriteContractante courrierAutoriteContractante) {
		this.courrierAutoriteContractante = courrierAutoriteContractante;
	}

	//    @ManyToOne(fetch = FetchType.EAGER)
	//    @JoinColumn(name = "modereception")
	//    public SygModeReception getCourrierModeReception() {
	//	return courrierModeReception;
	//    }
	//
	//    public void setCourrierModeReception(SygModeReception courrierModeReception) {
	//	this.courrierModeReception = courrierModeReception;
	//    }

	//    @ManyToOne(fetch = FetchType.EAGER)
	//    @JoinColumn(name = "typecourrier")
	//    public SygTypesCourrier getCourrierType() {
	//	return courrierType;
	//    }
	//
	//    public void setCourrierType(SygTypesCourrier courrierType) {
	//	this.courrierType = courrierType;
	//    }





}
