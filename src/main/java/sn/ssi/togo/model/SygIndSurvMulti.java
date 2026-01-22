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

@Entity
@Table(name = "syg_indsurvmulti")
public class SygIndSurvMulti implements java.io.Serializable {

	private Long id;
	private String code;
	private String libelle,signacation;
	private SygCatIndSurvMulti categorie ;
	

	public SygIndSurvMulti() {
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 10)
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "code", nullable = false, length = 50)
	public String getCode() {
		return this.code;
	}
	public void setCode(String Code) {
		this.code = Code;
	}

	@Column(name = "libelle", nullable = false, length = 200)
	public String getLibelle() {
		return this.libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	@Column(name = "signacation", nullable = false)
	public String getSignacation() {
		return this.signacation;
	}
	public void setSignacation(String signacation) {
		this.signacation = signacation;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="categorie")
	public SygCatIndSurvMulti getCategorie() {
		return categorie;
	}
	public void setCategorie(SygCatIndSurvMulti categorie) {
		this.categorie = categorie;
	}


}
