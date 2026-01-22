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


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_resultatnegociation")
public class SygResultatNegociation  implements Serializable {
	private Long id;
	private SygDossiers dossier;
	private SygAppelsOffres appel;
	private SygAutoriteContractante autorite;
	private String renResultat;
	private Date renDate;






	public SygResultatNegociation() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iddocument",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
 	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}

 	
 	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "appelsoffres_id")
	public SygAppelsOffres getAppel() {
		return appel;
	}
	public void setAppel(SygAppelsOffres appel) {
		this.appel = appel;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}



	@Column(name = "renresultat",  length = 255)
	public String getRenResultat() {
		return renResultat;
	}
	public void setRenResultat(String renResultat) {
		this.renResultat = renResultat;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "rendate", length = 7)
	public Date getRenDate() {
		return renDate;
	}
	public void setRenDate(Date renDate) {
		this.renDate = renDate;
	}
    
}
