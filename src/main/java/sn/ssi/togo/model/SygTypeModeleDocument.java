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
import java.io.Serializable;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_typemodeledocument")
public class SygTypeModeleDocument  implements Serializable {
	private Long id;
	private SygModeleDocument document;
	private SygTypesDossiers dossiers;
	
	public SygTypeModeleDocument() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void SygCritere(Long id,SygModeleDocument document,SygTypesDossiers dossiers){
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "typesdossiers")
	public SygTypesDossiers getDossiers() {
		return dossiers;
	}
	public void setDossiers(SygTypesDossiers dossiers) {
		this.dossiers = dossiers;
	}
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "modeledocument")
	public SygModeleDocument getDocument() {
		return document;
	}
	public void setDocument(SygModeleDocument document) {
		this.document = document;
	}
}
