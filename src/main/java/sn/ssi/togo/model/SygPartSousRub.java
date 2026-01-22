package sn.ssi.togo.model;
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
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_participant_sousrubrique")
public class SygPartSousRub implements java.io.Serializable {
	
	private Long id;
	
	private SygSousRubrique sousrub;
	private SygParticipantsFormation participant;
	private String reponse;
	private String amelioration;
	
	public SygPartSousRub() {
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

	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sous_rubrique_id")
	public SygSousRubrique getSousrub() {
		return sousrub;
	}
	public void setSousrub(SygSousRubrique sousrub) {
		this.sousrub = sousrub;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "participant_id")
	public SygParticipantsFormation getParticipant() {
		return participant;
	}
	public void setParticipant(SygParticipantsFormation participant) {
		this.participant = participant;
	}


	@Column(name = "reponse")
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}



	@Column(name = "amelioration")
	public String getAmelioration() {
		return amelioration;
	}
	public void setAmelioration(String amelioration) {
		this.amelioration = amelioration;
	}

	
	}

	
	
	

