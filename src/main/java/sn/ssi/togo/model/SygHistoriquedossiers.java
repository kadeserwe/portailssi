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
	@Table(name = "pmb_historiquedossier")
	public class SygHistoriquedossiers  implements java.io.Serializable {
		
  		private Long id;
		private SygDossiers dossier;
		private SygAppelsOffres appel;
		private String hisCommentaireRejet,hisFichierRejeter,hisBudgetAnomalie;
		private Date hisDateRejet;
			
    


		public SygHistoriquedossiers() {
		}

	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "hisid",  length = 255)
        public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	

	
		
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "dossiers_id")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "appelsoffres_id")
    	public SygAppelsOffres getAppel() {
			return appel;
		}
    	public void setAppel(SygAppelsOffres appel) {
			this.appel = appel;
		}

 
    	@Temporal(TemporalType.DATE)
    	@Column(name = "hisdaterejet", length = 7)
    	public Date getHisDateRejet() {
			return hisDateRejet;
		}
		public void setHisDateRejet(Date hisDateRejet) {
			this.hisDateRejet = hisDateRejet;
		}


		@Column(name = "hiscommentairerejet")
		public String getHisCommentaireRejet() {
			return hisCommentaireRejet;
		}

		public void setHisCommentaireRejet(String hisCommentaireRejet) {
			this.hisCommentaireRejet = hisCommentaireRejet;
		}


		@Column(name = "hisfichierrejeter")
		public String getHisFichierRejeter() {
			return hisFichierRejeter;
		}
		public void setHisFichierRejeter(String hisFichierRejeter) {
			this.hisFichierRejeter = hisFichierRejeter;
		}


		@Column(name = "hisbudgetanomalie")
		public String getHisBudgetAnomalie() {
			return hisBudgetAnomalie;
		}
		public void setHisBudgetAnomalie(String hisBudgetAnomalie) {
			this.hisBudgetAnomalie = hisBudgetAnomalie;
		}
		

  
    	
    	
    	
	}

