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
	@Table(name = "pmb_fournisseurs")
	public class SygFournisseur  implements java.io.Serializable {
		
  		private Long id;
		private String nom, adresse, email, tel, fax,numeroregistrecommerce,piecejointe,sigle,identitefiscale;
		private SygCatFournisseur categorie;
		private SygAutoriteContractante autorite;
		private SygPays pays;
		private Date date;
		
    	public SygFournisseur() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "raisonsociale",  length = 255)
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Column(name = "adresse")
		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		@Column(name = "email",  length = 20)
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Column(name = "fax",  length = 15)
		public String getFax() {
			return fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}

		@Column(name = "telephone",  length = 15)
		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "categoriefournisseurs_id")
		public SygCatFournisseur getCategorie() {
			return categorie;
		}

		public void setCategorie(SygCatFournisseur categorie) {
			this.categorie = categorie;
		}

		@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}

		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

		

		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "origine")
		public SygPays getPays() {
			return pays;
		}
		public void setPays(SygPays pays) {
			this.pays = pays;
		}
		
		
		@Column(name = "piecejointe",  length = 15)
		public String getPiecejointe() {
			return piecejointe;
		}

		public void setPiecejointe(String piecejointe) {
			this.piecejointe = piecejointe;
		}
		
		
		@Column(name = "numero_registrecommerce",  length = 15)
		public String getNumeroregistrecommerce() {
			return numeroregistrecommerce;
		}

		public void setNumeroregistrecommerce(String numeroregistrecommerce) {
			this.numeroregistrecommerce = numeroregistrecommerce;
		}
		
		
	
		@Temporal(TemporalType.DATE)
    	@Column(name = "date", length = 7)
		public Date getDate() {
			return date;
		}
     	public void setDate(Date date) {
			this.date = date;
		}

     	
     	@Column(name = "sigle", length = 7)
		public String getSigle() {
			return sigle;
		}
    	public void setSigle(String sigle) {
			this.sigle = sigle;
		}

    	
    	@Column(name = "nif", length = 7)
		public String getIdentitefiscale() {
			return identitefiscale;
		}
    	public void setIdentitefiscale(String identitefiscale) {
			this.identitefiscale = identitefiscale;
		}
		
		
	}
	
	
