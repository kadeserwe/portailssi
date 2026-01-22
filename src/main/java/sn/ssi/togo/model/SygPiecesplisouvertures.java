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
@Table(name = "pmb_piecesplisouvertures")
public class SygPiecesplisouvertures  implements java.io.Serializable{
	private Long id;
	private SygDossiers dossier;
	private SygPieces piece;
	private SygPlisouvertures plis;
	private String etat,libelle;

	

	

	public SygPiecesplisouvertures() {
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
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
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
 	@JoinColumn(name = "pliouverture_id")
	public SygPlisouvertures getPlis() {
		return plis;
	}
	public void setPlis(SygPlisouvertures plis) {
		this.plis = plis;
	}

	@Column(name = "etat",  length = 10)
	public String getEtat() {
		return etat;
	}
 	public void setEtat(String etat) {
		this.etat = etat;
	}


 	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


 


	
}
