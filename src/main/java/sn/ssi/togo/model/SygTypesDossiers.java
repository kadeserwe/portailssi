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
@Table(name = "pmb_typesdossiers")
public class SygTypesDossiers  implements Serializable {
	private Long Id;
	private String code;
	private String libelle;
	private String description;
	private Integer delaitraitement,delairevue,delaicorrigee;
	
	public SygTypesDossiers() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long Id,String code,String libelle,Integer delaitraitement,String description){
		this.Id=Id;
		this.code=code;
		this.libelle=libelle;
		this.delaitraitement=delaitraitement;
		this.description=description;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getId() {
		return Id;
	}
	public void setId(Long Id) {
		this.Id = Id;
	}
	@Column(name = "code",  length = 10)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name = "libelle",  length = 10)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Column(name = "delaitraitement",  length = 10)
	public Integer getDelaitraitement() {
		return delaitraitement;
	}
	public void setDelaitraitement(Integer delaitraitement) {
		this.delaitraitement = delaitraitement;
	}
	@Column(name = "description",  length = 10)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "delairevue",  length = 15)
	public Integer getDelairevue() {
		return delairevue;
	}
	public void setDelairevue(Integer delairevue) {
		this.delairevue = delairevue;
	}
	
	@Column(name = "delaicorrigee",  length = 15)
	public Integer getDelaicorrigee() {
		return delaicorrigee;
	}
	public void setDelaicorrigee(Integer delaicorrigee) {
		this.delaicorrigee = delaicorrigee;
	}
}
