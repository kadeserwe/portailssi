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
@Table(name = "pmb_dossiersouscritere")
public class SygDossierssouscriteres  implements java.io.Serializable{
	private Long id;
	private SygDossiers dossier;
	private SygCritere critere;
	private BigDecimal note;
	private SygLots lot;

	

	public SygDossierssouscriteres() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 255)
	public Long getId() {
		return id;
	}
	public BigDecimal getNote() {
		return note;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossier_id")
	public SygDossiers getDossier() {
		return dossier;
	}
 	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}



	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "souscritere_id")
	public SygCritere getCritere() {
		return critere;
	}
	public void setCritere(SygCritere critere) {
		this.critere = critere;
	}
 	
 	
	@Column(name = "note",  length = 11)
	public void setNote(BigDecimal note) {
		this.note = note;
	}
	public void setId(Long id) {
		this.id = id;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "lot")
	public SygLots getLot() {
		return lot;
	}
	public void setLot(SygLots lot) {
		this.lot = lot;
	}
	
   
	
}
