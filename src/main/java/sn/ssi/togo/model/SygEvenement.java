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


@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_evenement")
public class SygEvenement implements Serializable {

    private Long  Id;
    private Date Date;
    private String intitule;
    private String lieu;
    private String participant;
    private String description;
    private SygTypeEvenement typeevenement;
    private SygPieceJointeEvenement piecejointeevenement;
    private SygCourrierEvenement courrierevenement;
    private SygDossiers dossiers;
  
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",  length = 10)
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		
	 @Temporal(TemporalType.DATE)
	 @Column(name = "date", length = 10)
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
	
	@Column(name = "intitule",  length = 50)
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	
	@Column(name = "lieu",  length = 50)
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
	@Column(name = "participant",  length = 50)
	public String getParticipant() {
		return participant;
	}
	public void setParticipant(String participant) {
		this.participant = participant;
	}
	
	
	@Column(name = "description",  length = 50)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeevenement")
	public SygTypeEvenement getTypeevenement() {
		return typeevenement;
	}
	public void setTypeevenement(SygTypeEvenement typeevenement) {
		this.typeevenement = typeevenement;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "piecejointeevenement")
	public SygPieceJointeEvenement getPiecejointeevenement() {
		return piecejointeevenement;
	}
	public void setPiecejointeevenement(SygPieceJointeEvenement piecejointeevenement) {
		this.piecejointeevenement = piecejointeevenement;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courrierevenement")
	public SygCourrierEvenement getCourrierevenement() {
		return courrierevenement;
	}
	public void setCourrierevenement(SygCourrierEvenement courrierevenement) {
		this.courrierevenement = courrierevenement;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dossiers")
	public SygDossiers getDossiers() {
		return dossiers;
	}
	public void setDossiers(SygDossiers dossiers) {
		this.dossiers = dossiers;
	}

}
