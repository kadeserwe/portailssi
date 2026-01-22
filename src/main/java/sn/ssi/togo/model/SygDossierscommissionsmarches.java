package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_dossiercommissionmarche")
public class SygDossierscommissionsmarches  implements java.io.Serializable{
	private Long id;
	private SygMembresCommissionsMarches membre;
	private SygDossiers dossier;
	private int flagpresenceevaluation,etapePI;
	
	

	public SygDossierscommissionsmarches() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "commissionmarche_id")
	public SygMembresCommissionsMarches getMembre() {
		return membre;
	}
	public void setMembre(SygMembresCommissionsMarches membre) {
		this.membre = membre;
	}

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
 	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}


 	@Column(name = "flagpresenceevaluation",length=1)
	public int getFlagpresenceevaluation() {
		return flagpresenceevaluation;
	}
	public void setFlagpresenceevaluation(int flagpresenceevaluation) {
		this.flagpresenceevaluation = flagpresenceevaluation;
	}


	@Column(name = "etapepi",length=1)
	public int getEtapePI() {
		return etapePI;
	}
    public void setEtapePI(int etapePI) {
		this.etapePI = etapePI;
	}
 	
 	
 	
	
}
