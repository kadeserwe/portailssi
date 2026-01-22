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
	@Table(name = "pmb_journal")
	public class SygJournal  implements java.io.Serializable {
		private Long idJournal;
		private String numero;
		private Date datePub;
		private String fichierJournal;
		private String description;
		


		public SygJournal() {
		}

	

		public void setIdJournal(Long idJournal) {
			this.idJournal = idJournal;
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idjournal")
		public Long getIdJournal() {
			return idJournal;
		}



		public void setNumero(String numero) {
			this.numero = numero;
		}


		@Column(name = "numero")
		public String getNumero() {
			return numero;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "datepub")
	    public Date getDatePub() {
			return datePub;
		}
		public void setDatePub(Date datePub) {
			this.datePub = datePub;
		}
		



		public void setFichierJournal(String fichierJournal) {
			this.fichierJournal = fichierJournal;
		}

		@Column(name = "fichierjournal")
		public String getFichierJournal() {
			return fichierJournal;
		}


		public void setDescription(String description) {
			this.description = description;
		}

		@Column(name = "description")
		public String getDescription() {
			return description;
		}
	}

