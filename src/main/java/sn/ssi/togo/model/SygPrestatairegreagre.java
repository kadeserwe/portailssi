package sn.ssi.togo.model;
import java.io.Serializable;

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
@Table(name = "pmb_prestataire_greagre")
public class SygPrestatairegreagre  implements Serializable{
	private Long   id;
	private String Numero,Raisonsociale,AdresseMail,commentaire,Ninea,facture;
	private SygAutoriteContractante autorite;
	private SygAppelsOffres appel;
	private SygPays pays;
	private SygFournisseur fournisseur;
		
	
	
	public SygPrestatairegreagre() {
		// TODO Auto-generated constructor stub
		
	}	
	public void SygTypeDemande(Long id){
		this.id=id;
		
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 10)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	

	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "appelsoffres_id")
	public SygAppelsOffres getAppel() {
		return appel;
	}
	public void setAppel(SygAppelsOffres appel) {
		this.appel = appel;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "pays")
	public SygPays getPays() {
		return pays;
	}
	public void setPays(SygPays pays) {
		this.pays = pays;
	}

	
	@Column(name = "numero")
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}

	@Column(name = "raisonsociale")
	public String getRaisonsociale() {
		return Raisonsociale;
	}
	public void setRaisonsociale(String raisonsociale) {
		Raisonsociale = raisonsociale;
	}
	
	@Column(name = "adressemail")
	public String getAdresseMail() {
		return AdresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		AdresseMail = adresseMail;
	}

	@Column(name = "commentaire")
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	@Column(name = "ninea")
	public String getNinea() {
		return Ninea;
	}
	public void setNinea(String ninea) {
		Ninea = ninea;
	}
	
	@Column(name = "facture")
	public String getFacture() {
		return facture;
	}
	public void setFacture(String facture) {
		this.facture = facture;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "fournisseur_id")
	public SygFournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(SygFournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
	

}

