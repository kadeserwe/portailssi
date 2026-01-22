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

//import sn.ssi.sygmap.be.workflow.entity.SysState;

@Entity
@Table(name="sygdossiercourrier")
public class SygDossierCourrier implements Serializable {

    private long id;
    private String code;
    private String libelle;
    private Date dateStatus;
    private String status;
    private String description;
    private SygTypesDossiers typesDossiers;
    //private SysState state;
    private Long userId;
    private SygAutoriteContractante autoriteContractante;
    private SygPlansdepassation plansdepassation;
    private SygRealisations realisation;
    private int issue;








    @Column(name="issue", length=11)
    public int getIssue() {
	return issue;
    }



    public void setIssue(int issue) {
	this.issue = issue;
    }



    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="id_plan")
    public SygPlansdepassation getPlansdepassation() {
	return plansdepassation;
    }



    public void setPlansdepassation(SygPlansdepassation plansdepassation) {
	this.plansdepassation = plansdepassation;
    }



    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="id_realisation")
    public SygRealisations getRealisation() {
	return realisation;
    }



    public void setRealisation(SygRealisations realisation) {
	this.realisation = realisation;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_ac")
    public SygAutoriteContractante getAutoriteContractante() {
	return autoriteContractante;
    }



    public void setAutoriteContractante(SygAutoriteContractante autoriteContractante) {
	this.autoriteContractante = autoriteContractante;
    }



    public Long getUserId() {
	return userId;
    }



    public void setUserId(Long userId) {
	this.userId = userId;
    }



//    @ManyToOne(fetch = FetchType.LAZY)
//    public SysState getState() {
//	return state;
//    }
//
//
//
//    public void setState(SysState state) {
//	this.state = state;
//    }
//


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
	return id;
    }



    public void setId(long id) {
	this.id = id;
    }



    public String getCode() {
	return code;
    }



    public void setCode(String code) {
	this.code = code;
    }



    public String getLibelle() {
	return libelle;
    }



    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }



    public Date getDateStatus() {
	return dateStatus;
    }



    public void setDateStatus(Date dateStatus) {
	this.dateStatus = dateStatus;
    }



    public String getStatus() {
	return status;
    }



    public void setStatus(String status) {
	this.status = status;
    }



    public String getDescription() {
	return description;
    }



    public void setDescription(String description) {
	this.description = description;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    public SygTypesDossiers getTypesDossiers() {
	return typesDossiers;
    }



    public void setTypesDossiers(SygTypesDossiers typesDossiers) {
	this.typesDossiers = typesDossiers;
    }



    public SygDossierCourrier() {
	// TODO Auto-generated constructor stub
    }

}
