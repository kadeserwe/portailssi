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
@Table(name = "pmb_fichierdocument")
public class SygFichierDocument  implements java.io.Serializable{
	private Long   IDdoc;
	private String libelleDoc;
	private String nomFichierDoc;
	private String Publier;
	private Integer catDoc_ID;
	private SygAutoriteContractante autorite;
	
	public SygFichierDocument() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long IDdoc,String libelleDoc,String nomFichierDoc,Integer catDoc_ID,String Publier){
		this.IDdoc=IDdoc;
		this.libelleDoc=libelleDoc;
		this.nomFichierDoc=nomFichierDoc;
		this.catDoc_ID=catDoc_ID;
		this.Publier=Publier;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iddoc",  length = 10)
	public Long getIDdoc() {
		return IDdoc;
	}
	public void setIDdoc(Long IDdoc) {
		IDdoc = IDdoc;
	}
	@Column(name = "nomfichierdoc",  length = 10)
	public String getNomFichierDoc() {
		return nomFichierDoc;
	}
	public void setNomFichierDoc(String nomFichierDoc) {
		this.nomFichierDoc = nomFichierDoc;
	}
	@Column(name = "libelledoc",  length = 10)
	public String getLibelleDoc() {
		return libelleDoc;
	}
	public void setLibelleDoc(String libelleDoc) {
		this.libelleDoc = libelleDoc;
	}
	@Column(name = "publier",  length = 10)
	public String getPublier() {
		return Publier;
	}
	public void setPublier(String Publier) {
		this.Publier = Publier;
	}
	@Column(name = "catdoc_id")
	public Integer getCatDoc_ID() {
		return catDoc_ID;
	}
	public void setCatDoc_ID(Integer catDoc_ID) {
		this.catDoc_ID = catDoc_ID;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}

	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}

}
