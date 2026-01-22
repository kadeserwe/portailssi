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
@Table(name = "pmb_categoriedocument")
public class SygCategorieDocument  implements java.io.Serializable{
	private Long   IDcatDoc;
	private String niveauDoc;
	private String libelleCatDoc;
	private Integer nbTotalFichiersDoc;
	private Integer flagdernierniveauDoc;
	private String descriptionDocument;
	private SygAutoriteContractante autorite;
	
	public SygCategorieDocument() {
		// TODO Auto-generated constructor stub
		super();
	}	
	public void SygCritere(Long IDcatDoc,String niveauDoc,String libelleCatDoc,Integer nbTotalFichiersDoc,Integer flagdernierniveauDoc,String descriptionDocument){
		this.IDcatDoc=IDcatDoc;
		this.niveauDoc=niveauDoc;
		this.libelleCatDoc=libelleCatDoc;
		this.nbTotalFichiersDoc=nbTotalFichiersDoc;
		this.flagdernierniveauDoc=flagdernierniveauDoc;
		this.descriptionDocument=descriptionDocument;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idcatdoc",  length = 10)
	public Long getIDcatDoc() {
		return IDcatDoc;
	}
	public void setIDcatDoc(Long iDcatDoc) {
		IDcatDoc = iDcatDoc;
	}
	@Column(name = "niveaudoc",  length = 10)
	public String getNiveauDoc() {
		return niveauDoc;
	}
	public void setNiveauDoc(String niveauDoc) {
		this.niveauDoc = niveauDoc;
	}
	@Column(name = "libellecatdoc",  length = 10)
	public String getLibelleCatDoc() {
		return libelleCatDoc;
	}
	public void setLibelleCatDoc(String libelleCatDoc) {
		this.libelleCatDoc = libelleCatDoc;
	}
	@Column(name = "nbtotalfichiersdoc",  length = 10)
	public Integer getNbTotalFichiersDoc() {
		return nbTotalFichiersDoc;
	}
	public void setNbTotalFichiersDoc(Integer nbTotalFichiersDoc) {
		this.nbTotalFichiersDoc = nbTotalFichiersDoc;
	}
	@Column(name = "flagdernierniveaudoc",  length = 10)
	public Integer getFlagdernierniveauDoc() {
		return flagdernierniveauDoc;
	}
	public void setFlagdernierniveauDoc(Integer flagdernierniveauDoc) {
		this.flagdernierniveauDoc = flagdernierniveauDoc;
	}
	@Column(name = "descriptiondocument",  length = 10)
	public String getDescriptionDocument() {
		return descriptionDocument;
	}
	public void setDescriptionDocument(String descriptionDocument) {
		this.descriptionDocument = descriptionDocument;
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
