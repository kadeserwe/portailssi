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
@Table(name = "pmb_courriers_audits")
public class SygCourrierAudits implements java.io.Serializable {

    private Long  courrierId;
    private Date courrierDateSaisie;
    private Date courrierDateReception;
    private Date courrierDate;
    private String courrierReference;
    private String courrierObjet;
    private String courrierOrigine;
    private String courrierCommentaire,fichier,fichier2;
    private String statut;
    private Date Datepubrapport;//Date publication rapport final
    private SygContratsPrestataires prestataire;

	


	private SygAuditsPrestataires autoriteauditspres;
	private SygAudit audit;

    
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

    @Column(name = "reference",  length = 50)
    public String getCourrierReference() {
	return courrierReference;
    }

    public void setCourrierReference(String courrierReference) {
	this.courrierReference = courrierReference;
    }

    @Column(name = "objetcourrier",  length = 200)
    public String getCourrierObjet() {
	return courrierObjet;
    }

    public void setCourrierObjet(String courrierObjet) {
	this.courrierObjet = courrierObjet;
    }

    @Column(name = "courrierorigine",  length = 100)	
    public String getCourrierOrigine() {
	return courrierOrigine;
    }

    public void setCourrierOrigine(String courrierOrigine) {
	this.courrierOrigine = courrierOrigine;
    }
    @Column(name = "courriercommentaire",  length = 100)
	public String getCourrierCommentaire() {
		return courrierCommentaire;
	}

	public void setCourrierCommentaire(String courrierCommentaire) {
		this.courrierCommentaire = courrierCommentaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "autoriteauditspres")
	public SygAuditsPrestataires getAutoriteauditspres() {
		return autoriteauditspres;
	}

	public void setAutoriteauditspres(SygAuditsPrestataires autoriteauditspres) {
		this.autoriteauditspres = autoriteauditspres;
	}

	
	
	 @Column(name = "fichier",  length = 255)
	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "audit")
	public SygAudit getAudit() {
		return audit;
	}

	public void setAudit(SygAudit audit) {
		this.audit = audit;
	}

	@Column(name = "statut",  length = 10)
	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Temporal(TemporalType.DATE)
	 @Column(name = "datepubrapport", length = 7)
	
	public Date getDatepubrapport() {
		return Datepubrapport;
	}

	public void setDatepubrapport(Date datepubrapport) {
		Datepubrapport = datepubrapport;
	}

	
	 @Column(name = "fichier2",  length = 255)
	public String getFichier2() {
		return fichier2;
	}
	 

	public void setFichier2(String fichier2) {
		this.fichier2 = fichier2;
	}
	

	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "prestataire")
	public SygContratsPrestataires getPrestataire() {
		return prestataire;
	}
    public void setPrestataire(SygContratsPrestataires prestataire) {
		this.prestataire = prestataire;
	}
	
	
	

}
