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
@Table(name = "syg_fichpresence")
public class SygFichePresence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date dateFiche;
	private String jour;
	private SygProformation formation;
	private Integer npresent,nabs;
	
	public SygFichePresence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}



	@Temporal(TemporalType.DATE)
	@Column(name ="datefiche",  length = 10 )
	public Date getDateFiche() {
		return dateFiche;
	}

	public void setDateFiche(Date dateFiche) {
		this.dateFiche = dateFiche;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "formation_id")
	public SygProformation getFormation() {
		return formation;
	}

	public void setFormation(SygProformation formation) {
		this.formation = formation;
	}



	@Column(name ="jour")
	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	@Column(name ="nbre_present")
	public Integer getNpresent() {
		return npresent;
	}


	public void setNpresent(Integer npresent) {
		this.npresent = npresent;
	}

	@Column(name ="nbre_absen")
	public Integer getNabs() {
		return nabs;
	}


	public void setNabs(Integer nabs) {
		this.nabs = nabs;
	}
	
	
}
