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
@Table(name = "pmb_presenceouverture")
public class SygPresenceouverture  implements java.io.Serializable{
	private Long id;
	private SygDossiers dossier;
	private SygAppelsOffres appel;
	private SygPlisouvertures plis;
	private int etapePI;
	private String supplementaire,email,telephone,nomrepresentant,prenomrepresentant,nomstructure;

	

	

	public SygPresenceouverture() {
		// TODO Auto-generated constructor stub
	}
	

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idpresenceouverture",  length = 255)
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
 	@JoinColumn(name = "appelsoffres_id")
	public SygAppelsOffres getAppel() {
		return appel;
	}
	public void setAppel(SygAppelsOffres appel) {
		this.appel = appel;
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
 	@JoinColumn(name = "pli_id")
	public SygPlisouvertures getPlis() {
		return plis;
	}
	public void setPlis(SygPlisouvertures plis) {
		this.plis = plis;
	}

	@Column(name = "etapepi",  length = 1)
	public int getEtapePI() {
		return etapePI;
	}
 	public void setEtapePI(int etapePI) {
		this.etapePI = etapePI;
	}


 	@Column(name = "supplementaire",  length = 255)
	public String getSupplementaire() {
		return supplementaire;
	}
	public void setSupplementaire(String supplementaire) {
		this.supplementaire = supplementaire;
	}


	@Column(name = "email",  length = 50)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name = "telephone",  length = 16)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Column(name = "nomrepresentant",  length = 255)
	public String getNomrepresentant() {
		return nomrepresentant;
	}
	public void setNomrepresentant(String nomrepresentant) {
		this.nomrepresentant = nomrepresentant;
	}


	@Column(name = "prenomrepresentant",  length = 255)
	public String getPrenomrepresentant() {
		return prenomrepresentant;
	}
	public void setPrenomrepresentant(String prenomrepresentant) {
		this.prenomrepresentant = prenomrepresentant;
	}


	@Column(name = "nomstructure",  length = 255)
	public String getNomstructure() {
		return nomstructure;
	}
	public void setNomstructure(String nomstructure) {
		this.nomstructure = nomstructure;
	}


	
}
