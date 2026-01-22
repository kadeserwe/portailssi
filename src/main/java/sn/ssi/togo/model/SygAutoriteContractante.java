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
	@Table(name = "pmb_autoritecontractante")
	public class SygAutoriteContractante  implements java.io.Serializable {
		
        /**
		 * 
		 */
		
		private Long id;
		private int ordre;
		private String denomination,responsable,adresse,telephone,fax,email,sigle,urlsiteweb,logo,approbation;
		
		private SygTypeAutoriteContractante type;
		private SygPoledcmp pole;

	
		public SygAutoriteContractante() {
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

	    @Column(name = "odreautoritecontractante",  length = 15)
	     public int getOrdre() {
				return ordre;
			}
	     public void setOrdre(int ordre) {
				this.ordre = ordre;
			}

		@Column(name = "denomination",  length = 255)
		public String getDenomination() {
			return this.denomination;
		}

		public void setDenomination(String denomination) {
			this.denomination = denomination;
		}


		@Column(name = "responsable",  length = 255)
		public String getResponsable() {
			return responsable;
		}
    	public void setResponsable(String responsable) {
			this.responsable = responsable;
		}

        @ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "typeautorite_id")
		public SygTypeAutoriteContractante getType() {
			return type;
		}
    	public void setType(SygTypeAutoriteContractante type) {
			this.type = type;
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


    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "polid")
		public SygPoledcmp getPole() {
			return pole;
		}
    	public void setPole(SygPoledcmp pole) {
			this.pole = pole;
		}


    	@Column(name = "urlsiteweb",  length = 255)
		public String getUrlsiteweb() {
			return urlsiteweb;
		}
    	public void setUrlsiteweb(String urlsiteweb) {
			this.urlsiteweb = urlsiteweb;
		}
    	
    	
    	@Column(name = "logo",  length = 50)
		public String getLogo() {
			return logo;
		}
    	public void setLogo(String logo) {
			this.logo = logo;
		}
    	
   	 @Column(name = "approbation",  length = 10)
   		public String getApprobation() {
   			return approbation;
   		}
       	public void setApprobation(String approbation) {
   			this.approbation = approbation;
   		}
       	
       	
	}

