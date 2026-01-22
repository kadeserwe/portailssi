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
@Table(name = "pmb_dossierpiece")
public class SygDossierspieces  implements java.io.Serializable{
	private Long id;
	private SygPieces piece;
	private SygDossiers dossier;
	
	

	public SygDossierspieces() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "dospiid",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "piece_id")
    public SygPieces getPiece() {
		return piece;
	}
	public void setPiece(SygPieces piece) {
		this.piece = piece;
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
