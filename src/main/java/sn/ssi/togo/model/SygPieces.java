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
@Table(name = "pmb_piece")
public class SygPieces  implements java.io.Serializable{
	private Long id;
	private String libelle,description,codepiece,localisation;
	private int type;
	private SygAutoriteContractante autorite;
	
	public SygPieces() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpiece",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	@Column(name = "description",  length = 255)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	@Column(name = "codepiece",  length = 10)
	public String getCodepiece() {
		return codepiece;
	}
	public void setCodepiece(String codepiece) {
		this.codepiece = codepiece;
	}

	
	@Column(name = "localisation",  length = 3)
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	@Column(name = "type",  length = 2)
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}


	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
	

	
	
}
