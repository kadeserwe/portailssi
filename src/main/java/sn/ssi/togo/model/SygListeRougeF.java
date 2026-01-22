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
	@Table(name = "syg_listerougefournisseur")
public class SygListeRougeF implements java.io.Serializable {
	
	private Long id;
	
	private String raisonsociale;
	private String reference;
	private String ninea;
	private String motif;
	private  String Commentaire ;
	private Date datedebut;
	private Date datfin;
	private SygDecision  decision;
	private String statut,fichier;
	
	
	
	public SygListeRougeF() {
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 255)
    public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}




	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}


	@Column(name = "raisonsociale",  length = 255)
	public String getRaisonsociale() {
		return raisonsociale;
	}



	public void setReference(String reference) {
		this.reference = reference;
	}


	@Column(name = "reference",  length = 255)
	public String getReference() {
		return reference;
	}



	public void setNinea(String ninea) {
		this.ninea = ninea;
	}


	@Column(name = "ninea",  length = 55)
	public String getNinea() {
		return ninea;
	}



	public void setMotif(String motif) {
		this.motif = motif;
	}


	@Column(name = "motif",  length = 255)
	public String getMotif() {
		return motif;
	}



	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}


	@Column(name = "commentaire",  length = 255)
	public String getCommentaire() {
		return Commentaire;
	}



	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "datedebut")
	public Date getDatedebut() {
		return datedebut;
	}



	public void setDatfin(Date datfin) {
		this.datfin = datfin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "datefin")
	public Date getDatfin() {
		return datfin;
	}



	public void setDecision(SygDecision decision) {
		this.decision = decision;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "decision")
	public SygDecision getDecision() {
		return decision;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}


	@Column(name = "status" )
	public String getStatut() {
		return statut;
	}


	@Column(name = "fichier" )
	public String getFichier() {
		return fichier;
	}



	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	

	}
