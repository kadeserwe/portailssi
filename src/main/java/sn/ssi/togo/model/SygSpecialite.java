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

@Entity
@Table(name = "syg_specialite")
public class SygSpecialite implements Serializable {
	
	private Integer id;
	private String code;
	private String description;
	private String libelle;


	public SygSpecialite() {
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "code", length = 50)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "desciption", length = 50)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "libelle", length = 50)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
