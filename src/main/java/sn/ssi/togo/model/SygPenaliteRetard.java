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
	@Table(name = "pmb_penaliteretard")
	public class SygPenaliteRetard  implements java.io.Serializable {
		
  		

		private long penId;
		private Date datepenalite;
		private int taux;
		private String observation;
		private double montantpenalite;
		private SygDemandePaiement  demande;
	
		
	  
	
		public SygPenaliteRetard() {
		}

	
		public void setPenId(long penId) {
			this.penId = penId;
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "penid" )
		public long getPenId() {
			return penId;
		}



		public void setDatepenalite(Date datepenalite) {
			this.datepenalite = datepenalite;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "datepenalite")
		public Date getDatepenalite() {
			return datepenalite;
		}



		public void setTaux(int taux) {
			this.taux = taux;
		}


		@Column(name = "taux")
		public int getTaux() {
			return taux;
		}



		public void setObservation(String observation) {
			this.observation = observation;
		}


		@Column(name = "observation")
		public String getObservation() {
			return observation;
		}


		public void setMontantpenalite(double montantpenalite) {
			this.montantpenalite = montantpenalite;
		}

		@Column(name = "montant")
		public double getMontantpenalite() {
			return montantpenalite;
		}


		public void setDemande(SygDemandePaiement demande) {
			this.demande = demande;
		}

		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "demane")
		public SygDemandePaiement getDemande() {
			return demande;
		}


    	
    	
	}

