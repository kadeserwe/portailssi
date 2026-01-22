package sn.ssi.togo.model;

import java.awt.SystemColor;
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
	@Table(name = "pmb_demandepaiement")
	public class SygDemandePaiement  implements java.io.Serializable {
		
  		
		
		/****/
	
		private Date  datepaiement;
		private String livrable;
		private  double montantpaye;
		private SygContrats  contrat;
		private Date dateCourrier;
		private Long demPaId ;
		private String ref;
		private String Suivi;
		private SygCalendrierPaiement calendrier;
		
		
		
		/***/
		
    


	

		public SygDemandePaiement() {
		}

	

		



		

		public void setDatepaiement(Date datepaiement) {
			this.datepaiement = datepaiement;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "datepaiement")
		public Date getDatepaiement() {
			return datepaiement;
		}



		public void setLivrable(String livrable) {
			this.livrable = livrable;
		}


		@Column(name = "livable", length =255)
		public String getLivrable() {
			return livrable;
		}




		public void setMontantpaye(double montantpaye) {
			this.montantpaye = montantpaye;
		}


		@Column(name = "montant")
		public double getMontantpaye() {
			return montantpaye;
		}



		public void setContrat(SygContrats contrat) {
			this.contrat = contrat;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "contrat")
		public SygContrats getContrat() {
			return contrat;
		}







		public void setDateCourrier(Date dateCourrier) {
			this.dateCourrier = dateCourrier;
		}






		@Temporal(TemporalType.DATE)
		@Column(name = "datecourrier")
		public Date getDateCourrier() {
			return dateCourrier;
		}







		public void setDemPaId(Long demPaId) {
			this.demPaId = demPaId;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "demid" )
		public Long getDemPaId() {
			return demPaId;
		}


		public void setRef(String ref) {
			this.ref = ref;
		}






		@Column(name = "refcourrier", length =255)
		public String getRef() {
			return ref;
		}









		public void setSuivi(String suivi) {
			Suivi = suivi;
		}








		@Column(name = "suivi", length =255)
		public String getSuivi() {
			return Suivi;
		}









		public void setCalendrier(SygCalendrierPaiement calendrier) {
			this.calendrier = calendrier;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "calendrier")
		public SygCalendrierPaiement getCalendrier() {
			return calendrier;
		}


    	
    	
	}

