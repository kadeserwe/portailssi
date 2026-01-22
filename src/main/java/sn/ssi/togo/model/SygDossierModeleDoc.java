package sn.ssi.togo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sygdossiermodeldoc")
public class SygDossierModeleDoc implements Serializable {
    private long id;
    private int statut = 0;
    private SygTypeModeleDocument modeleDocument;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modeldoc")
    public SygTypeModeleDocument getModeleDocument() {
	return modeleDocument;
    }


    public void setModeleDocument(SygTypeModeleDocument modeleDocument) {
	this.modeleDocument = modeleDocument;
    }


    private SygDossierCourrier dossierCourrier;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable= false, unique= true , length=11)
    public long getId() {
	return id;
    }


    public void setId(long id) {
	this.id = id;
    }


    @Column(name="statut",  length=11)
    public int getStatut() {
	return statut;
    }


    public void setStatut(int statut) {
	this.statut = statut;
    }






    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier")
    public SygDossierCourrier getDossierCourrier() {
	return dossierCourrier;
    }


    public void setDossierCourrier(SygDossierCourrier dossierCourrier) {
	this.dossierCourrier = dossierCourrier;
    }



}
