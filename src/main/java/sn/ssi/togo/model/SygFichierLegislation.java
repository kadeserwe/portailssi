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
	@Table(name = "pmb_fichierlegislation")
	public class SygFichierLegislation  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private String description;
		private String fichier;
		private Date date;
		private Date datepublication;
		private String statut;
		private SygCategorieLegislation categorie;
	
		public SygFichierLegislation() {
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

	

		@Column(name = "codelibelle")
		public String getLibelle() {
			return this.libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		@Column(name = "codedescription")
		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}


		@Column(name = "codenomfichier")
		public String getFichier() {
			return fichier;
		}



		public void setFichier(String fichier) {
			this.fichier = fichier;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "codedaterapport")
		public Date getDate() {
			return date;
		}



		public void setDate(Date date) {
			this.date = date;
		}


		@Column(name = "codepublier")
		public String getStatut() {
			return statut;
		}



		public void setStatut(String statut) {
			this.statut = statut;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "codedatepublication")
		public Date getDatepublication() {
			return datepublication;
		}



		public void setDatepublication(Date datepublication) {
			this.datepublication = datepublication;
		}



		public void setCategorie(SygCategorieLegislation categorie) {
			this.categorie = categorie;
		}


		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "categorie")
		public SygCategorieLegislation getCategorie() {
			return categorie;
		}
		
	}

