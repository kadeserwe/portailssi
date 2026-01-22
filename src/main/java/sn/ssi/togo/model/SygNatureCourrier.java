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
@Table(name = "pmb_naturecourrier")
public class SygNatureCourrier  implements java.io.Serializable{
	private Long idnaturecourrier;
	private String libellenaturecourrier;
	private String codenaturecourrier;
	private String descriptionnaturecourrier;
	
	public SygNatureCourrier() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idnaturecourrier, String libellenaturecourrier,String codenaturecourrier,String descriptionnaturecourrier){
		this.idnaturecourrier=idnaturecourrier;
		this.libellenaturecourrier=libellenaturecourrier;
		this.codenaturecourrier=codenaturecourrier;
		this.descriptionnaturecourrier=descriptionnaturecourrier;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idnaturecourrier",  length = 10)
	public Long getIdnaturecourrier() {
		return idnaturecourrier;
	}
	public void setIdnaturecourrier(Long idnaturecourrier) {
		this.idnaturecourrier = idnaturecourrier;
	}
	@Column(name = "libellenaturecourrier",  length = 10)
	public String getLibellenaturecourrier() {
		return libellenaturecourrier;
	}
	public void setLibellenaturecourrier(String libellenaturecourrier) {
		this.libellenaturecourrier = libellenaturecourrier;
	}

	@Column(name = "descriptionnaturecourrier",  length = 10)
	public String getDescriptionnaturecourrier() {
		return descriptionnaturecourrier;
	}
	public void setDescriptionnaturecourrier(String descriptionnaturecourrier) {
		this.descriptionnaturecourrier = descriptionnaturecourrier;
	}
	@Column(name = "codenaturecourrier",  length = 10)
	public String getCodenaturecourrier() {
		return codenaturecourrier;
	}
	public void setCodenaturecourrier(String codenaturecourrier) {
		this.codenaturecourrier = codenaturecourrier;
	}

}
