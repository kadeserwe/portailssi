package sn.ssi.togo.model;
import java.awt.SystemColor;
import java.io.Serializable;
import java.math.BigDecimal;
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
	@Table(name = "pmb_suivipaiement")
	public class SygSuiviPaiement  implements Serializable {
		
  		
		
		/****/
		private Long suiId;
		private  double montantpaye;
		private SygDemandePaiement  demandePaiement;
		private Date dateSuivi;	 
		/***/
		
	  
	
		public SygSuiviPaiement() {
		}

	

		public void setMontantpaye(double montantpaye) {
			this.montantpaye = montantpaye;
		}


		@Column(name = "montant")
		public double getMontantpaye() {
			return montantpaye;
		}



		public void setSuiId(Long suiId) {
			this.suiId = suiId;
		}








		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "suiviid" )
		public Long getSuiId() {
			return suiId;
		}









		public void setDemandePaiement(SygDemandePaiement demandePaiement) {
			this.demandePaiement = demandePaiement;
		}








		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "demande")
		public SygDemandePaiement getDemandePaiement() {
			return demandePaiement;
		}



		public void setDateSuivi(Date dateSuivi) {
			this.dateSuivi = dateSuivi;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "datesuivi")
		public Date getDateSuivi() {
			return dateSuivi;
		}


    	
    	
	}

