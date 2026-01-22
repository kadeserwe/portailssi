package sn.ssi.togo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_archive_contenu")

public class SygArchivesContenu implements java.io.Serializable {
	
	private Long id;
	private String libelle;
	private String motCle;
	private Date dateArchive;
	private String description;
	private SygNoeudClassement conteneur;
	
	
	
	public SygArchivesContenu() {
		
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
	
	@Column(name = "motcle",  length = 255)
	public String getMotCle() {
		return this.motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	
	@Column(name = "description",  length = 255)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	@Column(name = "datearchive")
	public Date getDateArchive() {
		return this.dateArchive;
	}

	public void setDateArchive(Date dateArchive) {
		this.dateArchive = dateArchive;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "noeudclassement_code")
	public SygNoeudClassement getConteneur() {
		return conteneur;
	}

	public void setConteneur(SygNoeudClassement conteneur) {
		this.conteneur = conteneur;
	}
	
}
