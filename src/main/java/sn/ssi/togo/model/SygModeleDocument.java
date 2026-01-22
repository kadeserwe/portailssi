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
@Table(name = "pmb_modeledocument")
public class SygModeleDocument  implements java.io.Serializable{
	private Long Id;
	private String code;
	private String libelle;
	private String fichier;
	private String description;
	
	public SygModeleDocument() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long Id,String code,String libelle,String fichier,String description){
		this.Id=Id;
		this.code=code;
		this.libelle=libelle;
		this.fichier=fichier;
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
	@Column(name = "description",  length = 10)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "fichier",  length = 254)
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
}
