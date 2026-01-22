package sn.ssi.togo.model;
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
@Table(name = "pmb_observateursindependants")
public class SygObservateursIndependants  implements java.io.Serializable{
	private Long id;
	private SygDossiers dossier;
	private String representant,qualite,presence;
	private Date dateconvocation;
	private int etape;
	

	

	public SygObservateursIndependants() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpresenceouverture",  length = 255)
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



 	@Column(name = "representant",  length = 255)
 	public String getRepresentant() {
		return representant;
	}
	public void setRepresentant(String representant) {
		this.representant = representant;
	}


	@Column(name = "qualite",  length = 255)
	public String getQualite() {
		return qualite;
	}
 	public void setQualite(String qualite) {
		this.qualite = qualite;
	}


 	@Column(name = "presence",  length = 255)
	public String getPresence() {
		return presence;
	}
 	public void setPresence(String presence) {
		this.presence = presence;
	}


 	@Temporal(TemporalType.DATE)
	@Column(name = "dateconvocation", length = 7)
	public Date getDateconvocation() {
		return dateconvocation;
	}
	public void setDateconvocation(Date dateconvocation) {
		this.dateconvocation = dateconvocation;
	}


	@Column(name = "etape",  length = 3)
	public int getEtape() {
		return etape;
	}
	public void setEtape(int etape) {
		this.etape = etape;
	}



	
}
