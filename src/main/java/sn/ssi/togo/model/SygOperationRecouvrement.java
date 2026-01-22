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
	@Table(name = "pmb_operationrecouvrement")
	public class SygOperationRecouvrement  implements java.io.Serializable {
		
  		
		private String opecode;
		private String  operecude;
		private Date opedaterecu;
		private BigDecimal opemontanttotal;//Montant total HT
		private BigDecimal opmontantTotalVerse;//Montant total versement
		private String opecommentaires;
		private SygAutoriteContractante autorite;
		private String  opmontantTotalEnLettre;
		private String  numeromarche;
		private String  objetmarche;
		
	
		public SygOperationRecouvrement() {
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
		@JoinColumn(name = "autoriteid")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}



		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


		@Column(name = "opmontanttotalenlettre", length = 255)
		public String getOpmontantTotalEnLettre() {
			return opmontantTotalEnLettre;
		}



		
		public void setOpmontantTotalEnLettre(String opmontantTotalEnLettre) {
			this.opmontantTotalEnLettre = opmontantTotalEnLettre;
		}


		@Column(name = "opnumeromarche", length = 100)
		public String getNumeromarche() {
			return numeromarche;
		}



		public void setNumeromarche(String numeromarche) {
			this.numeromarche = numeromarche;
		}


		@Column(name = "opobjetmarche", length = 255)
		public String getObjetmarche() {
			return objetmarche;
		}



		public void setObjetmarche(String objetmarche) {
			this.objetmarche = objetmarche;
		}


	}

