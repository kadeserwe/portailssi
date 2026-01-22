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
	@Table(name = "pmb_annuaire")
	public class SygAnnuaire  implements java.io.Serializable {
		
  		private Long id;
		private String prenom,nom,telephone,email,organe,fonction;
		private SygService service;
		private SygAutoriteContractante autorite;
		private SygUniteOrgarmp uniteorg;
		private SygBureauxdcmp bureau;

		
    	public SygAnnuaire() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

		@Column(name = "prenom",  length = 255)
		public String getPrenom() {
			return this.prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		@Column(name = "nom",  length = 50)
    	public String getNom() {
			return nom;
		}
    	public void setNom(String nom) {
			this.nom = nom;
		}


    	@Column(name = "telephone",  length = 50)
    	public String getTelephone() {
			return telephone;
		}
        public void setTelephone(String telephone) {
			this.telephone = telephone;
		}


        @Column(name = "email",  length = 50)
     	public String getEmail() {
			return email;
		}
        public void setEmail(String email) {
			this.email = email;
		}


        @Column(name = "organe",  length = 50)
		public String getOrgane() {
			return organe;
		}
    	public void setOrgane(String organe) {
			this.organe = organe;
		}

		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "service_id")
    	public SygService getService() {
			return service;
		}
    	public void setService(SygService service) {
			this.service = service;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


    	@Column(name = "fonction",  length = 255)
		public String getFonction() {
			return fonction;
		}
    	public void setFonction(String fonction) {
			this.fonction = fonction;
		}
        
    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "uniteorg")
    	public SygUniteOrgarmp getUniteorg() {
    		return uniteorg;
    	}
    	public void setUniteorg(SygUniteOrgarmp uniteorg) {
    		this.uniteorg = uniteorg;
    	}
    	
    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "uniteorg_dcmp")
    	public SygBureauxdcmp getBureau() {
    		return bureau;
    	}
    	public void setBureau(SygBureauxdcmp bureau) {
    		this.bureau = bureau;
    	}
    	
	}

