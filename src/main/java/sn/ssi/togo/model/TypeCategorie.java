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
	@Table(name = "syg_typeCategori")
public class TypeCategorie implements java.io.Serializable {
	
		private Long id;
	private String libelle;
	private int niveau;
	private TypeCategorie typCategorie;

	public TypeCategorie() {
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


	@Column(name = "niveau")
	public int getNiveau() {
		return niveau;
	}



	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typecategori")
	public TypeCategorie getTypCategorie() {
		return typCategorie;
	}
	public void setTypCategorie(TypeCategorie typCategorie) {
		this.typCategorie = typCategorie;
	}


	
	
}
