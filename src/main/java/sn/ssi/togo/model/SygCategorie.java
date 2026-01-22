package sn.ssi.togo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "syg_categories")
public class SygCategorie  implements java.io.Serializable{
	private Long idcategorie;
	private String hierachieA;
	private String hierachieB;
	
	public SygCategorie() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}
	@Column(name = "hierachiea",  length = 255)
	public String getHierachieA() {
		return hierachieA;
	}

	public void setHierachieA(String hierachieA) {
		this.hierachieA = hierachieA;
	}
	@Column(name = "hierachieb",  length = 255)
	public String getHierachieB() {
		return hierachieB;
	}

	public void setHierachieB(String hierachieB) {
		this.hierachieB = hierachieB;
	}



}
