package sn.ssi.togo.model;
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
	@Table(name = "pmb_prix")
	public class SygPrix  implements java.io.Serializable {
		
  		private Long id;
	
		private BigDecimal prix,prixMax,prixMin;
		private String observation;
		private SygProduits produitservice;
		private Long variationVA;
		private Double variationVR;
		private int annee;
		
		private String statut;
		//private String commentaireValidation;
		private Date dateValidation;
		
		private String commentairePublication;
		private Date datePublication;
		
	
		public SygPrix() {
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


		@Column(name = "prix")
		public BigDecimal getPrix() {
			return prix;
		}



		public void setPrix(BigDecimal prix) {
			this.prix = prix;
		}


		@Column(name = "prixmax")
		public BigDecimal getPrixMax() {
			return prixMax;
		}



		public void setPrixMax(BigDecimal prixMax) {
			this.prixMax = prixMax;
		}


		@Column(name = "prixmin")
		public BigDecimal getPrixMin() {
			return prixMin;
		}



		public void setPrixMin(BigDecimal prixMin) {
			this.prixMin = prixMin;
		}


		@Column(name = "observation",  length = 255)
		public String getObservation() {
			return observation;
		}



		public void setObservation(String observation) {
			this.observation = observation;
		}


		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "produitid")
		public SygProduits getProduitservice() {
			return produitservice;
		}



		public void setProduitservice(SygProduits produitservice) {
			this.produitservice = produitservice;
		}


		@Column(name = "annee")
		public int getAnnee() {
			return annee;
		}



		public void setAnnee(int annee) {
			this.annee = annee;
		}

		@Column(name = "variationva")
		public Long getVariationVA() {
			return variationVA;
		}



		public void setVariationVA(Long variationVA) {
			this.variationVA = variationVA;
		}


		@Column(name = "variationvr")
		public Double getVariationVR() {
			return variationVR;
		}



		public void setVariationVR(Double variationVR) {
			this.variationVR = variationVR;
		}


		@Column(name = "statut", length = 8)
		public String getStatut() {
			return statut;
		}



		public void setStatut(String statut) {
			this.statut = statut;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "datevalidation", length = 7)
		public Date getDateValidation() {
			return dateValidation;
		}



		public void setDateValidation(Date dateValidation) {
			this.dateValidation = dateValidation;
		}


		@Temporal(TemporalType.DATE)
		@Column(name = "datepublication", length = 7)
		public Date getDatePublication() {
			return datePublication;
		}



		public void setDatePublication(Date datePublication) {
			this.datePublication = datePublication;
		}


		@Column(name = "commentairepublication",  length = 255)
		public String getCommentairePublication() {
			return commentairePublication;
		}



		public void setCommentairePublication(String commentairePublication) {
			this.commentairePublication = commentairePublication;
		}


		
	}

