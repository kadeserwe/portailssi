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
@Table(name = "pmb_critereanalyse")
public class SygCritereAnalyse  implements java.io.Serializable{
	private Long idcritereanalyse;
	private String libellecritereanalyse;
	private String codecritereanalyse;
	private String descriptionanalyse;
	
	public SygCritereAnalyse() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long idcritereanalyse, String libellecritereanalyse,String codecritereanalyse,String descriptionanalyse){
		this.idcritereanalyse=idcritereanalyse;
		this.libellecritereanalyse=libellecritereanalyse;
		this.codecritereanalyse=codecritereanalyse;
		this.descriptionanalyse=descriptionanalyse;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idcritereanalyse",  length = 10)
	public Long getIdcritereanalyse() {
		return idcritereanalyse;
	}
	public void setIdcritereanalyse(Long idcritereanalyse) {
		this.idcritereanalyse = idcritereanalyse;
	}
	@Column(name = "libellecritereanalyse",  length = 10)
	public String getLibellecritereanalyse() {
		return libellecritereanalyse;
	}
	public void setLibellecritereanalyse(String libellecritereanalyse) {
		this.libellecritereanalyse = libellecritereanalyse;
	}
	@Column(name = "descriptionanalyse",  length = 10)
	public String getDescriptionanalyse() {
		return descriptionanalyse;
	}
	public void setDescriptionanalyse(String descriptionanalyse) {
		this.descriptionanalyse = descriptionanalyse;
	}
	@Column(name = "codecritereanalyse",  length = 10)
	public String getCodecritereanalyse() {
		return codecritereanalyse;
	}
	public void setCodecritereanalyse(String codecritereanalyse) {
		this.codecritereanalyse = codecritereanalyse;
	}

}
