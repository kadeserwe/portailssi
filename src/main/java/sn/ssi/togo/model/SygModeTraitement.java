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
@Table(name = "pmb_modetraitement")
public class SygModeTraitement  implements java.io.Serializable{
	private Long idmodetraitement;
	private String libellemodetraitement;
	private String codemodetraitement;
	private String descriptionmodetraitement;
	
	public SygModeTraitement() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idmodetraitement, String libellemodetraitement,String codemodetraitement){
		this.idmodetraitement=idmodetraitement;
		this.libellemodetraitement=libellemodetraitement;
		this.codemodetraitement=codemodetraitement;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idmodetraitement",  length = 10)
	public Long getIdmodetraitement() {
		return idmodetraitement;
	}
	public void setIdmodetraitement(Long idmodetraitement) {
		this.idmodetraitement = idmodetraitement;
	}
	@Column(name = "libellemodetraitement",  length = 10)
	public String getLibellemodetraitement() {
		return libellemodetraitement;
	}
	public void setLibellemodetraitement(String libellemodetraitement) {
		this.libellemodetraitement = libellemodetraitement;
	}
	@Column(name = "descriptionmodetraitement",  length = 10)
	public String getDescriptionmodetraitement() {
		return descriptionmodetraitement;
	}
	public void setDescriptionmodetraitement(String descriptionmodetraitement) {
		this.descriptionmodetraitement = descriptionmodetraitement;
	}
	@Column(name = "codemodetraitement",  length = 10)
	public String getCodemodetraitement() {
		return codemodetraitement;
	}
	public void setCodemodetraitement(String codemodetraitement) {
		this.codemodetraitement = codemodetraitement;
	}

}
