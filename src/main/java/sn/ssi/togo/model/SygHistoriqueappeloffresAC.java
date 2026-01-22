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
	@Table(name = "pmb_historiqueappeloffres_ac")
	public class SygHistoriqueappeloffresAC  implements java.io.Serializable {
		
  		private Long id;
		private SygDossiers dossier;
		private SygAutoriteContractante autorite;
		private String histoac_validation,histoac_commentaire,histoac_fichiervalidation,histoac_borderau,
		histo_validation,histo_commentaire,histo_fichiervalidation,daofichier;
		private Date histoac_datevalidation,histoac_datecreationdossier,histo_datevalidation;
		private int histoac_attribution,histoac_ac;
		private Utilisateur user;
		
    


		public SygHistoriqueappeloffresAC() {
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
    	@JoinColumn(name = "dosid")
    	public SygDossiers getDossier() {
			return dossier;
		}
    	public void setDossier(SygDossiers dossier) {
			this.dossier = dossier;
		}


    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "histo_ac")
		public SygAutoriteContractante getAutorite() {
			return autorite;
		}
    	public void setAutorite(SygAutoriteContractante autorite) {
			this.autorite = autorite;
		}

    	@Column(name = "histoac_validation")
    	public String getHistoac_validation() {
			return histoac_validation;
		}
    	public void setHistoac_validation(String histoac_validation) {
			this.histoac_validation = histoac_validation;
		}


    	@Column(name = "histoac_commentaire")
		public String getHistoac_commentaire() {
			return histoac_commentaire;
		}
    	public void setHistoac_commentaire(String histoac_commentaire) {
			this.histoac_commentaire = histoac_commentaire;
		}


		@Temporal(TemporalType.DATE)
    	@Column(name = "histoac_datevalidation", length = 7)
		public Date getHistoac_datevalidation() {
			return histoac_datevalidation;
		}
    	public void setHistoac_datevalidation(Date histoac_datevalidation) {
			this.histoac_datevalidation = histoac_datevalidation;
		}


    	@Temporal(TemporalType.DATE)
    	@Column(name = "histoac_datecreationdossier", length = 7)
		public void setHistoac_fichiervalidation(String histoac_fichiervalidation) {
			this.histoac_fichiervalidation = histoac_fichiervalidation;
		}
    	public Date getHistoac_datecreationdossier() {
			return histoac_datecreationdossier;
		}
    	
    	
    	
    	@Column(name = "histoac_borderau")
		public String getHistoac_borderau() {
			return histoac_borderau;
		}
    	public String getHistoac_fichiervalidation() {
			return histoac_fichiervalidation;
		}



    	@Temporal(TemporalType.DATE)
    	@Column(name = "histoac_datecreationdossier", length = 7)
		public void setHistoac_datecreationdossier(Date histoac_datecreationdossier) {
			this.histoac_datecreationdossier = histoac_datecreationdossier;
		}
 		public Date getHisto_datevalidation() {
			return histo_datevalidation;
		}


 		@Column(name = "histoac_ac")
		public void setHisto_datevalidation(Date histo_datevalidation) {
			this.histo_datevalidation = histo_datevalidation;
		}
    	public int getHistoac_ac() {
			return histoac_ac;
		}


    	@Column(name = "histoac_borderau")
		public void setHistoac_ac(int histoac_ac) {
			this.histoac_ac = histoac_ac;
		}
    	public void setHistoac_borderau(String histoac_borderau) {
			this.histoac_borderau = histoac_borderau;
		}


    	@Column(name = "histo_validation")
		public String getHisto_validation() {
			return histo_validation;
		}
    	public void setHisto_validation(String histo_validation) {
			this.histo_validation = histo_validation;
		}


    	@Column(name = "histo_commentaire")
		public String getHisto_commentaire() {
			return histo_commentaire;
		}
    	public void setHisto_commentaire(String histo_commentaire) {
			this.histo_commentaire = histo_commentaire;
		}


    	@Column(name = "histo_fichiervalidation")
		public String getHisto_fichiervalidation() {
			return histo_fichiervalidation;
		}
    	public void setHisto_fichiervalidation(String histo_fichiervalidation) {
			this.histo_fichiervalidation = histo_fichiervalidation;
		}


    	@Column(name = "daofichier")
		public String getDaofichier() {
			return daofichier;
		}
    	public void setDaofichier(String daofichier) {
			this.daofichier = daofichier;
		}


    	@Column(name = "histoac_attribution")
		public int getHistoac_attribution() {
			return histoac_attribution;
		}
    	public void setHistoac_attribution(int histoac_attribution) {
			this.histoac_attribution = histoac_attribution;
		}


    	@ManyToOne(fetch = FetchType.LAZY)
    	@JoinColumn(name = "usr")
		public Utilisateur getUser() {
			return user;
		}
    	public void setUser(Utilisateur user) {
			this.user = user;
		}

    	
    	
    	
	}

