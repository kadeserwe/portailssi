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
	@Table(name = "pmb_pjcontentieux")
	public class SygPieceJointeContentieux  implements java.io.Serializable {
		
  		private Long id;
		private String libelle;
		private String fichier;
		private SygContentieux contentieux;
		private Date date;
		private String recevable;//onglet recevabilite
		private String decision;//onglet decision
	
		private Date datecourrier;
		private String reference;
		
		public SygPieceJointeContentieux() {
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


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "contentieuxid")
		public SygContentieux getContentieux() {
			return contentieux;
		}


		public void setContentieux(SygContentieux contentieux) {
			this.contentieux = contentieux;
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


		@Column(name = "recevable",  length = 10)
		public String getRecevable() {
			return recevable;
		}



		public void setRecevable(String recevable) {
			this.recevable = recevable;
		}


		@Column(name = "decision",  length = 10)
		public String getDecision() {
			return decision;
		}



		public void setDecision(String decision) {
			this.decision = decision;
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

