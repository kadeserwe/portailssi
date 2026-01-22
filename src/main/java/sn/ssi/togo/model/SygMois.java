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

@Entity
@Table(name = "syg_mois")
public class SygMois implements java.io.Serializable {
	private Integer id;
	private String code;
	private String libelle;
	private Integer ord;
	private SygAnnee annee;
	
	public SygMois() {
	}

	public SygMois(Integer id, String code, String libelle, SygAnnee annee) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.id = id;
		this.annee=annee;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 10)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "code", nullable = false, length = 25)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "libelle", nullable = false, length = 200)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	@Column(name = "ord")
	public Integer getOrd() {
		return ord;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="annee")
	public SygAnnee getAnnee() {
		return annee;
	}
	public void setAnnee(SygAnnee annee) {
		this.annee = annee;
	}


}
