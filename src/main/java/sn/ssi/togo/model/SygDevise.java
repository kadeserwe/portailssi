package sn.ssi.togo.model;

import java.math.BigDecimal;

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
@Table(name = "pmb_devise")
public class SygDevise  implements java.io.Serializable{
	private Long devId;
	private SygDossiers dossier;
	private SygMonnaieoffre monnaie;
	private BigDecimal devTauxConversion;
	


	public SygDevise() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "devid",  length = 255)
	public Long getDevId() {
		return devId;
	}
	public void setDevId(Long devId) {
		this.devId = devId;
	}
	

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "moncode")
	public SygMonnaieoffre getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(SygMonnaieoffre monnaie) {
		this.monnaie = monnaie;
	}

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}

	
	@Column(name = "devtauxconversion")
	public BigDecimal getDevTauxConversion() {
		return devTauxConversion;
	}
	public void setDevTauxConversion(BigDecimal devTauxConversion) {
		this.devTauxConversion = devTauxConversion;
	}
	
	
}
