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
@Table(name = "syg_rapport_formation")
public class SygRapportFormation implements java.io.Serializable {
	
	private Long id;
	private String libelle;
	private String description;
	private String fichier;
	private Date date;
	private Date datepublication;
	private String statut;
	private SygTypeRapportFormation type;
	private SygProformation formation;

	public SygRapportFormation() {
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



	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	@Column(name = "description",  length = 255)
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name = "nomfichier")
	public String getFichier() {
		return fichier;
	}



	public void setFichier(String fichier) {
		this.fichier = fichier;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "daterapport", length = 7)
	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


	@Column(name = "publier",  length = 10)
	public String getStatut() {
		return statut;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "datepublication", length = 7)
	public Date getDatepublication() {
		return datepublication;
	}

	public void setDatepublication(Date datepublication) {
		this.datepublication = datepublication;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_rapport", nullable = false)
	public SygTypeRapportFormation getType() {
		return type;
	}
	public void setType(SygTypeRapportFormation type) {
		this.type = type;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "formation", nullable = false)
	public SygProformation getFormation() {
		return formation;
	}

	public void setFormation(SygProformation formation) {
		this.formation = formation;
	}
	
	
}

