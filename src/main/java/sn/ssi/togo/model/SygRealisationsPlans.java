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
import java.io.Serializable;

@SuppressWarnings("serial")
	@Entity
	@Table(name = "pmb_realisation_plans")
	public class SygRealisationsPlans  implements Serializable {
		
  		private Long id;
	    private SygRealisations realisations;
		private SygPlansdepassation plan;
		private String chapitre;
		
	
     	public SygRealisationsPlans() {
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
    	@JoinColumn(name = "plan")
     	public SygPlansdepassation getPlan() {
			return plan;
		}
    	public void setPlan(SygPlansdepassation plan) {
			this.plan = plan;
		}

   
    	@Column(name = "chapitre")
		public String getChapitre() {
			return chapitre;
		}
    	public void setChapitre(String chapitre) {
			this.chapitre = chapitre;
		}
    	
    	
    	
	}

