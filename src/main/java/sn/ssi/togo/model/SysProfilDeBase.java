package sn.ssi.togo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sys_profil_debase")
public class SysProfilDeBase implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pfCode;
	private String pfLibelle;
	private String pfDescription;

	@Id
	@Column(name = "pfcode", unique = true,  length = 32)
	public String getPfCode() {
		return this.pfCode;
	}

	public void setPfCode(String pfCode) {
		this.pfCode = pfCode;
	}

	@Column(name = "pf_libelle", length = 128)
	public String getPfLibelle() {
		return this.pfLibelle;
	}

	public void setPfLibelle(String libelle) {
		this.pfLibelle = libelle;
	}

	@Column(name = "pf_description", length = 255)
	public String getPfDescription() {
		return this.pfDescription;
	}

	public void setPfDescription(String description) {
		this.pfDescription = description;
	}



}
