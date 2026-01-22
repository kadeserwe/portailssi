package sn.ssi.togo.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_operationpaiement")
	public class SygOperationPaiement  implements java.io.Serializable {
		
  		
		private String opecode;
		private String  operecude;
		private Date opedaterecu;
		private BigDecimal opemontanttotal;//Montant total HT
		private BigDecimal opmontantTotalVerse;//Montant total versement
		private String opecommentaires;
		private SygFournisseur fournisseur;
	
		private String  opmontantTotalVerseEnLettre;
	
		public SygOperationPaiement() {
		}

	

		@Id
		@Column(name = "opecode", nullable = false, length = 255)

		public String getOpecode() {
			return opecode;
		}



		public void setOpecode(String opecode) {
			this.opecode = opecode;
		}


		@Column(name = "operecude", length = 255)
		public String getOperecude() {
			return operecude;
		}



		public void setOperecude(String operecude) {
			this.operecude = operecude;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "opedaterecu", length = 7)
		public Date getOpedaterecu() {
			return opedaterecu;
		}



		public void setOpedaterecu(Date opedaterecu) {
			this.opedaterecu = opedaterecu;
		}


		@Column(name ="opemontanttotal")
		public BigDecimal getOpemontanttotal() {
			return opemontanttotal;
		}



		public void setOpemontanttotal(BigDecimal opemontanttotal) {
			this.opemontanttotal = opemontanttotal;
		}


		@Column(name ="opmontanttotalverse")
		public BigDecimal getOpmontantTotalVerse() {
			return opmontantTotalVerse;
		}



		public void setOpmontantTotalVerse(BigDecimal opmontantTotalVerse) {
			this.opmontantTotalVerse = opmontantTotalVerse;
		}


		@Column(name = "opecommentaires",  length = 255)
		public String getOpecommentaires() {
			return opecommentaires;
		}



		public void setOpecommentaires(String opecommentaires) {
			this.opecommentaires = opecommentaires;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "fournisseurid")
		public SygFournisseur getFournisseur() {
			return fournisseur;
		}



		public void setFournisseur(SygFournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}


		@Column(name = "opmontanttotalverseenlettre", length = 255)
		public String getOpmontantTotalVerseEnLettre() {
			return opmontantTotalVerseEnLettre;
		}



		public void setOpmontantTotalVerseEnLettre(String opmontantTotalVerseEnLettre) {
			this.opmontantTotalVerseEnLettre = opmontantTotalVerseEnLettre;
		}


		
		

	
		
	}

