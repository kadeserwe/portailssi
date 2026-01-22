package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_nature_garantie")
public class SygNaturesGarantie  implements java.io.Serializable{
	private Long id;
	private String libelle;
	
	
	public SygNaturesGarantie() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long id, String libelle){
		this.id=id;
		this.libelle=libelle;
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
	
	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	




}
