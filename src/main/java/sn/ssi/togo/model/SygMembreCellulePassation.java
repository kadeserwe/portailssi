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
	@Table(name = "pmb_membrecellulepassation")
	public class SygMembreCellulePassation  implements java.io.Serializable {
		
  		private Long id;
		private String nom, prenom, fonction, tel, email, service;
		private int selectionne;
		private SygAutoriteContractante autorite;
		
    	public SygMembreCellulePassation() {
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "celid")
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "celnom")
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Column(name = "celprenom")
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		@Column(name = "celfonction")
		public String getFonction() {
			return fonction;
		}

		public void setFonction(String fonction) {
			this.fonction = fonction;
		}

		@Column(name = "celtel")
		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		@Column(name = "celemail")
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Column(name = "celselectionne")
		public int getSelectionne() {
			return selectionne;
		}
		
		@Column(name = "celservice")
		public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public void setSelectionne(int selectionne) {
			this.selectionne = selectionne;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}

		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

	}
