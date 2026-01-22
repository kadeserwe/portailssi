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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.hibernate.tool.hbm2x.hbm2hbmxml.Super;




@SuppressWarnings("serial")
@Entity
@Table(name = "pmb_derogatoire")
public class SygDerogatoire  implements Serializable{
	private Long   id,modepassation;
	private String requete,fichier,commentairedcmp,fichierdcmp,numAut;
	private Date DateValidation,DateMiseValidation;
	private int validationED,validationAOR,validationPU;
	private SygRealisations realisation;
	private SygModepassation modepassationCible;
	private SygAutoriteContractante autorite;
	private Utilisateur user;
	
	
	
	public SygDerogatoire() {
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
 	@JoinColumn(name = "rea_id")
	public SygRealisations getRealisation() {
		return realisation;
	}
	public void setRealisation(SygRealisations realisation) {
		this.realisation = realisation;
	}
	

	@Column(name = "requete",  length = 255)
	public String getRequete() {
		return requete;
	}
	public void setRequete(String requete) {
		this.requete = requete;
	}

	
	@Column(name = "fichier",  length = 255)
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "modepassationcible")
	public SygModepassation getModepassationCible() {
		return modepassationCible;
	}
	public void setModepassationCible(SygModepassation modepassationCible) {
		this.modepassationCible = modepassationCible;
	}
	
	
	@Column(name = "commentairedcmp",  length = 255)
	public String getCommentairedcmp() {
		return commentairedcmp;
	}
	public void setCommentairedcmp(String commentairedcmp) {
		this.commentairedcmp = commentairedcmp;
	}
	
	
	@Column(name = "fichierdcmp",  length = 255)
	public String getFichierdcmp() {
		return fichierdcmp;
	}
	public void setFichierdcmp(String fichierdcmp) {
		this.fichierdcmp = fichierdcmp;
	}
	
	@Column(name = "numaut",  length = 255)
	public String getNumAut() {
		return numAut;
	}
	public void setNumAut(String numAut) {
		this.numAut = numAut;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datevalidation", length = 7)
	public Date getDateValidation() {
		return DateValidation;
	}
	public void setDateValidation(Date dateValidation) {
		DateValidation = dateValidation;
	}
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datemisevalidation", length = 7)
	public Date getDateMiseValidation() {
		return DateMiseValidation;
	}
	public void setDateMiseValidation(Date dateMiseValidation) {
		DateMiseValidation = dateMiseValidation;
	}
	
	
	@Column(name = "validationed", length = 7)
	public int getValidationED() {
		return validationED;
	}
	public void setValidationED(int validationED) {
		this.validationED = validationED;
	}
	
	
	@Column(name = "validationaor")
	public int getValidationAOR() {
		return validationAOR;
	}
	public void setValidationAOR(int validationAOR) {
		this.validationAOR = validationAOR;
	}
	
	
	@Column(name = "validationpu")
	public int getValidationPU() {
		return validationPU;
	}
	public void setValidationPU(int validationPU) {
		this.validationPU = validationPU;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "autorite")
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}
	
	
	@Column(name = "modepassation")
	public Long getModepassation() {
		return modepassation;
	}
	public void setModepassation(Long modepassation) {
		this.modepassation = modepassation;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "usr")
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	
 	

}

