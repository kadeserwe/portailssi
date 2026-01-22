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

//import sn.ssi.sygmap.be.workflow.entity.SysState;

@Entity
@Table(name="syg_tdossiercourrier")
public class SygTDossierCourrier implements Serializable {

    private long id;
    private String code;
    private String libelle;
    private Date dateStatus;
    private Date dateTransmis;
    private String status;
    private String description;

    private SygDossierCourrier courrier;
    //private SysState state;
    private SygBureauxdcmp bureau;
    private Utilisateur expediteur;
    private long destinataire;
    private String instruction;
    private boolean notificationParMail,accuseReception;
    private Date tdateMaxTraitement;;


    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tbureau")
    public SygBureauxdcmp getBureau() {
	return bureau;
    }


    public void setBureau(SygBureauxdcmp bureau) {
	this.bureau = bureau;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="datemaxtrait")
    public Date getTdateMaxTraitement() {
		return tdateMaxTraitement;
	}


	public void setTdateMaxTraitement(Date tdateMaxTraitement) {
		this.tdateMaxTraitement = tdateMaxTraitement;
	}



	@Temporal(TemporalType.DATE)
    @Column(name="datetarnsmis")
    public Date getDateTransmis() {
	return dateTransmis;
    }


    public void setDateTransmis(Date dateTransmis) {
	this.dateTransmis = dateTransmis;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", length = 12, nullable = false, unique = true)
    public long getId() {
	return id;
    }


    public void setId(long id) {
	this.id = id;
    }


    @Column(name="code", length = 25)
    public String getCode() {
	return code;
    }


    public void setCode(String code) {
	this.code = code;
    }


    @Column(name="libelle", length = 255)
    public String getLibelle() {
	return libelle;
    }


    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }


    @Temporal(TemporalType.DATE)
    @Column(name="datestatut", length = 9)
    public Date getDateStatus() {
	return dateStatus;
    }


    public void setDateStatus(Date dateStatus) {
	this.dateStatus = dateStatus;
    }


    @Column(name="statut", length = 255)
    public String getStatus() {
	return status;
    }


    public void setStatus(String status) {
	this.status = status;
    }


    @Column(name="descript", length = 255)
    public String getDescription() {
	return description;
    }


    public void setDescription(String description) {
	this.description = description;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="courrier")
    public SygDossierCourrier getCourrier() {
	return courrier;
    }


    public void setCourrier(SygDossierCourrier courrier) {
	this.courrier = courrier;
    }


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="state")
//    public SysState getState() {
//	return state;
//    }
//
//
//    public void setState(SysState state) {
//	this.state = state;
//    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="expediteur")
    public Utilisateur getExpediteur() {
	return expediteur;
    }


    public void setExpediteur(Utilisateur expediteur) {
	this.expediteur = expediteur;
    }


    @Column(name="destinataire", length = 12)
    public long getDestinataire() {
	return destinataire;
    }


    public void setDestinataire(long destinataire) {
	this.destinataire = destinataire;
    }


    @Column(name="instructions", length = 500)
    public String getInstruction() {
	return instruction;
    }


    public void setInstruction(String instruction) {
	this.instruction = instruction;
    }


    public SygTDossierCourrier() {
	// TODO Auto-generated constructor stub
    }


    @Column(name = "tnotifmail")
    public boolean isNotificationParMail() {
	return notificationParMail;
    }


    public void setNotificationParMail(boolean notificationParMail) {
	this.notificationParMail = notificationParMail;
    }


    @Column(name = "taccusereception")
    public boolean isAccuseReception() {
	return accuseReception;
    }


    public void setAccuseReception(boolean accuseReception) {
	this.accuseReception = accuseReception;
    }



	

}
