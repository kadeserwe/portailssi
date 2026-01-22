package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_pays")
public class SygPays  implements java.io.Serializable{
	private Long idpays;
	private String libelle;
	private String codepays;
	
	public SygPays() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long idpays, String libelle,String codepays){
		this.idpays=idpays;
		this.libelle=libelle;
		this.codepays=codepays;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpays",  length = 10)
	public Long getIdpays() {
		return idpays;
	}
	public void setIdpays(Long idpays) {
		this.idpays = idpays;
	}
	
	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Column(name = "codepays",  length = 255)
	public String getCodepays() {
		return codepays;
	}
	public void setCodepays(String codepays) {
		this.codepays = codepays;
	}



}
