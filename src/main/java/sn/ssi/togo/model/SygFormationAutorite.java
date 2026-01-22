package sn.ssi.togo.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "syg_formationetautorite")
public class SygFormationAutorite  implements java.io.Serializable  {
	private Integer id;
	private SygProformation formation;
	private SygAutoriteContractante autorite;
	private SygTypeAutoriteContractante type;
	
	public SygFormationAutorite() {
			
		}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="formation_id")
	public SygProformation getFormation() {
		return formation;
	}
	
	public void setFormation(SygProformation formation) {
		this.formation = formation;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="typeautorite_id")
	public SygTypeAutoriteContractante getType() {
		return type;
	}
	public void setType(SygTypeAutoriteContractante type) {
		this.type = type;
	}
	


}
