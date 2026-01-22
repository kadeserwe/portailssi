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
	@Table(name = "pmb_pjevenement")
	public class SygPieceJointeEvenement  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private String fichier;
		private Date date;
		private Date datecourrier;
		private String reference;
		
		public SygPieceJointeEvenement() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 10)
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

		@Column(name = "fichier")
		public String getFichier() {
			return fichier;
		}

		public void setFichier(String fichier) {
			this.fichier = fichier;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "date", length = 7)
		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}

		@Temporal(TemporalType.DATE)
		@Column(name = "datecourrier", length = 7)
		public Date getDatecourrier() {
			return datecourrier;
		}


		public void setDatecourrier(Date datecourrier) {
			this.datecourrier = datecourrier;
		}


		@Column(name = "reference",  length = 50)
		public String getReference() {
			return reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}
		

		
		
	}

