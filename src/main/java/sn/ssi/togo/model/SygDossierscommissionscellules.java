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
@Table(name = "pmb_dossiercommissioncellules")
public class SygDossierscommissionscellules  implements java.io.Serializable{
	private Long id;
	private SygMembreCellulePassation membre;
	private SygDossiers dossier;
	
	

	public SygDossierscommissionscellules() {
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
	public SygMembreCellulePassation getMembre() {
		return membre;
	}
	public void setMembre(SygMembreCellulePassation membre) {
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


 	
	
}
