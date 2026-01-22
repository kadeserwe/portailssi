package sn.ssi.togo.model;

import java.math.BigDecimal;

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
@Table(name = "pmb_lots")
public class SygLots  implements java.io.Serializable{
	private Long id;
	private String libelle,numero,commentaires;
	private SygDossiers dossier;
	private BigDecimal montant;
	private SygContrats contrat;
	
	public SygLots() {
		// TODO Auto-generated constructor stub
	}
	
	public void SygCritere(Long id, String libelle){
		this.id=id;
		this.libelle=libelle;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "lotid",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "lotlibelle",  length = 255)
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	@Column(name = "lotnumero",  length = 255)
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	

	
	@Column(name = "lotmontantcaution")
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	
	@Column(name = "lotcommentaire")
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "dossiers_id")
	public SygDossiers getDossier() {
		return dossier;
	}
	public void setDossier(SygDossiers dossier) {
		this.dossier = dossier;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "contrat_id")
	public SygContrats getContrat() {
		return contrat;
	}
	public void setContrat(SygContrats contrat) {
		this.contrat = contrat;
	}

	

}
