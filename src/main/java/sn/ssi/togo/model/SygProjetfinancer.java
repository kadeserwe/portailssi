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
	@Table(name = "pmb_projetfinancer")
	public class SygProjetfinancer  implements java.io.Serializable {
		
  		private Long id;
		private String chapitre,budgetanomalie;
		private BigDecimal montant;
		private  int exercice;
		private SygRealisations realisation;
		private SygBailleurs bailleur;
	
		public SygProjetfinancer() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idprojetfinancer",  length = 10)
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

		@Column(name = "chapitre")
		public String getChapitre() {
			return chapitre;
		}
        public void setChapitre(String chapitre) {
			this.chapitre = chapitre;
		}


    	@Column(name = "exercice")
		public int getExercice() {
			return exercice;
		}
    	public void setExercice(int exercice) {
			this.exercice = exercice;
		}


    	@Column(name = "budgetanomalie")
		public String getBudgetanomalie() {
			return budgetanomalie;
		}
    	public void setBudgetanomalie(String budgetanomalie) {
			this.budgetanomalie = budgetanomalie;
		}


    	@Column(name = "montant")
		public BigDecimal getMontant() {
			return montant;
		}
		public void setMontant(BigDecimal montant) {
			this.montant = montant;
		}


		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "planpassation_id")
		public SygRealisations getRealisation() {
			return realisation;
		}      
    	public void setRealisation(SygRealisations realisation) {
			this.realisation = realisation;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
     	@JoinColumn(name = "bailleurs_id")
		public SygBailleurs getBailleur() {
			return bailleur;
		}
    	public void setBailleur(SygBailleurs bailleur) {
			this.bailleur = bailleur;
		}

	
		
	}

