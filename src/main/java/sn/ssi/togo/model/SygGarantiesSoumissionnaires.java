package sn.ssi.togo.model;
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
	@Table(name = "pmb_garantiesoumissions")
	public class SygGarantiesSoumissionnaires  implements java.io.Serializable {
		
  		private Long id;
		private SygPlisouvertures plis;
		private SygGarantiesDossiers garantie;
		private SygDossiers dossier;
		private String fournie,libelle,observations,libellelot;
		private BigDecimal montant;
		private SygNaturesGarantie nature;
			
		
    	public SygGarantiesSoumissionnaires() {
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

	

		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "pli_id")
    	public SygPlisouvertures getPlis() {
			return plis;
		}
    	public void setPlis(SygPlisouvertures plis) {
			this.plis = plis;
		}



    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "garantie")
    	public SygGarantiesDossiers getGarantie() {
			return garantie;
		}
		public void setGarantie(SygGarantiesDossiers garantie) {
			this.garantie = garantie;
		}



    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	@Column(name = "fournie",length=3)
		public String getFournie() {
			return fournie;
		}
    	public void setFournie(String fournie) {
			this.fournie = fournie;
		}


    	@Column(name = "libelle",length=255)
		public String getLibelle() {
			return libelle;
		}
    	public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


    	@Column(name = "montant")
		public BigDecimal getMontant() {
			return montant;
		}
		public void setMontant(BigDecimal montant) {
			this.montant = montant;
		}



		@Column(name = "observations",length=255)
		public String getObservations() {
			return observations;
		}
    	public void setObservations(String observations) {
			this.observations = observations;
		}


    	@Column(name = "libellelot",length=255)
		public String getLibellelot() {
			return libellelot;
		}
    	public void setLibellelot(String libellelot) {
			this.libellelot = libellelot;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "nature")
		public SygNaturesGarantie getNature() {
			return nature;
		}
		public void setNature(SygNaturesGarantie nature) {
			this.nature = nature;
		}



    	
    	
	}

