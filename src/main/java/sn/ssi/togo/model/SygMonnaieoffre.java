package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_monnaieoffre")
public class SygMonnaieoffre  implements java.io.Serializable{
	private Long monId;
	private String monCode,monLibelle;
	
	
	public SygMonnaieoffre() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "monid",  length = 255)
	public Long getMonId() {
		return monId;
	}
	public void setMonId(Long monId) {
		this.monId = monId;
	}
	
	@Column(name = "moncode", length = 255)
	public String getMonCode() {
		return monCode;
	}
	public void setMonCode(String monCode) {
		this.monCode = monCode;
	}

	
	@Column(name = "monlibelle",  length = 255)
	public String getMonLibelle() {
		return monLibelle;
	}
	public void setMonLibelle(String monLibelle) {
		this.monLibelle = monLibelle;
	}
	

	
}
