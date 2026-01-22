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
@Table(name = "syg_formation_et_groupe")
public class SygFormationGroupe  implements java.io.Serializable  {
	private Integer id;
	private SygProformation formation;
	private SygGroupeFormation groupe;

	public SygFormationGroupe() {
			
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
	@JoinColumn(name="groupe_id")
	public SygGroupeFormation getGroupe() {
		return groupe;
	}
	public void setGroupe(SygGroupeFormation groupe) {
		this.groupe = groupe;
	}
	


}
