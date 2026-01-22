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
@Table(name = "syg_curssusetmodule")
public class SygCurssusetModules implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private SygModule module;
	private SygCurssus curssus;
	private Integer ordre;
	private Long vhoraire;
	
	public SygCurssusetModules() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, length = 10)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ordre")
	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	
	@Column(name = "volume_horaire")
	public Long getVhoraire() {
		return vhoraire;
	}

	public void setVhoraire(Long vhoraire) {
		this.vhoraire = vhoraire;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "module_id")
	public SygModule getModule() {
		return module;
	}

	public void setModule(SygModule module) {
		this.module = module;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "curssus_id")
	public SygCurssus getCurssus() {
		return curssus;
	}

	public void setCurssus(SygCurssus curssus) {
		this.curssus = curssus;
	}

	
}
