package sn.ssi.togo.model;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pmb_retraitregistredao")
public class SygRetraitregistredao  implements Serializable {
	private Long id;
	private SygDossiers dossier;
	private SygAutoriteContractante autorite;
	private String nomSoumissionnaire,fax,telephone,email,modepaiement,Ninea;
	private BigDecimal montantverse; 
	private Date dateRetrait;
	private SygPays pays;
	private SygFournisseur fournisseur;
	


	public SygRetraitregistredao() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",  length = 255)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
 	@JoinColumn(name = "autorite_id")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}


	@Column(name = "nomsoumissionnaire")
	public String getNomSoumissionnaire() {
		return nomSoumissionnaire;
	}
	public void setNomSoumissionnaire(String nomSoumissionnaire) {
		this.nomSoumissionnaire = nomSoumissionnaire;
	}


	@Column(name = "fax",  length = 50)
	public String getFax() {
		return fax;
	}
    public void setFax(String fax) {
		this.fax = fax;
	}


	@Column(name = "telephone",  length = 50)
	public String getTelephone() {
		return telephone;
	}
    public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Column(name = "email",  length = 255)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name = "modepaiement",  length = 50)
	public String getModepaiement() {
		return modepaiement;
	}
	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}


	@Column(name = "ninea",  length = 255)
	public String getNinea() {
		return Ninea;
	}
	public void setNinea(String ninea) {
		Ninea = ninea;
	}


	@Column(name = "montantverse")
	public BigDecimal getMontantverse() {
		return montantverse;
	}
	public void setMontantverse(BigDecimal montantverse) {
		this.montantverse = montantverse;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "dateretrait", length = 7)
	public Date getDateRetrait() {
		return dateRetrait;
	}
	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "pays")
	public SygPays getPays() {
		return pays;
	}
	public void setPays(SygPays pays) {
		this.pays = pays;
	}


	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "fournisseur")
	public SygFournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(SygFournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
	
}
