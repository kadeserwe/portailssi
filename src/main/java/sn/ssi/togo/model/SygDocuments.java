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
@Table(name = "pmb_documents")
public class SygDocuments  implements java.io.Serializable{
	private Long id;
	private String typeDocument,textpvouverture,nomFichier,libelle,reference,objet,origine;
	
	private SygDossiers dossier;
	private SygAppelsOffres appel;
	private Long idlot;
	private SygPlisouvertures plis;
	private Date date,heure;
	
	public SygDocuments() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long id, String typeDocument){
		this.id=id;
		this.typeDocument=typeDocument;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iddocument",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "typedocument",  length = 255)
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	

	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
 	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}

 	
 	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "appelsoffres_id")
	public SygAppelsOffres getAppel() {
		return appel;
	}
	public void setAppel(SygAppelsOffres appel) {
		this.appel = appel;
	}


	@Column(name = "textpvouverture",  length = 255)
	public String getTextpvouverture() {
		return textpvouverture;
	}
    public void setTextpvouverture(String textpvouverture) {
		this.textpvouverture = textpvouverture;
	}

    
    @Column(name = "idlot",  length = 11)
	public Long getIdlot() {
		return idlot;
	}

	public void setIdlot(Long idlot) {
		this.idlot = idlot;
	}

	
	@Column(name = "nomfichier")
	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	
	@Column(name = "libelle",length=255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "plis")
	public SygPlisouvertures getPlis() {
		return plis;
	}
 	public void setPlis(SygPlisouvertures plis) {
		this.plis = plis;
	}
    
	
 	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 7)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	@Column(name = "reference")
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}

	
	@Column(name = "objet")
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "heure", length = 7)
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}

	@Column(name = "origine", length = 20)
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	
    
}
