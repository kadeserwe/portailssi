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
@Table(name = "sys_modules_profil")
public class SysProfilModule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long   pfId;
	private SysModule module;
	private SysProfil profil;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getPfId() {
		return this.pfId;
	}
	public void setPfId(Long pfId) {
		this.pfId = pfId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mod_code", nullable = false)
	public SysModule getModule() {
		return this.module;
	}
	public void setModule(SysModule module) {
		this.module = module;
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pf_code", nullable = false)
	public SysProfil getProfil() {
		return profil;
	}
	public void setProfil(SysProfil profil) {
		this.profil = profil;
	}


	
	
}
