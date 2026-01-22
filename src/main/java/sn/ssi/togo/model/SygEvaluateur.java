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
	@Table(name = "pmb_evaluateurs")
public class SygEvaluateur implements java.io.Serializable {
     
		private Integer id;
		private String nom;
		private String prenom;
		private SygAutoriteContractante autorite;
		private String telephone;
		private String email;
		private String fonction;
		private String commentaire;
		
		
		public SygEvaluateur(){
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 10)
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

      
		@Column(name="nom",length = 255)
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

        
		@Column(name = "prenom",  length = 255)
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

		@Column(name = "telephone",  length = 255)
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

		@Column(name = "fonction",  length = 255)
		public String getFonction() {
			return fonction;
		}
		public void setFonction(String fonction) {
			this.fonction = fonction;
		}

		@Column(name = "commentaire",  length = 255)
		public String getCommentaire() {
			return commentaire;
		}
		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}
		
		
		
		}
