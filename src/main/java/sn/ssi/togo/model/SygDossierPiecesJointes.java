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
@Table(name="sygdossierpiecesjointes")
public class SygDossierPiecesJointes implements Serializable {

    private long id;
    private String nameFile;
    private String fileSrc;
    private Date dateFile;
    private String objectFile;
    private SygDossierCourrier dossierCourrier;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", length=11, nullable=false, unique=true)
    public long getId() {
	return id;
    }


    public void setId(long id) {
	this.id = id;
    }


    @Column(name="name_file", length=100)
    public String getNameFile() {
	return nameFile;
    }


    public void setNameFile(String nameFile) {
	this.nameFile = nameFile;
    }


    @Column(name="src_file", length=100)
    public String getFileSrc() {
	return fileSrc;
    }


    public void setFileSrc(String fileSrc) {
	this.fileSrc = fileSrc;
    }


    @Temporal(TemporalType.DATE)
    @Column(name="datefile", length=9)
    public Date getDateFile() {
	return dateFile;
    }


    public void setDateFile(Date dateFile) {
	this.dateFile = dateFile;
    }


    @Column(name="objectfile", length=500)
    public String getObjectFile() {
	return objectFile;
    }


    public void setObjectFile(String objectFile) {
	this.objectFile = objectFile;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_dossier")
    public SygDossierCourrier getDossierCourrier() {
	return dossierCourrier;
    }


    public void setDossierCourrier(SygDossierCourrier dossierCourrier) {
	this.dossierCourrier = dossierCourrier;
    }


    public SygDossierPiecesJointes() {
	// TODO Auto-generated constructor stub
    }

}
