package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_natureprix")
public class SygNatureprix  implements java.io.Serializable{
	private Long natId;
	private String natCode,natLibelle;
	
	
	public SygNatureprix() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "natid",  length = 255)
	public Long getNatId() {
		return natId;
	}
	public void setNatId(Long natId) {
		this.natId = natId;
	}
	
	@Column(name = "natcode",  length = 255)
	public String getNatCode() {
		return natCode;
	}
	public void setNatCode(String natCode) {
		this.natCode = natCode;
	}

	
	@Column(name = "natlibelle",  length = 255)
	public String getNatLibelle() {
		return natLibelle;
	}
	public void setNatLibelle(String natLibelle) {
		this.natLibelle = natLibelle;
	}
	

	
}
