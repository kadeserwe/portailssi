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
	@Table(name = "pmb_evaluateursdossier")
public class SygDossiersEvaluateurs implements java.io.Serializable {
     
		private Long id;
		private String commission;
		private SygDossiers dossier;
		private SygMembresCommissionsMarches membre;
		private Date Dateremise,Datelimite;	
		
		

		

		public SygDossiersEvaluateurs(){
		}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id",  length = 10)
		public Long getId() {
			return id;
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



		
		@Column(name = "commission",  length = 50)
		public String getCommission() {
			return commission;
		}

		public void setCommission(String commission) {
			this.commission = commission;
		}

		
		@ManyToOne(fetch = FetchType.EAGER)
	 	@JoinColumn(name = "comm_id")
		public SygMembresCommissionsMarches getMembre() {
			return membre;
		}
		public void setMembre(SygMembresCommissionsMarches membre) {
			this.membre = membre;
		}
		
    	@Temporal(TemporalType.DATE)
    	@Column(name = "dateremise", length = 7)
    	public Date getDateremise() {
			return Dateremise;
		}
		public void setDateremise(Date dateremise) {
			Dateremise = dateremise;
		}

		@Temporal(TemporalType.DATE)
    	@Column(name = "datelimite", length = 7)
    	public Date getDatelimite() {
			return Datelimite;
		}
    	public void setDatelimite(Date datelimite) {
			Datelimite = datelimite;
		}

}
