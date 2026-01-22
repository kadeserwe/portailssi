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
@Table(name = "pmb_typedemande")
public class SygTypeDemande  implements Serializable {
	private Long   id;
	private String libelle;
	private String description;
	
	public SygTypeDemande() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygTypeDemande(Long id, String libelle,String description){
		this.id=id;
		this.libelle=libelle;
		this.description=description;
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

}
