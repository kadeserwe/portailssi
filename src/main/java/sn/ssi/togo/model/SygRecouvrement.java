package sn.ssi.togo.model;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_recouvrement")
	public class SygRecouvrement  implements Serializable {
		
  		private Long id;
  		private String natureVersement;
  		private String numCheque;
  		//private String banque;
  		private SygAppelsOffres appeloffre;
  		private SygAutoriteContractante autorite;
  		private String commentaire;
  		private String operation;
  		private BigDecimal montantVerse;//Montant verse
  		private SygBanque banque;
  		
		
		public SygRecouvrement() {
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


		@Column(name = "natureversement",  length = 10)
		public String getNatureVersement() {
			return natureVersement;
		}



		public void setNatureVersement(String natureVersement) {
			this.natureVersement = natureVersement;
		}


		
		@Column(name = "numcheque", length = 100)
		public String getNumCheque() {
			return numCheque;
		}

		


		public void setNumCheque(String numCheque) {
			this.numCheque = numCheque;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "appeloffreid")
		public SygAppelsOffres getAppeloffre() {
			return appeloffre;
		}



		public void setAppeloffre(SygAppelsOffres appeloffre) {
			this.appeloffre = appeloffre;
		}



		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "autoriteid")
		
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}



		public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}


		@Column(name = "commentaire", length = 255)
		public String getCommentaire() {
			return commentaire;
		}



		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}


		@Column(name = "operationid", length = 50)
		public String getOperation() {
			return operation;
		}



		public void setOperation(String operation) {
			this.operation = operation;
		}


		@Column(name ="montantverse")
		public BigDecimal getMontantVerse() {
			return montantVerse;
		}



		public void setMontantVerse(BigDecimal montantVerse) {
			this.montantVerse = montantVerse;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "banqueid")
		public SygBanque getBanque() {
			return banque;
		}



		public void setBanque(SygBanque banque) {
			this.banque = banque;
		}

		
		

	}

