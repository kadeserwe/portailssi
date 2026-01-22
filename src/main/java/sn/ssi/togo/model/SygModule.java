package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "syg_module")
public class SygModule implements java.io.Serializable {

	private Integer id;
	private String code;
	private String libelle;
	private String commentaire;
	private String cible;
	private String prerequi;
	private Long volumhoraire;
	private String object;
	private String prog;

	public SygModule() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 10)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "libelle", length = 200)
	public String getLibelle() {
		return this.libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Column(name = "commentaire", length = 255)
	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "cible")
	public String getCible() {
		return cible;
	}

	public void setCible(String cible) {
		this.cible = cible;
	}
	@Column(name = "prereki")
	public String getPrerequi() {
		return prerequi;
	}

	public void setPrerequi(String prerequi) {
		this.prerequi = prerequi;
	}

	@Column(name = "vhoraire")
	public Long getVolumhoraire() {
		return volumhoraire;
	}

	public void setVolumhoraire(Long volumhoraire) {
		this.volumhoraire = volumhoraire;
	}

	@Column(name = "object")
	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}
	@Column(name = "prog")
	public String getProg() {
		return prog;
	}

	public void setProg(String prog) {
		this.prog = prog;
	}
	

}
