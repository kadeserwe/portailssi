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

@Entity
@Table(name = "syg_membres_groupe")
public class SygMembresGroupes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String prenom;
	private String nom;
	private String telephone;
	private String mobile;
	private String email;
	private String matricule;
	private String sexe;
	private String service;
	private String fctionoccupe;
	private SygService direction;
	private String typeparticipant;
	private SygAutoriteContractante autorite;
	private SygTypeAutoriteContractante typeautorite;
    private SygGroupeFormation groupe;
    
	public SygMembresGroupes() {
		super();
	}

	public SygMembresGroupes(Integer id, String prenom, String nom,
			String telephone, String mobile, String email, SygProformation formation) {
		super();
		this.Id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.telephone = telephone;
		this.mobile = mobile;
		this.email = email;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	@Column(name = "prenom", length = 255)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "nom", length = 100)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "telephone", length = 20)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "mobile", length = 20)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", length = 255)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "matricule", length = 255)
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "autorite_contra", nullable = false)
	public SygAutoriteContractante getAutorite() {
		return autorite;
	}

	
	public void setAutorite(SygAutoriteContractante autorite) {
		this.autorite = autorite;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "groupe_id")
	public SygGroupeFormation getGroupe() {
		return groupe;
	}

	public void setGroupe(SygGroupeFormation groupe) {
		this.groupe = groupe;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeautorite_id")
	public SygTypeAutoriteContractante getTypeautorite() {
		return typeautorite;
	}

	public void setTypeautorite(SygTypeAutoriteContractante typeautorite) {
		this.typeautorite = typeautorite;
	}
	@Column(name = "sexe")
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Column(name = "service", length = 255)
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Column(name = "fonction", length = 255)
	public String getFctionoccupe() {
		return fctionoccupe;
	}

	public void setFctionoccupe(String fctionoccupe) {
		this.fctionoccupe = fctionoccupe;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "direction_id")
	public SygService getDirection() {
		return direction;
	}

	public void setDirection(SygService direction) {
		this.direction = direction;
	}

	@Column(name = "typeparticipant")
	public String getTypeparticipant() {
		return typeparticipant;
	}

	public void setTypeparticipant(String typeparticipant) {
		this.typeparticipant = typeparticipant;
	}


	
}
