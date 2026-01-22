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
@Table(name = "pmb_garantie")
public class SygGarantiesDossiers  implements java.io.Serializable{
	private Long id;
	private SygPiecesrecus piece;
	private SygDossiers dossier;
	private SygAutoriteContractante autorite;
	private SygLots lot;
	private BigDecimal pourcentage,montant;
	
	

	public SygGarantiesDossiers() {
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
 	@JoinColumn(name = "garantieid")
    public SygPiecesrecus getPiece() {
		return piece;
	}
	public void setPiece(SygPiecesrecus piece) {
		this.piece = piece;
	}

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossier")
	public SygDossiers getDossier() {
		return dossier;
	}
 	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}

 	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "ac")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}

	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
	
 	
	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "lot")
    public SygLots getLot() {
		return lot;
	}
	public void setLot(SygLots lot) {
		this.lot = lot;
	}


	
	@Column(name = "pourcentage",  length = 255)
	public BigDecimal getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(BigDecimal pourcentage) {
		this.pourcentage = pourcentage;
	}



	@Column(name = "montant")
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	

}
