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
@Table(name = "syg_fichpresence_participant")
public class SygFPresenceParcipant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer nbrepresent,nbreabsent;
	private Boolean statu;
	private SygParticipantsFormation paticipant;
	private SygFichePresence fiche;
	
	public SygFPresenceParcipant() {
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

	@Column(name ="nombre_present")
	public Integer getNbrepresent() {
		return nbrepresent;
	}

	public void setNbrepresent(Integer nbrepresent) {
		this.nbrepresent = nbrepresent;
	}

	@Column(name ="nombre_absen")
	public Integer getNbreabsent() {
		return nbreabsent;
	}

	public void setNbreabsent(Integer nbreabsent) {
		this.nbreabsent = nbreabsent;
	}

	@Column(name ="statut")
	public Boolean getStatu() {
		return statu;
	}
	public void setStatu(Boolean statu) {
		this.statu = statu;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "participant_id")
	public SygParticipantsFormation getPaticipant() {
		return paticipant;
	}

	public void setPaticipant(SygParticipantsFormation paticipant) {
		this.paticipant = paticipant;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fiche_id")
	public SygFichePresence getFiche() {
		return fiche;
	}
	public void setFiche(SygFichePresence fiche) {
		this.fiche = fiche;
	}



	
}
