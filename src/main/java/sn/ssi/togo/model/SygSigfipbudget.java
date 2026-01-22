package sn.ssi.togo.model;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_sigfipbudget")
	public class SygSigfipbudget  implements Serializable {
		
  		private Long id;
		private String budimputation;
		private String budchapitre,budligne;
		private BigDecimal budmontantinitial,budsolde;
		private  int budexercice;
	
		public SygSigfipbudget() {
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

	

		@Column(name = "budimputation")
		public String getBudimputation() {
			return this.budimputation;
		}

		public void setBudimputation(String budimputation) {
			this.budimputation = budimputation;
		}


		@Column(name = "budchapitre")
		public String getBudchapitre() {
			return budchapitre;
		}
        public void setBudchapitre(String budchapitre) {
			this.budchapitre = budchapitre;
		}


    	@Column(name = "budexercice")
		public int getBudexercice() {
			return budexercice;
		}
    	public void setBudexercice(int budexercice) {
			this.budexercice = budexercice;
		}


    	@Column(name = "budligne")
		public String getBudligne() {
			return budligne;
		}
    	public void setBudligne(String budligne) {
			this.budligne = budligne;
		}


    	@Column(name = "budmontantinitial")
		public BigDecimal getBudmontantinitial() {
			return budmontantinitial;
		}
		public void setBudmontantinitial(BigDecimal budmontantinitial) {
			this.budmontantinitial = budmontantinitial;
		}


		@Column(name = "budsolde")
		public BigDecimal getBudsolde() {
			return budsolde;
		}
    	public void setBudsolde(BigDecimal budsolde) {
			this.budsolde = budsolde;
		}


		
		
	}

