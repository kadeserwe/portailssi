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
	@Table(name = "pmb_fournisseurs_dirigeants")
	public class SygDirigeantsFournisseur  implements java.io.Serializable {
		
  		private Long id;
		private String nom,prenom, adresse, email, tel, fax,profession,fonction,piecedidentite;
		private SygFournisseur fournisseur;
		private SygPays pays;
			
    	public SygDirigeantsFournisseur() {
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

	

		@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "fournisseur")
		public SygFournisseur getFournisseur() {
			return fournisseur;
		}

		public void setFournisseur(SygFournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}
		

		@Column(name = "piecedidentite",  length = 50)
		public String getPiecedidentite() {
			return piecedidentite;
		}

		public void setPiecedidentite(String piecedidentite) {
			this.piecedidentite = piecedidentite;
		}

	

		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "pays")
		public SygPays getPays() {
			return pays;
		}
		public void setPays(SygPays pays) {
			this.pays = pays;
		}
		
		
		
		
		@Column(name = "profession",  length = 255)
		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}
		
		@Column(name = "fonction",  length = 255)
		public String getFonction() {
			return fonction;
		}

		public void setFonction(String fonction) {
			this.fonction = fonction;
		}
	
	
		@Column(name = "prenom",  length = 100)
		public String getPrenom() {
			return prenom;
		}
    	public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

	}
	
	
