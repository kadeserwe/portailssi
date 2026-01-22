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
	@Table(name = "pmb_calendrierpaiement")
	public class SygCalendrierPaiement  implements java.io.Serializable {
		
  		
		
		/****/
		private Long calenpaId;
		private Date  datepaiement;
		private String livrable;
		private int taux;
		private  double montantpaye;
		private String commentaire;
		private SygContrats  contrat;
		private String payer ;
		private String echeanceExpirer;
		
		
		/***/
		
    


	

		public SygCalendrierPaiement() {
		}

	

		



		public void setCalenpaId(Long calenpaId) {
			this.calenpaId = calenpaId;
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "calid",  length = 255)
		public Long getCalenpaId() {
			return calenpaId;
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



		public void setTaux(int taux) {
			this.taux = taux;
		}


		@Column(name = "taux")
		public int getTaux() {
			return taux;
		}



		public void setMontantpaye(double montantpaye) {
			this.montantpaye = montantpaye;
		}


		@Column(name = "montant")
		public double getMontantpaye() {
			return montantpaye;
		}



		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}


		@Column(name = "commentaire", length =255)
		public String getCommentaire() {
			return commentaire;
		}



		public void setContrat(SygContrats contrat) {
			this.contrat = contrat;
		}


		@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "contrat")
		public SygContrats getContrat() {
			return contrat;
		}







		public void setPayer(String payer) {
			this.payer = payer;
		}






		@Column(name = "payer")
		public String getPayer() {
			return payer;
		}







		public void setEcheanceExpirer(String echeanceExpirer) {
			this.echeanceExpirer = echeanceExpirer;
		}






		@Column(name = "echeanceexpirer")
		public String getEcheanceExpirer() {
			return echeanceExpirer;
		}


    	
    	
	}

