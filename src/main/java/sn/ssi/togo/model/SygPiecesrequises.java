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
@Table(name = "pmb_piecesrequises")
public class SygPiecesrequises  implements java.io.Serializable{
	private Long idpiecesrequises;
	private SygPieces piece;
	private SygTypesDossiers dossiers;

	
	public SygPiecesrequises() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idpiecesrequises,SygPieces piece,SygTypesDossiers dossiers){
	
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpiecesrequises",  length = 10)
	public Long getIdpiecesrequises() {
		return idpiecesrequises;
	}
	public void setIdpiecesrequises(Long idpiecesrequises) {
		this.idpiecesrequises = idpiecesrequises;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "idpiece")
	public SygPieces getPiece() {
		return piece;
	}
	public void setPiece(SygPieces piece) {
		this.piece = piece;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "id")
	public SygTypesDossiers getDossiers() {
		return dossiers;
	}
	public void setDossiers(SygTypesDossiers dossiers) {
		this.dossiers = dossiers;
	}
	

}
