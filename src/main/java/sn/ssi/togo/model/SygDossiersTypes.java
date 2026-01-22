package sn.ssi.togo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_dossiertype")
public class SygDossiersTypes  implements java.io.Serializable{
	private Long iddossiers;
	private String numdossiers;
	private String libelledossiers;
	private String descriptiondossiertype;
	private Long nbfichier;
	private Long niveau_dossiertype;
	private Date datecreation;
	private String Typedossier;
	
	public SygDossiersTypes() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long iddossiers, String libelledossiers,String Typedossiers){
		this.iddossiers=iddossiers;
		this.libelledossiers=libelledossiers;
		this.Typedossier=Typedossiers;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getIddossiers() {
		return iddossiers;
	}
	public void setIddossiers(Long iddossiers) {
		this.iddossiers = iddossiers;
	}
	@Column(name = "libelledossiertype",  length = 10)
	public String getLibelledossiers() {
		return libelledossiers;
	}
	public void setLibelledossiers(String libelledossiers) {
		this.libelledossiers = libelledossiers;
	}
	@Column(name = "typedossier",  length = 10)
	public String getTypedossier() {
		return Typedossier;
	}
	public void setTypedossier(String typedossier) {
		Typedossier = typedossier;
	}
	
	@Column(name = "numdossier",  length =50)
	public String getNumdossiers() {
		return numdossiers;
	}
	public void setNumdossiers(String numdossiers) {
		this.numdossiers = numdossiers;
	}
	
	@Column(name = "descriptiondossiertype",  length = 255)
	public String getDescriptiondossiertype() {
		return descriptiondossiertype;
	}
	public void setDescriptiondossiertype(String descriptiondossiertype) {
		this.descriptiondossiertype = descriptiondossiertype;
	}
	
	@Column(name = "nbfichier")
	public Long getNbfichier() {
		return nbfichier;
	}
	public void setNbfichier(Long nbfichier) {
		this.nbfichier = nbfichier;
	}
	
	@Column(name = "niveau_dossiertype")
	public Long getNiveau_dossiertype() {
		return niveau_dossiertype;
	}
	public void setNiveau_dossiertype(Long niveauDossiertype) {
		niveau_dossiertype = niveauDossiertype;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datecreation", length = 7)
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	

}
