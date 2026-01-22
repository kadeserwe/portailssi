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
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "syg_categorie")
    public class SygCategori implements java.io.Serializable {
	
	private Long id;
	private String libelle;
	private SygCategori categori;
	private Integer niveau;
	
	public SygCategori() {
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



	@Column(name = "libelle",  length = 255)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categori")
	public SygCategori getCategori() {
		return categori;
	}

	public void setCategori(SygCategori categori) {
		this.categori = categori;
	}


	@Column(name = "niveau",  length = 50)
	public Integer getNiveau() {
		return niveau;
	}
	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	
	}
