package sn.ssi.togo.model;
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
	@Table(name = "pmb_paiement")
	public class SygPaiement  implements java.io.Serializable {
		
  		private Long id;
  		private String modepaiement;
  		private String numCheque;
  		//private String banque;
  		private String commentaire;
  		private SygFournisseur fournisseur;
  		private SygContrats contrats;
  		private String operation;
  		private SygBanque banque;
  		
		
		public SygPaiement() {
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


		@Column(name = "modepaiement",  length = 10)
		public String getModepaiement() {
			return modepaiement;
		}



		public void setModepaiement(String modepaiement) {
			this.modepaiement = modepaiement;
		}

		
		@Column(name = "numcheque", length = 100)
		public String getNumCheque() {
			return numCheque;
		}

		public void setNumCheque(String numCheque) {
			this.numCheque = numCheque;
		}


//		@Column(name = "banque", length = 100)
//		public String getBanque() {
//			return banque;
//		}
//
//
//
//		public void setBanque(String banque) {
//			this.banque = banque;
//		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "fournisseurid")
		public SygFournisseur getFournisseur() {
			return fournisseur;
		}



		public void setFournisseur(SygFournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "contratsid")
		public SygContrats getContrats() {
			return contrats;
		}

		public void setContrats(SygContrats contrats) {
			this.contrats = contrats;
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


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "banqueid")
		public SygBanque getBanque() {
			return banque;
		}



		public void setBanque(SygBanque banque) {
			this.banque = banque;
		}



		
		
		
		
		

	}

