package sn.ssi.togo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sygfilesac")
public class SygFilesAc implements Serializable {

    private long id;
    private String nameFile;
    private String fileSrc;
    private Date dateFile;
    private String objectFile;
    private SygCourrierAc courrier;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
	return id;
    }



    public void setId(long id) {
	this.id = id;
    }



    public String getNameFile() {
	return nameFile;
    }



    public void setNameFile(String nameFile) {
	this.nameFile = nameFile;
    }



    public String getFileSrc() {
	return fileSrc;
    }



    public void setFileSrc(String fileSrc) {
	this.fileSrc = fileSrc;
    }



    public Date getDateFile() {
	return dateFile;
    }



    public void setDateFile(Date dateFile) {
	this.dateFile = dateFile;
    }



    public String getObjectFile() {
	return objectFile;
    }



    public void setObjectFile(String objectFile) {
	this.objectFile = objectFile;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    public SygCourrierAc getCourrier() {
	return courrier;
    }



    public void setCourrier(SygCourrierAc courrier) {
	this.courrier = courrier;
    }



    public SygFilesAc() {
	// TODO Auto-generated constructor stub
    }

}
