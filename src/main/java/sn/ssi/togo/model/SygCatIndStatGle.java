package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "syg_catindstatgle")
public class SygCatIndStatGle implements java.io.Serializable{
	private Integer id;
	private String code;
	private String libelle;
	

	public SygCatIndStatGle() {
	}

	public SygCatIndStatGle(Integer id,String code, String libelle) {
		super();
		this.id= id;
		this.code = code;
		this.libelle = libelle;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
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

}
