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
	@Table(name = "pmb_arretes")
	public class SygArretes  implements java.io.Serializable {
		
  		private Long id;  
		//private SygRealisations realisation;
		private String arretNum,arretText,arretObjet,arreteTitulaire,arreteFichier,arrlibelle;
		private SygAutoriteContractante autorite;
		private int arretPub;
		private Date datePub;
		
    	public SygArretes() {
    		super();
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 255)
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

    	@Column(name = "arretnum")
		public String getArretNum() {
			return arretNum;
		}
		public void setArretNum(String arretNum) {
			this.arretNum = arretNum;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "autorite_id")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

    	@Column(name = "arrettext")
		public String getArretText() {
			return arretText;
		}
		public void setArretText(String arretText) {
			this.arretText = arretText;
		}


		@Column(name = "arretobjet")
		public String getArretObjet() {
			return arretObjet;
		}
		public void setArretObjet(String arretObjet) {
			this.arretObjet = arretObjet;
		}
		
		
		@Column(name = "arretetitulaire")
		public String getArreteTitulaire() {
			return arreteTitulaire;
		}
		public void setArreteTitulaire(String arreteTitulaire) {
			this.arreteTitulaire = arreteTitulaire;
		}


		@Column(name = "arretpub")
		public int getArretPub() {
			return arretPub;
		}
		public void setArretPub(int arretPub) {
			this.arretPub = arretPub;
		}

		@Column(name = "arretefichier")

		public String getArreteFichier() {
			return arreteFichier;
		}

		public void setArreteFichier(String arreteFichier) {
			this.arreteFichier = arreteFichier;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "datepub")
	    public Date getDatePub() {
			return datePub;
		}
		public void setDatePub(Date datePub) {
			this.datePub = datePub;
		}


		@Column(name = "arrlibelle")
		public String getArrlibelle() {
			return arrlibelle;
		}
    	public void setArrlibelle(String arrlibelle) {
			this.arrlibelle = arrlibelle;
		}
		
		
	}

