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
@Entity
@Table(name = "pmb_tcourriers_ac")
public class SygTCourrierAC implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long  tcourrierId;
    private SygCourrierAc courrierac;
    private Date tcourrierDateSaisie;
    private Date tdateImputation;
    private Date tdateMaxTraitement;
    private Utilisateur agent;
    private SygBureauxdcmp bureau;
    private Long idOrigne;	
    private String tcourrierInstruction,timputationPour,imputerpar;
    private boolean notificationParMail,accuseReception,impForGroup;
    private SygModeTraitement modetraitement;
    
    public SygTCourrierAC(){

    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "tid",  length = 10)
    public Long getTcourrierId() {
	return tcourrierId;
    }


    public void setTcourrierId(Long tcourrierId) {
	this.tcourrierId = tcourrierId;
    }


    @Temporal(TemporalType.DATE)
    @Column(name = "tdatesaisie", length = 7)
    public Date getTcourrierDateSaisie() {
	return tcourrierDateSaisie;
    }


    public void setTcourrierDateSaisie(Date tcourrierDateSaisie) {
	this.tcourrierDateSaisie = tcourrierDateSaisie;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agentdestinataire")
    public Utilisateur getAgent() {
	return agent;
    }


    public void setAgent(Utilisateur agent) {
	this.agent = agent;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tbureau")
    public SygBureauxdcmp getBureau() {
	return bureau;
    }


    public void setBureau(SygBureauxdcmp bureau) {
	this.bureau = bureau;
    }


    @Column(name = "tidorigine")	
    public Long getIdOrigne() {
	return idOrigne;
    }


    public void setIdOrigne(Long idOrigne) {
	this.idOrigne = idOrigne;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tcourrierac")
    public SygCourrierAc getCourrierac() {
	return courrierac;
    }


    public void setCourrierac(SygCourrierAc courrierac) {
	this.courrierac = courrierac;
    }


    @Column(name = "tcourrierinstruction",  length = 50)
    public String getTcourrierInstruction() {
	return tcourrierInstruction;
    }


    public void setTcourrierInstruction(String tcourrierInstruction) {
	this.tcourrierInstruction = tcourrierInstruction;
    }


    @Temporal(TemporalType.DATE)
    @Column(name = "tdateimputation", length = 7)
    public Date getTdateImputation() {
	return tdateImputation;
    }


    public void setTdateImputation(Date tdateImputation) {
	this.tdateImputation = tdateImputation;
    }


    @Temporal(TemporalType.DATE)
    @Column(name = "tdatemaxtraitement", length = 7)
    public Date getTdateMaxTraitement() {
	return tdateMaxTraitement;
    }


    public void setTdateMaxTraitement(Date tdateMaxTraitement) {
	this.tdateMaxTraitement = tdateMaxTraitement;
    }


    @Column(name = "timputationpour",  length = 20)
    public String getTimputationPour() {
	return timputationPour;
    }


    public void setTimputationPour(String timputationPour) {
	this.timputationPour = timputationPour;
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

    @Column(name = "imputerpar")	
	public String getImputerpar() {
		return imputerpar;
	}
	public void setImputerpar(String imputerpar) {
		this.imputerpar = imputerpar;
	}


	@Column(name = "impforgroup")
	public boolean isImpForGroup() {
		return impForGroup;
	}


	public void setImpForGroup(boolean impForGroup) {
		this.impForGroup = impForGroup;
	}


	 @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "idmodetraitement")
	public SygModeTraitement getModetraitement() {
		return modetraitement;
	}
	public void setModetraitement(SygModeTraitement modetraitement) {
		this.modetraitement = modetraitement;
	}

	
	
	
}
