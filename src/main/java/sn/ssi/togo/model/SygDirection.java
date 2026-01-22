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
	@Table(name = "syg_direction")
	public class SygDirection  implements java.io.Serializable {
		
        /**
		 * 
		 */
		
		private Long id;
		private String libelle,adresse,telephone,fax,email,sigle,urlsiteweb;
		
		private SygAutoriteContractante autorite;

	
		public SygDirection() {
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

		@Column(name = "libelle",  length = 255)
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

        @ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


    	@Column(name = "adresse",  length = 255)
		public String getAdresse() {
			return adresse;
		}
        public void setAdresse(String adresse) {
			this.adresse = adresse;
		}



        @Column(name = "telephone",  length = 50)
		public String getTelephone() {
			return telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}


		@Column(name = "fax",  length = 50)
		public String getFax() {
			return fax;
		}
    	public void setFax(String fax) {
			this.fax = fax;
		}


    	@Column(name = "email",  length = 50)
		public String getEmail() {
			return email;
		}
    	public void setEmail(String email) {
			this.email = email;
		}

    	
    	@Column(name = "sigle",  length = 50)
    	public String getSigle() {
			return sigle;
		}
    	public void setSigle(String sigle) {
			this.sigle = sigle;
		}
    	
    	@Column(name = "urlsiteweb",  length = 255)
		public String getUrlsiteweb() {
			return urlsiteweb;
		}
    	public void setUrlsiteweb(String urlsiteweb) {
			this.urlsiteweb = urlsiteweb;
		}
    	
	}

