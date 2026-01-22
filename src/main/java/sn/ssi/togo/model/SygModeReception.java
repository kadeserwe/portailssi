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
@Table(name = "pmb_modereception")
public class SygModeReception  implements java.io.Serializable{
	private Long idmodereception;
	private String libellemodereception;
	private String codemodereception;
	private String descriptionmodereception;
	
	public SygModeReception() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idmodereception, String libellemodereception,String codemodereception,String descriptionmodereception){
		this.idmodereception=idmodereception;
		this.libellemodereception=libellemodereception;
		this.setCodemodereception(codemodereception);
		this.descriptionmodereception=descriptionmodereception;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idmodereception",  length = 10)
	public Long getIdmodereception() {
		return idmodereception;
	}
	public void setIdmodereception(Long idmodereception) {
		this.idmodereception = idmodereception;
	}
	@Column(name = "libellemodereception",  length = 10)
	public String getLibellemodereception() {
		return libellemodereception;
	}
	public void setLibellemodereception(String libellemodereception) {
		this.libellemodereception = libellemodereception;
	}
	@Column(name = "descriptionmodereception",  length = 10)
	public String getDescriptionmodereception() {
		return descriptionmodereception;
	}
	public void setDescriptionmodereception(String descriptionmodereception) {
		this.descriptionmodereception = descriptionmodereception;
	}
	@Column(name = "codemodereception",  length = 10)
	public String getCodemodereception() {
		return codemodereception;
	}
	public void setCodemodereception(String codemodereception) {
		this.codemodereception = codemodereception;
	}

}
