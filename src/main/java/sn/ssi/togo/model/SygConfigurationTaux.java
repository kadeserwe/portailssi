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

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syg_configurationtaux")
public class SygConfigurationTaux implements java.io.Serializable {

	
	private Long id;
	private String code;
	private Double taux;
	private SygPays pays;

	public SygConfigurationTaux() {
	}
	
	
	public SygConfigurationTaux(Long id,String code, Double taux, SygPays pays) {
		super();
		this.id = id;
		this.code = code;
		this.taux = taux;
		this.pays = pays;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	@Column(name = "code", nullable = false, length = 20)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	
	@Column(name = "taux")
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "paysid")
	public SygPays getPays() {
		return pays;
	}
	public void setPays(SygPays pays) {
		this.pays = pays;
	}
	
	
	
	
}
