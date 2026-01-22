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
	@Table(name = "pmb_realisation_bailleurs")
	public class SygRealisationsBailleurs  implements Serializable {
		
  		private Long id;
	    private SygRealisations realisations;
		private SygBailleurs bailleurs;
		private BigDecimal montant;
		private String chapitre;
		
	
     	public SygRealisationsBailleurs() {
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
    	@JoinColumn(name = "realisation")
    	public SygRealisations getRealisations() {
			return realisations;
		}
        public void setRealisations(SygRealisations realisations) {
			this.realisations = realisations;
		}


        @ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "bailleurs")
		public SygBailleurs getBailleurs() {
			return bailleurs;
		}
    	public void setBailleurs(SygBailleurs bailleurs) {
			this.bailleurs = bailleurs;
		}

    	@Column(name = "montant")
    	public BigDecimal getMontant() {
			return montant;
		}
    	public void setMontant(BigDecimal montant) {
			this.montant = montant;
		}


    	@Column(name = "chapitre")
		public String getChapitre() {
			return chapitre;
		}
    	public void setChapitre(String chapitre) {
			this.chapitre = chapitre;
		}
    	
    	
    	
	}

